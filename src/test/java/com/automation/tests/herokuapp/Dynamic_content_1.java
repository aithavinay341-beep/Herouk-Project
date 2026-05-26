package com.automation.tests.herokuapp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dynamic_content_1 {
    public static void main(String args[]){
        WebDriver driver = new ChromeDriver();
        driver.get("http://the-internet.herokuapp.com/dynamic_content");
        driver.manage().window().maximize();
        List<WebElement> multiple_elements = driver.findElements(By.xpath("//div[@class='large-10 columns']"));

        for(int i=0; i<=2;i++) {
            System.out.println(multiple_elements.get(i).getText());
            System.out.println("------------");
            System.out.println("------------");
        }
        driver.quit();
    }
    
}
