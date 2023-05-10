package pl.grzegorzworek.seleniumcucumber;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyStoreAccountPage {

    @FindBy(id = "addresses-link")
    private WebElement addressesButton;

    @FindBy(name="s")
    private WebElement searchInput;

    public MyStoreAccountPage(WebDriver driver){
        PageFactory.initElements(driver, this);
    }

    public void AddressClick (){
        addressesButton.click();
    }

    public void SearchInputClick (String nameProduct) {
        searchInput.sendKeys(nameProduct);
        searchInput.submit();
    }
}
