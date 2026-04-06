package com.automation.tests.herokuapp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Broken_Images {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/broken_images");
        List<WebElement> images = driver.findElements(By.tagName("img"));
        for (WebElement img : images) {
         
            String width = img.getAttribute("naturalWidth");

            if (width.equals("0")) {
                System.out.println("Broken image: " + img.getAttribute("src"));
            } else {
                System.out.println("Valid image: " + img.getAttribute("src")); 
            }
        }
        driver.quit();
     // driver.findElement(By.cssSelector("a[target='_blank']")).click(); // This will click on the link to open the image in a new tab
    }
    
}
