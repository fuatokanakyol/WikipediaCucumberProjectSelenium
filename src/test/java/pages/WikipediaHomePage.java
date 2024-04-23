package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.ElementHelper;
import java.time.Duration;

public class WikipediaHomePage {
    static WebDriver driver;
    static ElementHelper elementHelper;
    WebDriverWait wait;

    static By logo = By.xpath("//div[@id='p-vector-user-menu-overflow']//span[.='Create account']");
    static By header =By.id("firstHeading");

    public WikipediaHomePage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(20000));
        this.elementHelper = new ElementHelper(driver);
    }
    public void clickLogo(){
        elementHelper.click(logo);
    }
    public void controlLogo(){
        elementHelper.checkElement(header);
    }
}

