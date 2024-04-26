package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.ElementHelper;

import java.time.Duration;

public class LoginPage {
    static WebDriver driver;
    static ElementHelper elementHelper;
    WebDriverWait wait;

    static By loginButton = By.id("pt-login-2");
    static By inputUserName =By.id("wpName1");
    static By inputPassword = By.id("wpPassword1");
    static By loginpageloginbutton =By.id("wpLoginAttempt");
    static By logoutCheckbox =By.id("vector-user-links-dropdown-checkbox");
    static By errorMessage =By.xpath("//div[@class=\"cdx-message__content\"]");

    public LoginPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(20000));
        this.elementHelper = new ElementHelper(driver);

    }
    public void tikla(){
        elementHelper.click(loginButton);
    }
    public void kontrol(){
        elementHelper.checkElement(loginButton);
    }
    public void userNameYaz(String userName){
        elementHelper.writeToElement(inputUserName,userName);
    }
    public void passwordYaz(String validPassword){elementHelper.writeToElement(inputPassword,validPassword);}
    public void loginol(){
        elementHelper.click(loginpageloginbutton);
    }
    public void cikisikontrol(){
        elementHelper.checkElement(logoutCheckbox);
    }

    public void checkErrorMessage(){
        elementHelper.checkText(errorMessage,"Incorrect username or password entered. Please try again.");
    }
}
