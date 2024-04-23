package stepDefinitions;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import pages.WikipediaHomePage;
import pages.WikipediaLoginPage;
import utils.DriverFactory;
public class LoginPageSteps {

    WebDriver driver = DriverFactory.getDriver();
    WikipediaHomePage pg = new WikipediaHomePage(driver);
    WikipediaLoginPage loginpage =new WikipediaLoginPage(driver);

    @When("Check Login Button")
    public void check_login_button() {
        loginpage.kontrol();
    }
    @When("Click Login Button")
    public void click_login_button() {
        loginpage.tikla();
    }
    @When("Click Login")
    public void click_login() {
       loginpage.loginol();
    }

    @Then("check LoginPage")
    public void check_login_page() {
       loginpage.cikisikontrol();
    }

    @Then("check Error Message")
    public void checkErrorMessage() {
        loginpage.checkErrorMessage();
    }

    @When("Write Valid UserName {string}")
    public void writeValidUserName(String validUsername) {
        loginpage.validUserNameYaz(validUsername);
    }

    @When("Write ValidPassword {string}")
    public void writeValidPassword(String userName) {
        loginpage.validPasswordYaz(userName);
    }

    @When("Write InValidPassword {string}")
    public void writeInPassword(String invalidPassword) {
        loginpage.invalidPasswordYaz(invalidPassword);
    }

    @When("Write Invalid UserName {string}")
    public void writeInvalidUserName(String invalidUserName) {
        loginpage.invalidUserNameYaz(invalidUserName);
    }
}
