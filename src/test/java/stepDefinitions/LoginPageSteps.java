package stepDefinitions;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import pages.LoginPage;
import utils.DriverFactory;
public class LoginPageSteps {

    WebDriver driver = DriverFactory.getDriver();
    LoginPage loginpage =new LoginPage(driver);

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



    @When("Write UserName {string}")
    public void writeUserName(String username) {
        loginpage.userNameYaz(username);
    }

    @When("Write Password {string}")
    public void writePassword(String password) {loginpage.passwordYaz(password);
    }
}
