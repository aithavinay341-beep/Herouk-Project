package com.automation.tests.herokuapp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dynamic_content {
    public static void main(String args[]){
        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/dynamic_content");
        driver.manage().window().maximize();
      //  driver.findElement(By.xpath("//a[@href='/dynamic_content?with_content=static']"));
        String content1 = driver.findElement(By.xpath("//div[@class ='large-10 columns'][1]")).getText();
        System.out.println(content1);
        driver.navigate().refresh();
        String content2 = driver.findElement(By.xpath("//div[@class ='large-10 columns'][1]")).getText();
        System.out.println(content2);
     
        if(content1.equals(content2)){
            System.out.println("Text is static");
        }else{
            System.out.println("Text is dynamic");
        }
        driver.quit();
    }
    
}
