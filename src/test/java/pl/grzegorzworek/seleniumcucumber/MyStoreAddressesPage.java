package pl.grzegorzworek.seleniumcucumber;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class MyStoreAddressesPage {
    @FindBy(css = ".addresses-footer > a")
    private WebElement addAddressLink;

    @FindBy(css = "#notifications > div > article > ul > li")
    private WebElement confirmAddAddressInfo;

    @FindBy(xpath="//*[@class=\"address\"]/div/h4")
    private List<WebElement> allAddedAddressAlias;

    @FindBy(xpath="//*[@class=\"address\"]/div/address")
    private List<WebElement> allAddedAddressAddress;

    public MyStoreAddressesPage(WebDriver driver){
        PageFactory.initElements(driver, this);
    }

    public void AddressClick (){
        addAddressLink.click();
    }

    public String GetAddInformation(){
        return confirmAddAddressInfo.getText();
    }

    public void CheckCorrectAddedLastAddress(String alias, String address, String city, String postcode, String country, String phone) {
        Assert.assertEquals(allAddedAddressAlias.get(allAddedAddressAlias.size()-1).getText(),alias);
        String addressAdded = allAddedAddressAddress.get(allAddedAddressAddress.size()-1).getText();
        String[] wordsAddressAdded = addressAdded.split("\n");
        Assert.assertEquals(wordsAddressAdded[1], address);
        Assert.assertEquals(wordsAddressAdded[2], city);
        Assert.assertEquals(wordsAddressAdded[3], postcode);
        Assert.assertEquals(wordsAddressAdded[4], country);
        Assert.assertEquals(wordsAddressAdded[5], phone);
    }
}
