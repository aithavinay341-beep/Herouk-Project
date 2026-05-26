package com.automation.tests.herokuapp;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Entry_ad {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/entry_ad");
        driver.manage().window().maximize();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
       
        WebElement modal = wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.cssSelector("div[class='modal']"))));
        WebElement clsBtn = wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.cssSelector("div[class='modal-footer'] p"))));
        
        clsBtn.click();
        if(modal.isDisplayed()){
            System.out.println("Test Failed");
        } else{
            System.out.println("Test Passed");
        }
        driver.findElement(By.xpath("//a[@id= 'restart-ad' ]")).click();
        driver.quit();
    }
}
