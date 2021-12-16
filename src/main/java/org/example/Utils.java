package org.example;

import javafx.scene.input.DataFormat;
import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Utils extends BasePage {
    public static void clickOnElements(By by) {
        driver.findElement(by).click();

    }
    public static void typeText(By by,String text){
        driver.findElement(by).sendKeys(text);
    }
    public static void waitForClickable(By by, int seconds){
       WebDriverWait wait = new WebDriverWait(driver, seconds);
       wait.until(ExpectedConditions.elementToBeClickable(by));
    }
    public static void waitForVisible(By by,int second){
        WebDriverWait wait = new WebDriverWait(driver,second);
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(by));

    }
    public static String getTextElement(By by){
        return driver.findElement(by).getText();
    }
    public static String timeStamp(){
        DateFormat dateFormat = new SimpleDateFormat("ddmmyyhhmmss");
        Date date = new Date();
        return dateFormat.format(date);

    }
    public static void dropDownIndex(By by,int number){
        Select select = new Select(driver.findElement(by));
        select.selectByIndex(number);
    }
    public static void dropDownValue(By by,String text){
        Select select = new Select(driver.findElement(by));
        select.deselectByValue(text);
    }


}
