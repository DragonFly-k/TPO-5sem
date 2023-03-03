package pageobject_model.test;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import pageobject_model.page.HomePage;
import pageobject_model.page.CatalogPage;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestMegatopWebsite {

    private WebDriver driver;

    @BeforeEach
    public void setUp() throws Exception {
        driver = new EdgeDriver();
    }

    @Test
    public void SearchByRequest() throws InterruptedException {
        var homePage = new HomePage(driver);
        homePage.OpenPage();
        homePage.EnterSearchQuery("челси");
        Thread.sleep(5000);
    }

    @Test
    public void CheckFilterPrice() throws InterruptedException {
        var catalogPage = new CatalogPage(driver);
        catalogPage.OpenPage();
        catalogPage.PriceBetween100_150();
        Thread.sleep(5000);
    }

    @AfterEach
    public void tearDown() throws Exception {
        driver.quit();
    }
}
