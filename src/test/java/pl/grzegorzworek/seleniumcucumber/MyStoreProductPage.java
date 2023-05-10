package pl.grzegorzworek.seleniumcucumber;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyStoreProductPage {
    @FindBy(css="#group_1")
    private WebElement productSizeSelect;

    public MyStoreProductPage(WebDriver driver){
        PageFactory.initElements(driver, this);
    }

    public void productSizeChoose (String sizeProduct) {
        productSizeSelect.sendKeys(sizeProduct);
    }
}
