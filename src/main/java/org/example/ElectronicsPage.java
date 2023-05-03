package org.example;

import org.openqa.selenium.By;

public class ElectronicsPage extends Utils{
    // Storing locators
    private By _camera_PhotoCategoryTitle = By.xpath("//div[@class=\"item-grid\"]/div[1]/div[1]/h2[1]/a[1]");


    public void clickOnCameraPhoto() {
        // Click on Camera & Photo
        clickOnElement(_camera_PhotoCategoryTitle);
    }
}
