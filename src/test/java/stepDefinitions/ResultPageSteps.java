package stepDefinitions;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import pages.SearchResultPage;
import utils.DriverFactory;

public class ResultPageSteps {
    WebDriver driver = DriverFactory.getDriver();
    SearchResultPage resultPage =new SearchResultPage(driver);

    @When("Click  search Button")
    public void click_search_button() {
        resultPage.clickSearchButton();
    }

    @When("Write {string} to search input")
    public void writeToSearchInput(String searchItem) {
        resultPage.searchSomeValue(searchItem);
    }
    @Then("Check {string} text")
    public void checkText(String text) {
        resultPage.checkSearchResult(text);
    }
}
