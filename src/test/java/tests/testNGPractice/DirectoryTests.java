package tests.testNGPractice;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import pages.CommonPage;
import pages.DirectoryPage;
import pages.LoginPage;
import pages.PIMPage;
import utilities.Driver;
import utilities.SeleniumUtils;

public class DirectoryTests {
    LoginPage loginPage = new LoginPage();
    DirectoryPage directoryPage = new DirectoryPage();
    CommonPage commonPage = new CommonPage();
    WebDriver driver = Driver.getDriver();


    @BeforeMethod
    public void login(){
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        loginPage.login("Admin", "admin123");
    }
    @Test
    public void verify() throws InterruptedException {
        SeleniumUtils.click(driver,commonPage.directory);
//        SeleniumUtils.waitForSeconds(2);
//        SeleniumUtils.click(driver,directoryPage.button);
//        SeleniumUtils.click(driver,directoryPage.HrManager);
//        SeleniumUtils.click(driver,directoryPage.search);
       // Assert.assertEquals(directoryPage.HrManager.getText(),"HR MANAGER");
//        commonPage.directory.click();
     //   directoryPage.button.click();
//        directoryPage.HrManager.click();
//        directoryPage.search.click();

//        WebElement manager1 =driver.findElement(By.xpath("//img[@alt='Profile Picture']"));
//        Assert.assertEquals(manager1.getText(), "HR Manager");
//        WebElement location =driver.findElement(By.xpath("//img[@alt='Profile Picture']"));
//        Assert.assertEquals(location.getText(), "//*[text()='Texas R&D']");

    }
}
