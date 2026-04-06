package com.automation.tests.herokuapp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Disappearing_elements {
    public static void main(String args[]){
        WebDriver driver = new ChromeDriver();
        driver.get("http://the-internet.herokuapp.com/disappearing_elements");
        driver.manage().window().maximize();
      //  driver.findElement(By.xpath("//a[@href='/contact-us/']")).click();

      List<WebElement> menuItems = driver.findElements(By.xpath("//ul/li/a"));
        for(WebElement item : menuItems){
            System.out.println(item.getText());
        }
        List<WebElement> gallery = driver.findElements(By.xpath("//a[@href='/gallery/']"));

        boolean test = gallery.isEmpty();
        if(test){
        System.out.println("Gallery menu item is present");
        }        else {
        System.out.println("Gallery menu item is not present");
        }

        driver.quit();

}

}
