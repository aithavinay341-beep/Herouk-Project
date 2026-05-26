package com.automation.tests.herokuapp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class File_upload {

    public static void main(String [] args){
        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/upload");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//input[@id='file-upload']")).sendKeys("C:\\Automation_Pratice\\Both hands _ dummy and trainee.png");
        driver.findElement(By.xpath("//input[@id='file-submit']")).click();
        driver.quit();
    }
}
