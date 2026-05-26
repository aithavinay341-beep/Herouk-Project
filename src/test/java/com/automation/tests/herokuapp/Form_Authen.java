package com.automation.tests.herokuapp;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Form_Authen {

    public static void main(String args[]){
        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/login");
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(1000));   
        driver.manage().window().maximize();
        WebElement username  = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("username")));
        username.sendKeys("tomsmith");
        driver.findElement(By.id("password")).sendKeys("SuperSecretPassword!");
       
        driver.findElement(By.className("//i[@class='fa fa-2x fa-sign-in']")).click();
        
        
    }
}
