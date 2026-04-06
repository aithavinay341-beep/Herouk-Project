package com.automation.tests.herokuapp;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Seven_Add_Element_Script {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://the-internet.herokuapp.com/add_remove_elements/");
        System.out.println("Before Adding Element");
        for(int i=0; i<= 3; i++) 
            {
        driver.findElement(By.xpath("//button[text()='Add Element']")).click(); 
        }
        System.out.println("Clicked Add Element");
        driver.findElements(By.xpath("//button[text()='Delete']")).get(3).click();
        System.out.println("After Deleting Element");
       
    }
    
}
