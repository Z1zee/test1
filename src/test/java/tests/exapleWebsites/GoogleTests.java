package tests.exapleWebsites;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;
import utilities.Driver;
import utilities.SeleniumUtils;

public class GoogleTests {
    @Test
    public void googleTest1(){
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com/");

    }
    @Test
    public void googleTest2(){
        System.out.println("this is test 2 of google");
        SeleniumUtils.waitForSeconds(5);

    }
    @BeforeGroups(groups = {"sanity"})
    public void beforeGroup(){
        System.out.println("before group");
    }
    @AfterGroups(groups = {"sanity"})
    public void afterGroup(){
        System.out.println("after group");
    }
    @BeforeTest(groups = {"sanity"})
    public void beforeTest(){
        System.out.println("before test");
    }
    @AfterTest(groups = {"sanity"})
    public void afterTest(){
        System.out.println("after test");
    }

    @Test(groups = {"sanity"})
    public void googleTest3(){
        System.out.println("this is test 3 of google");
        SeleniumUtils.waitForSeconds(10);
    }
    @Test (groups = {"practice"})
    public void login1(){
        System.out.println("login google test 1");
    }
    @Test(groups = {"practice"})
    public void login2(){
        System.out.println("login google test 2");
    }
}
