package tests.testNGPractice;

import org.testng.annotations.*;

public class AnnotationsExample {
  @BeforeSuite
  public void beforeSuite(){
      System.out.println("SettingUpTheSuiteEnvironment");
  }@BeforeTest
    public void beforeTest(){
        System.out.println("Configuring test environment.");
    }
    @BeforeClass
    public void beforeClass(){
        System.out.println("Loading class resources.");
    }@BeforeMethod
    public void beforeMethod(){
        System.out.println("Initializing test method setup.");
    }@Test
    public void test1(){

    }
    @Test
    public void test2(){

    }
    @Test
    public void test3(){

    }
    @AfterMethod
    public void afterMethod(){
        System.out.println("Cleaning up after test method.");
    }
    @AfterClass
    public void afterClass(){
        System.out.println("Releasing class resources.");
    }
    @AfterTest
    public void afterTest(){
        System.out.println("Tearing down test environment.");
    }@AfterSuite
    public void afterSuite(){
        System.out.println("Cleaning up the suite environment.");
    }
}
