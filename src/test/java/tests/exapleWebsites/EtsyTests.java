package tests.exapleWebsites;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;
import utilities.SeleniumUtils;

public class EtsyTests {
    @Test (groups = {"sanity"})
    public void etsyTest1(){
        WebDriver driver = new EdgeDriver();
        driver.get("https://www.etsy.com/?utm_source=google&utm_medium=cpc&utm_term=etsy_e&utm_campaign=Search_US_Brand_GGL_ENG_General-Brand_Core_All_Exact&utm_ag=A1&utm_custom1=_k_EAIaIQobChMIy4DihKjHhQMVeXBHAR1vaQoSEAAYASAAEgI05vD_BwE_k_&utm_content=go_227553629_16342445429_536666953103_kwd-1818581752_c_&utm_custom2=227553629&gad_source=1&gclid=EAIaIQobChMIy4DihKjHhQMVeXBHAR1vaQoSEAAYASAAEgI05vD_BwE");


    }
    @Test (groups = {"practice"})
    public void login1(){
        System.out.println("login etsy test 1");
    }
    @Test (groups = {"practice"})
    public void login2(){
        System.out.println("login etsy test 2");
    }
}
