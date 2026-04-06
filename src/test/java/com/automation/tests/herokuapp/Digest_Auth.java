package com.automation.tests.herokuapp;

import org.openqa.selenium.HasAuthentication;
import org.openqa.selenium.UsernameAndPassword;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Digest_Auth {
    public static void main(String args[]){
        WebDriver driver = new ChromeDriver();
         ((HasAuthentication) driver)
                .register(UsernameAndPassword.of("admin", "admin"));
        driver.get("https://@the-internet.herokuapp.com/digest_auth");
        driver.quit();

    }
    
}
