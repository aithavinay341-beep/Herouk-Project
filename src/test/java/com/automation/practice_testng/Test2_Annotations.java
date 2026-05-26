package com.automation.practice_testng;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Test2_Annotations {

    WebDriver driver = new ChromeDriver();
    @BeforeMethod
    public void beforeMethod() {
        driver.get("https://www.saucedemo.com/?utm_source=chatgpt.com");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.manage().window().maximize();
        driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys("standard_user");
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys("secret_sauce");
        driver.findElement(By.xpath("//input[@id='login-button']")).click();
}

    @Test
    public void test1() {
        driver.findElement(By.cssSelector("#add-to-cart-sauce-labs-bike-light")).click();
        driver.findElement(By.cssSelector(".shopping_cart_link")).click();
        System.out.println("Added to the card successfully");
        driver.findElement(By.xpath("//button[@id='checkout']")).click();
        driver.findElement(By.xpath("//input[@id='first-name']")).sendKeys("Vinay");
        driver.findElement(By.xpath("//input[@id='last-name']")).sendKeys("Aitha");
        driver.findElement(By.xpath("//input[@id='postal-code']")).sendKeys("502381");
        driver.findElement(By.xpath("//input[@id='continue']")).click();
        driver.findElement(By.xpath("//button[@id='finish']")).click();
    }

    @AfterMethod 
    public void afterMethod() {
        driver.findElement(By.xpath("//button[@id='react-burger-menu-btn']")).click();
        driver.findElement(By.cssSelector("#logout_sidebar_link")).click();
        driver.quit();
    }
}