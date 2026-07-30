package com.automation.practice_testng;

import java.time.Duration;
import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Test5_Data_Providers {

    WebDriver driver;

    @DataProvider(name = "loginData")
    public Object[][] getData() {
        return new Object[][] {
            {"standard_user", "secret_sauce"},
            {"visual_user", "secret_sauce"},
            {"locked_out_user", "secret_sauce"},
            {"performance_glitch_user", "secret_sauce"},
            {"problem_user", "secret_sauce"},
            {"error_user", "secret_sauce"},
            {"invalid_user", "invalid_password"}
        };
    }

    @Test(dataProvider = "loginData")
    public void login(String username, String password) {
        System.out.println("Test Case of Data Provider - Begin");
        
        ChromeOptions options = new ChromeOptions();
        Map<String, Object> prefs = new HashMap<>();
        prefs.put("credentials_enable_service", false);
        prefs.put("profile.password_manager_enabled", false);
        prefs.put("profile.password_manager_leak_detection", false);
        options.setExperimentalOption("prefs", prefs);
        try
        {
        driver = new ChromeDriver(options);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        driver.get("https://www.saucedemo.com");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys(username);
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys(password);
        
        WebElement loginButton = driver.findElement(By.xpath("//input[@id='login-button']"));
        wait.until(ExpectedConditions.elementToBeClickable(loginButton)).click(); // Just for demonstration, avoid using Thread.sleep in real tests
        
        driver.findElement(By.xpath("//button[@id='react-burger-menu-btn']")).click();
        
        WebElement logout = driver.findElement(By.xpath("//a[@id='logout_sidebar_link']"));
        wait.until(ExpectedConditions.elementToBeClickable(logout)).click();
        
        
        System.out.println("Test Case of Data Provider - End");
        }
        finally 
        {
                driver.quit();
        }
    }

}
    

