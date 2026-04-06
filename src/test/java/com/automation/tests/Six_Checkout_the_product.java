package com.automation.tests;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Six_Checkout_the_product {
    public static void main(String[] args) {
     
      WebDriver driver = new ChromeDriver();
      driver.manage().window().maximize();
      WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
      driver.get("https://www.saucedemo.com/");
      driver.findElement(By.id("user-name")).sendKeys("standard_user");
      driver.findElement(By.id("password")).sendKeys("secret_sauce");
      driver.findElement(By.id("login-button")).click();
      driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();
      driver.findElement(By.className("shopping_cart_link")).click();
      driver.findElement(By.id("checkout")).click();
      driver.findElement(By.id("first-name")).sendKeys("Vinay");
      driver.findElement(By.id("last-name")).sendKeys("QA");
      wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("postal-code"))).sendKeys("500001");
      driver.findElement(By.id("continue")).click();
      driver.findElement(By.id("finish")).click();
      driver.quit();

    }
    
}
