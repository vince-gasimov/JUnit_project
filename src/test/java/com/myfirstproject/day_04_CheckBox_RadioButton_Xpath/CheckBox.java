package com.myfirstproject.day_04_CheckBox_RadioButton_Xpath;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class CheckBox {

    WebDriver driver;
    @Before
    public void setUp(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
        driver.get("https://the-internet.herokuapp.com/checkboxes");
    }

    @Test
    public void checkbox(){

//        Create test method and complete the following task.
//        Go to https://the-internet.herokuapp.com/checkboxes

//        Locate the elements of checkboxes
        WebElement checkbox1 = driver.findElement(By.xpath("(//input[@type='checkbox'])[1]"));
        WebElement checkbox2 = driver.findElement(By.xpath("(//input[@type='checkbox'])[2]"));
        if(!checkbox1.isSelected()) { // is checkbox1 is not selected
            checkbox1.click();
        }
        if(!checkbox2.isSelected()) { // is checkbox2 is not selected
            checkbox1.click();
        }

        //        Then verify that checkbox1 is checked.
        Assert.assertTrue(checkbox1.isSelected());
    }
    @After
    public void tearDown(){
        driver.quit();
    }

}
