package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ConflictTest {
    @Test
    public void test1(){
        int a = 5;
        int b = 10;
        System.out.println("Sum " + (a + b));

    }
    @Test
    public void test2(){
        String message = "Welcome to USA - the land of opportunity";
        Assert.assertTrue(message.toLowerCase().contains("usa"));
    }
}
