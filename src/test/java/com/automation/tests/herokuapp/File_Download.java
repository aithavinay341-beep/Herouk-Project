package com.automation.tests.herokuapp;


import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class File_Download {
    public static void main(String args[]){
            WebDriver driver = new ChromeDriver();
            driver.get("https://the-internet.herokuapp.com/download");
            driver.manage().window().maximize();
            driver.findElement(By.xpath("//a[normalize-space()='Excel.csv']")).click();
            
            File file = new File("C:/Users/Vinay/Downloads/Excel.csv");       

             if(file.exists()) {
            System.out.println("File downloaded successfully");
                    } else {
            System.out.println("Download failed");
                    }
            driver.quit();

    }
    
}
