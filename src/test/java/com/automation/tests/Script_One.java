package com.automation.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Script_One {
    public static void main(String[] args) 
    {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");  
        String title = driver.getTitle();// gets the title of the page
        System.out.println("Page Title: " + title); // Prints the title of the page
        driver.quit();
    }
    
}
