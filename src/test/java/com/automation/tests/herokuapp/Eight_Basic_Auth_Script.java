package com.automation.tests.herokuapp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Eight_Basic_Auth_Script {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth"); // add username and password in the URL so that it can bypass the authentication pop-up
       
        String text = driver.findElement(By.cssSelector("p")).getText(); // This will get the text on the page after successful authentication
        System.out.println(text); // This will print the text on the page after successful authentication

        driver.quit();

    }
    
}
