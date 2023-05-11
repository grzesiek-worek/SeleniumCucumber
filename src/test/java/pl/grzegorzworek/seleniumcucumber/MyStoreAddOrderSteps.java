package pl.grzegorzworek.seleniumcucumber;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.Duration;
import java.time.LocalDateTime;

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

    @When("Choose {string} size, {int} pieces and add to cart")
    public void choose_size_pieces_and_add_to_cart(String sizeProduct, Integer piecesProduct) {
        MyStoreProductPage myStoreProductPage = new MyStoreProductPage(driver);
        myStoreProductPage.productSizeChoose(sizeProduct);
        myStoreProductPage.productPiecesChoose(piecesProduct);
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

    @When("Choose a payment option - {string}")
    public void choose_a_payment_option(String string) {
        MyStoreCheckoutPage myStoreCheckoutPage = new MyStoreCheckoutPage(driver);
        myStoreCheckoutPage.ChoosePayMethod();
    }

    @Then("Click on - order with an obligation to pay")
    public void click_on_order_with_an_obligation_to_pay() {
        MyStoreCheckoutPage myStoreCheckoutPage = new MyStoreCheckoutPage(driver);
        myStoreCheckoutPage.AgreeTermsAndOrder();
    }

    @Then("Take screenshot of the order confirmation and amount")
    public void take_screenshot_of_the_order_confirmation_and_amount() throws IOException {
        File tmpScreenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        String currentDateTime = LocalDateTime.now().toString().replaceAll(":", "_");
        Files.copy(tmpScreenshot.toPath(), Paths.get("D:","_git", "test-evidence", "mystore-order-"+currentDateTime+".png"));
    }

    @Then("Close  browser")
    public void close_browser() {
        driver.quit();
    }
}
