package org.example;

import org.openqa.selenium.By;

public class CameraPhotoPage extends Utils{
    // Storing locators
    public By _productName_LeicaTMirrorlessDigitalCamera = By.xpath("//div[@class=\"item-grid\"]/div[3]/div[1]/div[2]/h2[1]/a");
    private By _AddToCartButton_LeicaTMirrorlessDigitalCamera = By.xpath("//div[@class=\"item-grid\"]/div[3]/div[1]/div[2]/div[3]/div[2]/button[1]");
    private By _shoppingCartLinkFromSuccessNotificationBar = By.xpath("//p[@class=\"content\"]/a");

    public void captureProductName_LeicaTMirrorlessDigitalCamera() {
        // Capture & print the name of product Leica T Mirrorless Digital Camera
        String productNameFromProductListPage = getTextFromElement(_productName_LeicaTMirrorlessDigitalCamera);
        System.out.println("Name of product on the product list page: " + productNameFromProductListPage);
    }

    public void clickOnAddToCartButton_LeicaTMirrorlessDigitalCamera() {
        // Click on Add to cart button
        clickOnElement(_AddToCartButton_LeicaTMirrorlessDigitalCamera);
    }

    public void clickOnShoppingCartLinkFromSuccessNotificationBar() {
        // Open the shopping cart from notification bar
        explicitWait_ElementToBeClickable(_shoppingCartLinkFromSuccessNotificationBar);
        clickOnElement(_shoppingCartLinkFromSuccessNotificationBar);
    }
}
