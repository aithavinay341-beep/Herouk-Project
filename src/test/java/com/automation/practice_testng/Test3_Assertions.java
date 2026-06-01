package com.automation.practice_testng;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Test3_Assertions {

  //  WebDriver driver;

    @Test 
    public void assertions() {
        String expectedTitle = "Google";
        String actualTitle = "Google";
       
        Assert.assertEquals(actualTitle, expectedTitle , "Test Passed");

    }

    @Test
    public void testhardassertions(){
        System.out.println("Vinay");
        System.out.println("Sai");
        Assert.assertEquals(10, 10);
        System.out.println("Vinay 1");
        System.out.println("hard assertions will stop the execution of the test case if any assertion is failed");
    }

    @Test
    public void testsoftassertions(){
        System.out.println("Soft Assertions");
        System.out.println("Vinay");
        System.out.println("Sai");
        SoftAssert softAssert = new SoftAssert(); // soft assertions are object oriented and we need to create an object of soft assert class to use it
        softAssert.assertEquals(10, 20); //Used the objet to call the assertion method and it will not stop the execution of the test case if any assertion is failed
        System.out.println("Vinay 1");

}
}
