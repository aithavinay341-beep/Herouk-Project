package com.automation.tests.herokuapp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Drop_Down {
    public static void main(String args[]) {
       WebDriver driver = new ChromeDriver();
       driver.get("https://the-internet.herokuapp.com/dropdown");
       driver.manage().window().maximize();
       WebElement Dropdown = driver.findElement(By.id("dropdown"));
       Select select = new Select(Dropdown);
       //select.selectByValue("1");
       //select.selectByIndex(1);
       select.selectByVisibleText("Option 2");



    }
    
}
