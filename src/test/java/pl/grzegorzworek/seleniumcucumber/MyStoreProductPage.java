package pl.grzegorzworek.seleniumcucumber;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.sql.Time;
import java.util.concurrent.TimeUnit;

public class MyStoreProductPage {
    @FindBy(css="#group_1")
    private WebElement productSizeSelect;

    @FindBy(css = "#quantity_wanted")
    private WebElement productPiecesInput;

    public MyStoreProductPage(WebDriver driver){
        PageFactory.initElements(driver, this);
    }

    public void productSizeChoose (String sizeProduct) {
        productSizeSelect.sendKeys(sizeProduct);
     }

    public void productPiecesChoose (int piecesProduct) {
        productPiecesInput.clear();
        productPiecesInput.sendKeys(Integer.toString(piecesProduct));
    }
}
