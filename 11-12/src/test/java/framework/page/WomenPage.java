package framework.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pageobject_model.page.CatalogPage;

import java.time.Duration;

public class WomenPage extends AbstractPage {

    protected AbstractPage openPage() {
        return null;
    }

    public WomenPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//*[@id=\"filter-price\"]/button")
    WebElement filterPrice;
    @FindBy(xpath = "//*[@id=\"filter-price\"]/div[2]/div/div[1]/div[2]/div/div/div/div/div/div[2]")
    WebElement rangePrice;
    @FindBy(xpath = "//*[@id=\"filter-price\"]/div[2]/div/div[2]/button/span/span")
    WebElement applyPrice;

    @FindBy(xpath = "/html/body/div[1]/div/div/div/div[6]/div[2]/div/div[4]/div[2]/div/div[2]/div/div[2]/div/div/div[1]/button[1]")
    WebElement likeButton;
    @FindBy(xpath = "//*[@id=\"header-top\"]/div[5]/div/div/a[2]/span/div")
    WebElement liked;
    @FindBy(xpath = "//*[@id=\"app\"]/div/div[4]/div[2]/div/div/div[3]/div/div[2]/div/div/div/div/div/div/div/div[1]/button")
    WebElement dislike;

    @FindBy(xpath = "//*[@id=\"app\"]/div/div[6]/div[2]/div/div[4]/div[2]/div/div[2]/div/div[2]/div/div/div[1]/button[2]")
    WebElement addBasket;
    @FindBy(xpath = "//*[@id=\"app\"]/div[3]/div/div/div/div[1]/div[2]/div/div")
    WebElement size;
    @FindBy(xpath = "//*[@id=\"app\"]/div[3]/div/div/div/div[2]/button")
    WebElement addSize;

    @FindBy(xpath = "/html/body/div[1]/div/div/div/div[6]/div[2]/div/div[4]/div[2]/div/div[1]/div/div[2]/div/div/div/div/label/div")
    WebElement filter;

    public void PriceBetween100_150() throws InterruptedException {
        Thread.sleep(1000);
        filterPrice.click();
        Thread.sleep(1000);
        rangePrice.click();
        Thread.sleep(1000);
        applyPrice.click();
    }

    public void Like() throws InterruptedException {
        Thread.sleep(1000);
        likeButton.click();
        Thread.sleep(1000);
        liked.click();
    }

    public void delLike() throws InterruptedException {
        Thread.sleep(1000);
        liked.click();
        Thread.sleep(1000);
        dislike.click();
    }

    public void addBasket() throws InterruptedException {
        Thread.sleep(1000);
        addBasket.click();
        Thread.sleep(1000);
        size.click();
        Thread.sleep(1000);
        addSize.click();
    }

    public void onlyOnline() throws InterruptedException {
        Thread.sleep(5000);
        filter.click();
    }
}

