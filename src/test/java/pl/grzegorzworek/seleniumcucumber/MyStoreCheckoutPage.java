package pl.grzegorzworek.seleniumcucumber;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyStoreCheckoutPage {
    @FindBy(css="#checkout-addresses-step > div > div > form > div > button")
    private WebElement confirmAddressButton;

    public MyStoreCheckoutPage(WebDriver driver){
        PageFactory.initElements(driver, this);
    }

    public void confirmAddress() {
        confirmAddressButton.click();
    }
}
