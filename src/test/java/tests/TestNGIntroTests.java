package tests;

import org.junit.jupiter.api.AfterEach;
import org.testng.Assert;
import org.testng.annotations.*;

public class TestNGIntroTests {

    @BeforeTest
    public void beforeTestMethod(){
        System.out.println("This is Before Test Method");
    }
    @AfterTest
    public void afterTestMethod(){
        System.out.println("This is After Test Method");
    }
    @BeforeClass
    public void beforeClass(){
        System.out.println("This is before class");
    }
    @BeforeMethod
    public void beforeMethod(){
        System.out.println("This is before method");
    }
    @Test
    public void test1(){
        System.out.println("i am test 1");
        Assert.assertTrue(5>2);
    }
    @Test
    public void test2(){
        //Assert.assertTrue(2 > 5);
        System.out.println("i am test 2");

    }@Test
    public void test3(){
        System.out.println("i am test 3");
        Assert.assertTrue(5>2);
    }
    @Test(groups = {"practice"})
    public void test4(){
        //Assert.assertTrue(2 > 5);
        System.out.println("i am test 4");

    }
}
