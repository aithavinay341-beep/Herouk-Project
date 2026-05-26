package com.automation.tests.herokuapp;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Floating_Menuone {
    public static void main(String args[]) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/floating_menu");
        driver.manage().window().maximize();

        WebElement menu = driver.findElement(By.id("menu"));

        // Scroll
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,1000)");


        // Check visibility
        if(menu.isDisplayed()){
            System.out.println("PASS: Menu is visible after scroll");
        } else {
            System.out.println("FAIL: Menu not visible");
        }

        // Try clicking (real validation)
        driver.findElement(By.linkText("Contact")).click();

        String url = driver.getCurrentUrl();

        if(url.contains("#contact")){
            System.out.println("PASS: Menu is clickable after scroll");
        } else {
            System.out.println("FAIL: Menu click failed");
        }

        driver.quit();
    }
}