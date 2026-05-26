package com.automation.practice_testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Test1 {

   @Test(priority=2)
    public void printName() {
        System.out.println("Vinay");
    }

    @Test(priority=1)
    public void openGoogle() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com");
        String title = driver.getTitle();
        System.out.println(title);
        driver.quit();
    }
    @Test(priority=0)
    public void print() {
        System.out.println("Vinay print");
    }

}
