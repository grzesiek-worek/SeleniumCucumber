package pl.grzegorzworek.seleniumcucumber;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class MyStoreAddAddressSteps {
    private WebDriver driver;

    @Given("User is logged in to MyStore {string}")
    public void user_is_logged_in_to_my_store(String pageUrl) {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        this.driver = new ChromeDriver();
        this.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(16));
        this.driver.get(pageUrl);

        MyStoreLoginPage myStoreLoginPage = new MyStoreLoginPage(driver);
        myStoreLoginPage.LoginAs("aaa@aa.pl","aaaaaa");
    }

    @When("User click on Addresses and goes to {string}")
    public void user_click_on_addresses_and_goes_to(String string) {
        MyStoreAccountPage myStoreAccountPage = new MyStoreAccountPage(driver);
        myStoreAccountPage.AddressClick();
    }
}
