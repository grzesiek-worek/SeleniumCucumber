package pl.grzegorzworek.seleniumcucumber;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyStoreSearchResultsPage {
    @FindBy(css="#js-product-list > div> div > article > div > div > a")
    private WebElement productSearchResult;

    public MyStoreSearchResultsPage(WebDriver driver){
        PageFactory.initElements(driver, this);
    }

    public void productSearchResultClick(){
        productSearchResult.click();
    }
}
