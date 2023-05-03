package org.example;

import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class DriverManager extends Utils{

    public void openBrowser(){
        // Open Chrome browser
        driver = new ChromeDriver();
        // Open URL
        driver.get("https://demo.nopcommerce.com/");
        // Maximize the window
        driver.manage().window().maximize();
        // Implying implicit wait
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }


    public void closeBrowser(){
        // Close the browser
        driver.close();

    }
}
