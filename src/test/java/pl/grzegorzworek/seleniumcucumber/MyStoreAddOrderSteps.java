package pl.grzegorzworek.seleniumcucumber;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class MyStoreAddOrderSteps {
    private WebDriver driver;

    @Given("User is logged in to MyStore  {string}")
    public void user_is_logged_in_to_my_store(String pageUrl) {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        this.driver = new ChromeDriver();
        this.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(16));
        this.driver.get(pageUrl);

        MyStoreLoginPage myStoreLoginPage = new MyStoreLoginPage(driver);
        myStoreLoginPage.LoginAs("aaa@aa.pl","aaaaaa");
    }

    @When("User choose to buy {string}")
    public void user_choose_to_buy(String product) {
        MyStoreAccountPage myStoreAccountPage = new MyStoreAccountPage(driver);
        myStoreAccountPage.SearchInputClick(product);
        MyStoreSearchResultsPage myStoreSearchResultsPage = new MyStoreSearchResultsPage(driver);
        myStoreSearchResultsPage.productSearchResultClick();
    }

    @When("Choose {string} size")
    public void choose_size(String sizeProduct) {
        MyStoreProductPage myStoreProductPage = new MyStoreProductPage(driver);
        myStoreProductPage.productSizeChoose(sizeProduct);

    }
}
