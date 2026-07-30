package com.automation.practice_testng;

import java.time.Duration;
import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class Test4_dependencym {

    ChromeDriver driver;

    @Test (groups = "sanity")
    public void login() {
        ChromeOptions options = new ChromeOptions();
        Map<String, Object> prefs = new HashMap<>();
        prefs.put("credentials_enable_service", false);
        prefs.put("profile.password_manager_enabled", false);
        prefs.put("profile.password_manager_leak_detection", false);
        options.setExperimentalOption("prefs", prefs);

        driver = new ChromeDriver(options);
        driver.get("https://www.saucedemo.com/?utm_source=chatgpt.com");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys("standard_user");
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys("secret_sauce");
        driver.findElement(By.xpath("//input[@id='login-button']")).click();
        }
    
    @Test(dependsOnMethods = "login", groups = "sanity")
    public void addbagToCart() {
        driver.findElement(By.xpath("//button[@id='add-to-cart-sauce-labs-onesie']")).click();
        driver.findElement(By.xpath("//a[@class='shopping_cart_link']")).click();
    }
    @Test(dependsOnMethods = "addbagToCart", groups = "sanity")
    public void checkout() {
        driver.findElement(By.xpath("//button[@id='checkout']")).click();
    }
    @Test(dependsOnMethods = "checkout", groups = "sanity")
    public void quitbrowser() {
        driver.quit();
    }
}
