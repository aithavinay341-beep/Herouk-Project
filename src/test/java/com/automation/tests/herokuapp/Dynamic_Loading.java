package com.automation.tests.herokuapp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dynamic_Loading {
    public static void main(String args[]){
        WebDriver driver =  new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/dynamic_loading");
        driver.manage().window().maximize();

       /*  driver.findElement(By.xpath("//a[@href='/dynamic_loading/1']")).click();
        driver.findElement(By.xpath("//button[text()='Start']")).click(); */

        driver.findElement(By.xpath("//a[@href='/dynamic_loading/2']")).click();
        driver.findElement(By.xpath("//button[text()='Start']")).click();
        driver.quit();

    }
}
