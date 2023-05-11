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

    @When("Choose {int} pieces")
    public void choose_pieces(int piecesProduct) {
        MyStoreProductPage myStoreProductPage = new MyStoreProductPage(driver);
        myStoreProductPage.productPiecesChoose(piecesProduct);
    }

    @When("Add to cart")
    public void add_to_cart() {
        MyStoreProductPage myStoreProductPage = new MyStoreProductPage(driver);
        myStoreProductPage.productAddToCart();
        myStoreProductPage.productModalCheckout();
    }

    @When("Go to options {string}")
    public void go_to_options(String string) {
        MyStoreCartPage myStoreCartPage = new MyStoreCartPage(driver);
        myStoreCartPage.goToCheckout();
    }

    @When("Confirm address")
    public void confirm_address() {
        MyStoreCheckoutPage myStoreCheckoutPage = new MyStoreCheckoutPage(driver);
        myStoreCheckoutPage.confirmAddress();
    }

    @When("Select a pickup method - PrestaShop {string}")
    public void select_a_pickup_method_presta_shop(String string) {
        MyStoreCheckoutPage myStoreCheckoutPage = new MyStoreCheckoutPage(driver);
        myStoreCheckoutPage.chooseDeliveryPickUp();
    }
}
