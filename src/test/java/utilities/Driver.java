package utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.safari.SafariDriver;

import java.time.Duration;

public class Driver {
    static WebDriver driver;
    public static WebDriver getDriver(){
        if (driver != null) {
            return driver;
        }
        String browser = Config.getProperties("browser");
        switch (browser){
            case "chrome":
            driver = new ChromeDriver();
            break;
            case "firefox":
                driver = new SafariDriver();
                break;
            case "safari":
                driver = new SafariDriver();
                break;
            default:
                driver = new ChromeDriver();
        }
        driver = new ChromeDriver();
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
        return driver;
    }
}
