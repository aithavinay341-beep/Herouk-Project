package com.automation.tests.herokuapp;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Floating_menu {
    public static void main(String args[]){
        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/floating_menu#contact");
        driver.manage().window().maximize();
       
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,500)");
      
        WebElement Home = driver.findElement(By.id("menu"));
      
        if(Home.isDisplayed()){
            System.out.println("PASS: Menu is visible after scroll");
        } else {
            System.out.println("FAIL: Menu is not visible");
        }
        driver.quit();
    }
    
}
