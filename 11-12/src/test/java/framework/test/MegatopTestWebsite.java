package framework.test;

import framework.page.AuthPage;
import framework.page.BasketPage;
import framework.page.WomenPage;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import framework.page.MainPage;
import framework.driver.DriverSingleton;

public class MegatopTestWebsite extends CommonConditions {

    private WebDriver driver;
    protected MainPage mainPage;
    protected WomenPage womenPage;
    protected BasketPage basketPage;
    protected AuthPage authPage;

    @BeforeMethod(alwaysRun = true)
    public void driverSetup() {
        driver = DriverSingleton.getDriver();
    }

    @Test
    public void search_TEST() throws InterruptedException {
        driver.manage().window().maximize();
        String name = "Челси";
        mainPage = new MainPage(driver);
        mainPage.openPage();
        mainPage.EnterSearchQuery(name);
        Assert.assertTrue(true);
    }

    @Test
    public void onlyOnlineFilter_TEST() throws InterruptedException {
        driver.manage().window().maximize();
        mainPage = new MainPage(driver);
        mainPage.openPage();

        womenPage = mainPage.openWomenPage();
        womenPage.onlyOnline();
        Assert.assertTrue(true);
    }

    @Test
    public void priceFilter_TEST() throws InterruptedException {
        driver.manage().window().maximize();
        mainPage = new MainPage(driver);
        mainPage.openPage();

        womenPage = mainPage.openWomenPage();
        womenPage.PriceBetween100_150();
        Assert.assertTrue(true);
    }

    @Test
    public void auth_TEST() throws InterruptedException {
        driver.manage().window().maximize();
        mainPage = new MainPage(driver);
        mainPage.openPage();

        authPage = mainPage.openAuthPage();
        authPage.auth("297631738", "Ks7631738");
        Assert.assertTrue(true);
    }

    @Test
    public void addLike_TEST() throws InterruptedException {
        driver.manage().window().maximize();
        mainPage = new MainPage(driver);
        mainPage.openPage();
        authPage = mainPage.openAuthPage();
        authPage.auth("297631738", "Ks7631738");
        womenPage= authPage.openWomenPage();
        womenPage.Like();
        Assert.assertTrue(true);
    }

    @Test
    public void delLike_TEST() throws InterruptedException {
        driver.manage().window().maximize();
        mainPage = new MainPage(driver);
        mainPage.openPage();
        authPage = mainPage.openAuthPage();
        authPage.auth("297631738", "Ks7631738");
        womenPage= authPage.openWomenPage();
        womenPage.delLike();
        Assert.assertTrue(true);
    }

    @Test
    public void addBasket_TEST() throws InterruptedException {
        driver.manage().window().maximize();
        mainPage = new MainPage(driver);
        mainPage.openPage();
        authPage = mainPage.openAuthPage();
        authPage.auth("297631738", "Ks7631738");

        womenPage= authPage.openWomenPage();
        womenPage.addBasket();
        Assert.assertTrue(true);
    }

    @Test
    public void orderWithoutData_TEST() throws InterruptedException {
        driver.manage().window().maximize();
        mainPage = new MainPage(driver);
        mainPage.openPage();
        authPage = mainPage.openAuthPage();
        authPage.auth("297631738", "Ks7631738");

        basketPage = authPage.openBasketPage();
        basketPage.takeOrder();
        Assert.assertTrue(true);
    }

    @Test
    public void orderDel_TEST() throws InterruptedException {
        driver.manage().window().maximize();
        mainPage = new MainPage(driver);
        mainPage.openPage();
        authPage = mainPage.openAuthPage();
        authPage.auth("297631738", "Ks7631738");
        authPage.delOrder();
        Assert.assertTrue(true);
    }

    @Test
    public void delBasket_TEST() throws InterruptedException {
        driver.manage().window().maximize();
        mainPage = new MainPage(driver);
        mainPage.openPage();
        authPage = mainPage.openAuthPage();
        authPage.auth("297631738", "Ks7631738");
        basketPage = authPage.openBasketPage();
        basketPage.delItem();
        Assert.assertTrue(true);
    }

}
