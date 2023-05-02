package pl.grzegorzworek.seleniumcucumber;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyStoreAddressesPage {
    @FindBy(css = ".addresses-footer > a")
    private WebElement addAddressLink;


    public MyStoreAddressesPage(WebDriver driver){
        PageFactory.initElements(driver, this);
    }

    public void AddressClick (){
        addAddressLink.click();
    }
}
