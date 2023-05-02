package pl.grzegorzworek.seleniumcucumber;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/cucumber/features/mystore.add.address.feature",
        plugin = {"pretty","html:out"})

public class MyStoreAddAddressTest {
}
