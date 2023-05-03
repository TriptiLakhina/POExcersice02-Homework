package org.example;

import org.openqa.selenium.By;

public class ShoppingCartPage extends Utils{
    By _shoppingCartProductName_LeicaTMirrorlessDigitalCamera = By.xpath("(//a[text()='Leica T Mirrorless Digital Camera'])[2]");


    public void captureproductname_LeicaTMirrorlessDigitalCamera() {
        // Capture & print the name of product in the shopping cart
        String productNameInShoppingCart = getTextFromElement(_shoppingCartProductName_LeicaTMirrorlessDigitalCamera);
        System.out.println("Name of the added product on the shopping cart page: " + productNameInShoppingCart);

    }
}
