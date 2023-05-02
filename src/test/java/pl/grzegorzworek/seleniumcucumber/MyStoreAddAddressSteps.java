package pl.grzegorzworek.seleniumcucumber;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
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

    @When("Click on {string}")
    public void click_on_create_new_address(String string) {
        MyStoreAddressesPage myStoreAddressesPage = new MyStoreAddressesPage(driver);
        myStoreAddressesPage.AddressClick();
    }

    @When("Fill form New Address: {string}, {string}, {string}, {string}, {string}, {string}")
    public void fill_form_new_address(String alias, String address, String city, String postcode, String country, String phone) {
        MyStoreAddAddressPage myStoreAddAddressPage = new MyStoreAddAddressPage(driver);
        myStoreAddAddressPage.AddAddress(alias, address, city, postcode, country, phone);
    }

    @Then("Check whether the data in the added address are correct")
    public void check_whether_the_data_in_the_added_address_are_correct() {
        MyStoreAddressesPage myStoreAddressesPage = new MyStoreAddressesPage(driver);
        Assert.assertEquals("Address successfully added!", myStoreAddressesPage.getAddInformation());
    }

    @Then("Close browser")
    public void closeBrowser() {
        driver.quit();
    }
}
