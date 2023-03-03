package framework.test;

import framework.driver.DriverSingleton;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import framework.page.*;
import framework.util.TestListener;

import static framework.driver.DriverSingleton.closeDriver;

@Listeners({TestListener.class})
public class CommonConditions {
    protected WebDriver driver;

    protected MainPage mainPage;

    @BeforeMethod()
    public void setUp() {
        driver = DriverSingleton.getDriver();
    }

    @AfterMethod(alwaysRun = true)
    public void stopBrowser() throws InterruptedException {
        closeDriver();
    }
}
