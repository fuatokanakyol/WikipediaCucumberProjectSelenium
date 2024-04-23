package stepDefinitions;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import pages.WikipediaHomePage;
import utils.DriverFactory;

public class HomePageSteps {
    WebDriver driver = DriverFactory.getDriver();
    WikipediaHomePage pg = new WikipediaHomePage(driver);

    @When("Click Logo")
    public void clickLogo() {
        pg.clickLogo();
    }
    @Then("check logo")
    public void checkLogo() {
        pg.controlLogo();
    }
}
