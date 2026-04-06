package com.automation.tests.herokuapp;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Challenging_DOM {
    public static void main(String args[]) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/challenging_dom");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement fooBtn = wait.until(
                ExpectedConditions.elementToBeClickable(
                        By.xpath("//a[text()='foo'][1]")
                )
        );
        fooBtn.click();
      // driver.findElement(By.xpath("//a[text()='bar']")).click();
      //driver.findElement(By.xpath("//a[@id='5eaed4c0-13b8-013f-c74e-22feab5f1180']")).click();
     /* WebElement quxBtn =wait.until(
        ExpectedConditions.elementToBeClickable(By.xpath("//a[text() = 'qux']")) );
        quxBtn.click(); */

    }
    
}
