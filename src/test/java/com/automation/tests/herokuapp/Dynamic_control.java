package com.automation.tests.herokuapp;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Dynamic_control {
    
    public static void main(String args[]) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/dynamic_controls");
        driver.manage().window().maximize();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.findElement(By.xpath("//input[@type='checkbox']")).click();
        driver.findElement(By.cssSelector("button[onclick='swapCheckbox()']")).click();

        wait.until(ExpectedConditions.elementToBeClickable(
                By.cssSelector("button[onclick='swapCheckbox()']"))).click();

        String message = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[@id = 'message']"))).getText();
        System.out.println(message);

        driver.findElement(By.cssSelector("button[onclick='swapInput()']")).click();
        
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("button[onclick='swapInput()']"))).click();

        //driver.findElement(By.cssSelector("button[onclick='swapInput()']")).click();

        String message1 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[@id = 'message']"))).getText();
        System.out.println(message1);
        driver.quit();
}
}
