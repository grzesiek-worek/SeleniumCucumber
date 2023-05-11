package pl.grzegorzworek.seleniumcucumber;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyStoreCartPage {
    @FindBy(css="#main > div > div > div > div > div > a")
    private WebElement goToCheckoutButton;

    public MyStoreCartPage(WebDriver driver){
        PageFactory.initElements(driver, this);
    }

    public void goToCheckout () {
        goToCheckoutButton.click();
    }
}
