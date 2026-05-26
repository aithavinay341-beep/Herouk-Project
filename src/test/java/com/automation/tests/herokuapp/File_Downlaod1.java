package com.automation.tests.herokuapp;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class File_Downlaod1 {
    public static void main(String[] args) {
         String downloadPath = "C:\\Automation_Pratice";
         
         Map<String, Object> prefs = new HashMap<>();
         prefs.put("download.default_directory", downloadPath);
         prefs.put("download.prompt_for_download", false);

         ChromeOptions options = new ChromeOptions();
         options.setExperimentalOption("prefs", prefs);

         WebDriver driver = new ChromeDriver(options);
         driver.get("https://the-internet.herokuapp.com/download");
         driver.manage().window().maximize();
         driver.findElement(By.xpath("//a[normalize-space()='Hello World.txt']")).click();
         
         File file = new File(downloadPath + "\\" + "Hello World.txt");

        if (file.exists()) {

            int size = (int) file.length();

            if (size > 0) {
                System.out.println("PASS: File downloaded successfully");
                System.out.println("File Name: " + "Hello World.txt");
                System.out.println("File Size: " + size + " bytes");
            } else {
                System.out.println("FAIL: File is empty");
            }

        } else {
            System.out.println("FAIL: File not found");
        }

         driver.quit();
    }
    
}
