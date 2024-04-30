package tests;

//import org.junit.jupiter.api.AfterEach;
//import org.junit.jupiter.api.Assertions;
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.LeavePage;
import pages.LoginPage;
import pages.PIMPage;
import utilities.Driver;

public class LoginTest {

    WebDriver driver;
    LoginPage loginPage;

    @BeforeMethod
    public void before(){
        driver = Driver.getDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/");
        loginPage = new LoginPage();
    }


    @Test
    public void testSuccessfulLogin(){
        loginPage.login("Admin", "admin123");
        Assert.assertTrue(driver.getCurrentUrl().contains("dashboard"));
    }

    @Test
    public void testUnsuccessfulLogin(){
        loginPage.login("Admin", "fwefe");
        Assert.assertTrue(loginPage.invalidLoginMessage.isDisplayed());

    }
//    @AfterEach
//    public void tearDown(){
//        driver.manage().deleteAllCookies();
//    }



}