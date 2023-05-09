package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;

public class ShoppingCartPage extends Utils{
    By _shoppingCartProductName_LeicaTMirrorlessDigitalCamera = By.xpath("(//a[text()='Leica T Mirrorless Digital Camera'])[2]");
    private By _productSpecifications = By.xpath("(//div[@class='attributes'])[2]");
    private By _termsOfServiceCheckBox = By.cssSelector("input#termsofservice");
    private By _checkoutButton = By.xpath("//button[contains(@class,'checkout')]");


    public void captureproductname_LeicaTMirrorlessDigitalCamera() {
        // Capture & print the name of product in the shopping cart
        String productNameInShoppingCart = getTextFromElement(_shoppingCartProductName_LeicaTMirrorlessDigitalCamera);
        System.out.println("Name of the added product on the shopping cart page: " + productNameInShoppingCart);

    }

    public void verifyProductSpecifications() {
        String expectedSpecifications = "Processor: 2.2 GHz Intel Pentium Dual-Core E2200\n" +
                "RAM: 8GB [+$60.00]\n" +
                "HDD: 320 GB\n" +
                "OS: Vista Premium [+$60.00]\n" +
                "Software: Microsoft Office [+$50.00]\n" +
                "Software: Acrobat Reader [+$10.00]\n" +
                "Software: Total Commander [+$5.00]";
        String actualSpecifications = getTextFromElement(_productSpecifications);
        Assert.assertEquals(actualSpecifications,expectedSpecifications,"Product specifications are not as ordered");
    }

    public void verifyUserCanCheckoutSuccessfully() {
        // Tick on Terms of Service checkbox
        clickOnElement(_termsOfServiceCheckBox);
        // Click on Checkout Button
        clickOnElement(_checkoutButton);


    }
}
