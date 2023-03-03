package pageobject_model.page;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class CatalogPage {

    public CatalogPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    WebDriver driver;
    @FindBy(xpath = "//*[@id=\"catalog\"]/div[1]/div[1]/a/div")
    WebElement catalogPage;

    @FindBy(xpath = "//*[@id=\"filter-price\"]/button/span/span")
    WebElement filterPrice;

    @FindBy(xpath = "//*[@id=\"filter-price\"]/div[2]/div/div[1]/div[2]/div/div/div/div/div/div[2]")
    WebElement rangePrice;

    @FindBy(xpath = "//*[@id=\"filter-price\"]/div[2]/div/div[2]/button/span/span")
    WebElement applyPrice;

    public CatalogPage OpenPage() {
        driver.get("https://megatop.by/");
        return this;
    }

    public CatalogPage PriceBetween100_150() {
        Actions builder = new Actions(driver);
        new WebDriverWait(driver, Duration.ofSeconds(5))
                .until(ExpectedConditions.visibilityOf(catalogPage));
        builder.moveToElement(catalogPage).click().build().perform();
        new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(filterPrice));
        builder.moveToElement(filterPrice).click().build().perform();
        new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(rangePrice));
        builder.moveToElement(rangePrice).click().build().perform();
        new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(applyPrice));
        builder.moveToElement(applyPrice).click().build().perform();
        return this;
    }
}