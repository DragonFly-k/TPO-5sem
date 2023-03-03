package framework.page;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class MainPage extends AbstractPage {
    private static final String HOMEPAGE_URL = "https://megatop.by/";

    @FindBy(xpath ="//*[@id=\"header-top\"]/div[5]/div/div/button" )
    private WebElement searchIcon;
    @FindBy(xpath ="//div[@class='search v-card v-card--flat v-sheet theme--light']/../..//input[@type='text']" )
    private WebElement searchField;

    @FindBy(xpath ="//*[@id=\"header-top\"]/div[5]/div/div/a[3]/span/div")
    private WebElement authPage;

    @FindBy(xpath = "//*[@id=\"catalog\"]/div[1]/div[1]/a/div")
    WebElement womenPage;

    public MainPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    @Override
    public MainPage openPage() {
        driver.get(HOMEPAGE_URL);
        return this;
    }

    public MainPage EnterSearchQuery(String text)throws InterruptedException
    {
        Thread.sleep(1000);
        searchIcon.click();
        Thread.sleep(1000);
        searchField.sendKeys(text);
        Thread.sleep(1000);
        searchField.sendKeys(Keys.ENTER);
        return new MainPage(driver);
    }

    public WomenPage openWomenPage() throws InterruptedException {
        Thread.sleep(1000);
        womenPage.click();
        return new WomenPage(driver);
    }

    public AuthPage openAuthPage() throws InterruptedException {
        Thread.sleep(1000);
        authPage.click();
        return new AuthPage(driver);
    }
}

