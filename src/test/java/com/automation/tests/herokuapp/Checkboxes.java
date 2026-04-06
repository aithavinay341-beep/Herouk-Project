package com.automation.tests.herokuapp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Checkboxes {
    public static void main(String args[]) {

        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/checkboxes");
        List<WebElement> checkboxes = driver.findElements(By.xpath("//input[@type='checkbox']"));
        checkboxes.get(0); // checkbox 1
        checkboxes.get(1); // checkbox 2
        driver.findElement(By.xpath("//input[@type='checkbox'][1]")).click();
        System.out.println("Checkbox is selected: " + checkboxes.get(0).isSelected());
        driver.findElement(By.xpath("//input[@type='checkbox'][2]")).click();
        System.out.println("Checkbox is selected: " + checkboxes.get(1).isSelected());
        driver.quit();
    }
    
}
