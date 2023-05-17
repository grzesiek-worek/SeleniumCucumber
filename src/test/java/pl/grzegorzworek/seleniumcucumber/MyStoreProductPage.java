package pl.grzegorzworek.seleniumcucumber;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyStoreProductPage {
    @FindBy(css="#group_1")
    private WebElement productSizeSelect;

    @FindBy(css = "#quantity_wanted")
    private WebElement productPiecesInput;

    //with try second version
    @FindBy(xpath="//*[@id=\"add-to-cart-or-refresh\"]/div/div/div/div/span/button")
    private WebElement productPieceAddButton;

    @FindBy(css="#add-to-cart-or-refresh > div > div > div > button")
    private WebElement addToCartButton;

    @FindBy(css="#blockcart-modal > div > div > div > div > div > div > div > a")
    private WebElement goToCheckoutModalButton;

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

    public void productPiecesChoose2 (int piecesProduct) {
        for (int i = 1; i < piecesProduct; i++) {
            productPieceAddButton.click();
        }
    }

    public void productAddToCart() {

        addToCartButton.click();
    }

    public void productModalCheckout() {
        goToCheckoutModalButton.click();
    }
}
