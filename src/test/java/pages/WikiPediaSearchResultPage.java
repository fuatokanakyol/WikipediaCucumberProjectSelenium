package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.ElementHelper;

import java.time.Duration;

public class WikiPediaSearchResultPage {
    static WebDriver driver;
    static ElementHelper elementHelper;
    WebDriverWait wait;

    static By searc_input = By.id("searchInput");
    static By search_Button=By.xpath("//button[@class=\"cdx-button cdx-button--action-default cdx-button--weight-normal cdx-button--size-medium cdx-button--framed cdx-search-input__end-button\"]");
    static By searhResultInfo=By.id("firstHeading");

    public WikiPediaSearchResultPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(20000));
        this.elementHelper = new ElementHelper(driver);
    }
    public void searchSomeValue(String searchItem){
        elementHelper.writeToElement(searc_input,searchItem);
    }
    public void clickSearchButton(){
        elementHelper.click(search_Button);
    }
    public void checkSearchResult(String text){
        elementHelper.checkElement(searhResultInfo);
        elementHelper.checkText(searhResultInfo,text);
    }
}
