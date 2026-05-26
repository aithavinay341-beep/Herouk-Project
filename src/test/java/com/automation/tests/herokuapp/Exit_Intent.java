package com.automation.tests.herokuapp;

import java.awt.AWTException;
import java.awt.Robot;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Exit_Intent {
    public static void main(String args[]) throws AWTException{
        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/exit_intent");
        driver.manage().window().maximize();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        // Actions action = new Actions(driver);
        
     /* WebElement body = driver.findElement(By.xpath("//body"));
        action.moveToElement(body,200,200).perform();
        action.moveByOffset(0, -200).perform(); */

        Robot robot = new Robot();  // No idea but it is working Robot class is used to control the mouse and keyboard. It can be used to perform various actions such as moving the mouse, clicking, typing, etc.
        robot.mouseMove(1,1); // Move the mouse to the top-left corner of the screen (1,1) coordinates. This simulates the user moving the mouse out of the browser window, which should trigger the exit intent modal.
        
       // driver.findElement(By.cssSelector("div[class='modal-footer'] p")).click();
         WebElement modal = wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.cssSelector("div[class='modal-footer'] p"))));
         modal.click();
         driver.quit();
        
    }
    
}
