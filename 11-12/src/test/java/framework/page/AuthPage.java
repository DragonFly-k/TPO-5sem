package framework.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AuthPage extends AbstractPage {

    protected AbstractPage openPage() {
        return null;
    }

    public AuthPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath ="/html/body/div/div/div/div[1]/div[4]/div[2]/div/div/div[2]/div[3]/div/div/form/div[1]/div/div[2]/div/div[1]/div/input" )
    private WebElement phoneField;
    @FindBy(xpath ="/html/body/div/div/div/div[1]/div[4]/div[2]/div/div/div[2]/div[3]/div/div/form/div[2]/div/div[2]/div/div/div[1]/input" )
    private WebElement passwordField;
    @FindBy(xpath ="//*[@id=\"app\"]/div/div[4]/div[2]/div/div/div[2]/div[3]/div/div/form/div[4]/div/button")
    private WebElement authButton;

    @FindBy(xpath = "//*[@id=\"header-top\"]/div[1]/div/div[2]/a")
    WebElement womenPage;
    @FindBy(xpath = "//*[@id=\"header-top\"]/div[3]/a[1]/span/div")
    WebElement basketPage;

    @FindBy(xpath = " //*[@id=\"app\"]/div/div[4]/div[2]/div/div/div[3]/div/div[1]/div/div/div/div/div[2]/div/a[2]")
    WebElement orderPage;
    @FindBy(xpath = "//*[@id=\"app\"]/div/div[4]/div[2]/div/div/div[3]/div/div[2]/div/div/div/div/div[1]/div[1]/div[1]/div[2]/img")
    WebElement deleteItem;
    @FindBy(xpath = "//*[@id=\"app\"]/div[3]/div/div/div[2]/button[1]/span")
    WebElement yesDelete;

    public void auth(String phone, String password)throws InterruptedException {
        Thread.sleep(1000);
        phoneField.sendKeys(phone);
        Thread.sleep(1000);
        passwordField.sendKeys(password);
        Thread.sleep(1000);
        authButton.click();
    }

    public void delOrder() throws InterruptedException {
        Thread.sleep(1000);
        orderPage.click();
        Thread.sleep(1000);
        deleteItem.click();
        Thread.sleep(1000);
        yesDelete.click();
    }

    public WomenPage openWomenPage() throws InterruptedException {
        Thread.sleep(1000);
        womenPage.click();
        return new WomenPage(driver);
    }

    public BasketPage openBasketPage() throws InterruptedException {
        Thread.sleep(1000);
        basketPage.click();
        return new BasketPage(driver);
    }
}
