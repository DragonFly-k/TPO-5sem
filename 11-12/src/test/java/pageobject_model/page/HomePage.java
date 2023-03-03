package pageobject_model.page;


import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class HomePage {

    public HomePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    WebDriver driver;
    @FindBy(xpath ="//*[@id=\"header-top\"]/div[5]/div/div/button" )
    WebElement SearchIcon;

    @FindBy(xpath ="//div[@class='search v-card v-card--flat v-sheet theme--light']/../..//input[@type='text']" )
    WebElement SearchField;

    public HomePage OpenPage()
    {
        driver.get("https://megatop.by/");
        return this;
    }

    public HomePage EnterSearchQuery(String text)
    {
        Actions builder=new Actions(driver);
        new WebDriverWait(driver, Duration.ofSeconds(5))
                .until(ExpectedConditions.visibilityOf(SearchIcon));
        builder.moveToElement(SearchIcon).click().build().perform();
        new WebDriverWait(driver, Duration.ofSeconds(5))
                .until(ExpectedConditions.visibilityOf(SearchField));
        builder.moveToElement(SearchField).sendKeys(text).build().perform();
        builder.moveToElement(SearchField).sendKeys(Keys.ENTER).build().perform();
        return this;
    }
}
