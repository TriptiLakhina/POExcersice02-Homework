package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.sql.Timestamp;
import java.time.Duration;

public class Utils extends BasePage{

    // Reusable method for click on element - No return type, with parameters
    public static void clickOnElement(By by)
    {
        driver.findElement(by).click();
    }

    // Reusable method for typing the text - No return type, with parameters
    public static void typeText(By by,String text){
        driver.findElement(by).sendKeys(text);
    }

    // Reusable method for getting the text from element - with return type, with parameters
    public static String getTextFromElement(By by){
        return driver.findElement(by).getText();
    }

    // Reusable method for Timestamp
    public static long timeStamp(){
        Timestamp timestamp = new Timestamp(System.currentTimeMillis());
        return timestamp.getTime();
    }

    // Reusable method for explicit wait with condition Element to be clickable
    public static void explicitWait_ElementToBeClickable(By by){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.elementToBeClickable(by));
    }

    // Reusable method for explicit wait with condition Invisibility of Element located
    public static void explicitWait_InvisibilityOfElementLocated(By by){
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(20));
        wait.until(ExpectedConditions.invisibilityOfElementLocated(by));
    }

    // Reusable method for explicit wait with condition URL matches
    public static void explicitWait_UrlMatches(String url){
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(20));
        wait.until(ExpectedConditions.urlMatches(url));
    }

    // Reusable method for explicit wait with condition Text to be present in element located
    public static void explicitWait_TextToBePresentInElementLocated(By by, String text){
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(20));
        wait.until(ExpectedConditions.textToBePresentInElementLocated(by,text));
    }

    // Reusable method for explicit wait with condition visibility of element located
    public static void explicitWait_VisibilityOfElementLocated(By by){
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(20));
        wait.until(ExpectedConditions.visibilityOfElementLocated(by));
    }

}
