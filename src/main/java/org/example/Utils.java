package org.example;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.sql.Timestamp;
import java.time.Duration;
import java.util.List;

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
    public static void explicitWait_VisibilityOfElementLocated(By by,int timeInSeconds){
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(timeInSeconds));
        wait.until(ExpectedConditions.visibilityOfElementLocated(by));
    }

    // Reusable method for getting text from elements for product list
    public static List<WebElement> getTextFromElements(By by){
        List< WebElement> productList = driver.findElements(by);
        for (WebElement productTitle:productList){
            System.out.println(productTitle.getText());
        }return (productList);
    }


    // Reusable method for select option from text
    public static void selectElementByText (By by,String text) {
        Select select = new Select(driver.findElement(by));
        select.selectByVisibleText(text);

    }

    // Reusable method for select option from value
    public static void selectElementByValue (By by,String value){
        Select select = new Select(driver.findElement(by));
        select.selectByValue(value);
    }

    // Reusable method for select option from index
    public static void selectElementByIndex(By by,int index){
        Select select = new Select(driver.findElement(by));
        select.selectByIndex(index);
    }

    // Reusable method for getting text from alert message
    public static String handleAlertMessage_GetText() {
        String alertMessage = driver.switchTo().alert().getText();
        return alertMessage;
    }

    // Reusable method for accepting the alert message
    public static void handleAlertMessage_Accept(){
        Alert alert = driver.switchTo().alert();
        alert.accept();
    }

    public static void arrayListSizeNotEqualToZero(By by, String textToPrint, String textToPrintInElseCondition) {
        if (driver.findElements(by).size() != 0) {
            System.out.println(textToPrint);
        } else {
            System.out.println(textToPrintInElseCondition);
        }


    }

    public static String getCurrentUrl(){
        String currentURL = driver.getCurrentUrl();
        return currentURL;
    }

    public static String getWindowHandle(){
        String MainWindow = driver.getWindowHandle();
        return MainWindow;
    }


}
