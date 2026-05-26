package com.automation.tests.herokuapp;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Dyanmic_loading1 {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/dynamic_loading");
        driver.manage().window().maximize();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.findElement(By.xpath("//a[normalize-space()='Example 2: Element rendered after the fact']")).click();
        driver.findElement(By.xpath("//button[normalize-space()='Start']")).click();
       
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h4[normalize-space()='Hello World!']")));
        String text_displayed = driver.findElement(By.xpath("//h4[normalize-space()='Hello World!']")).getText();
        System.out.println(text_displayed);

        if(text_displayed.equals("Hello World!"))
        {
            System.out.println("Test Passed");
        } else{
            System.out.println("Test Failed");
        }
        driver.quit();
    }
    
}
