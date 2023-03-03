package framework.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BasketPage extends AbstractPage {

    protected AbstractPage openPage() {
        return null;
    }

    public BasketPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "/html/body/div[1]/div/div/div/div[6]/div/div/div[3]/div/div/div/div[7]/button/span")
    WebElement takeOrderButton;
    @FindBy(xpath = "/html/body/div[1]/div/div/div[1]/div[6]/div/div/div[2]/div[2]/div/div[3]/button[1]")
    WebElement deleteItem;

    public void takeOrder() throws InterruptedException {
        Thread.sleep(1000);
        takeOrderButton.click();
    }

    public void delItem() throws InterruptedException {
        Thread.sleep(1000);
        deleteItem.click();
    }
}

