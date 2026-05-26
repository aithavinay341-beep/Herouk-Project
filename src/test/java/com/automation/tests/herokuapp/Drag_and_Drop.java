package com.automation.tests.herokuapp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Drag_and_Drop {
    public static void main(String args[]) {
        WebDriver driver = new ChromeDriver();
        driver.get("http://the-internet.herokuapp.com/drag_and_drop");
        driver.manage().window().maximize();
        WebElement S =  driver.findElement(By.xpath("//div[@id='column-a']"));
        WebElement D =  driver.findElement(By.xpath("//div[@id='column-b']"));
        Actions action = new Actions(driver);
        action.clickAndHold(S)
       .moveToElement(D)
       .release()
       .build()
       .perform();
      
       WebElement newA = driver.findElement(By.id("column-a"));
       WebElement newB = driver.findElement(By.id("column-b"));
       String textA = newA.getText();
       String textB = newB.getText();

       if(textA.equals("B") && textB.equals("A")) {
           System.out.println("Test Passed");
       } else {
           System.out.println("Test Failed");
       }
       driver.quit();

    }
}
