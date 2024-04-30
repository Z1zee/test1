package tests.exapleWebsites;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import utilities.Driver;
import utilities.SeleniumUtils;

public class AmazonTests {
    @Test (groups = {"sanity"})
    public void amazonTest1(){
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.com/");

    }
    @Test
    public void amazonTest2(){
        System.out.println("this is test2 of amazon");
        SeleniumUtils.waitForSeconds(5);

    }@Test
    public void amazonTest3(){
        System.out.println("this is test3 of amazon");
        SeleniumUtils.waitForSeconds(3);

    }
    @Test (groups = {"practice"})
    public void login1(){
        System.out.println("login amazon test 1");
    }
    @Test (groups = {"practice"})
    public void login2(){
        System.out.println("login amazon test 2");
    }
}
