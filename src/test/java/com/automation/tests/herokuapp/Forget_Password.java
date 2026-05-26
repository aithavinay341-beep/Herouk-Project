package com.automation.tests.herokuapp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Forget_Password {

    public static void main(String args[]){
        WebDriver driver = new  ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/forgot_password");
        driver.manage().window().maximize();
        String url = driver.getCurrentUrl();
        System.out.println(url);
        driver.findElement(By.cssSelector("#email")).sendKeys("aithavinay2015@gmail.com");
        driver.findElement(By.cssSelector("#form_submit")).click();

    }
    
}
