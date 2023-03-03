package framework.driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class DriverSingleton {

    private static WebDriver driver;

    private DriverSingleton(){}

    public static WebDriver getDriver(){
        if (driver == null){
            driver = new EdgeDriver();
        }
        driver.manage().window().maximize();
        return driver;
    }

    public static void closeDriver() throws InterruptedException {
        Thread.sleep(5000);
        driver.quit();
    }
}
