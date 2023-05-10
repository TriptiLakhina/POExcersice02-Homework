package org.example;

import org.openqa.selenium.By;

public class Login_CheckoutAsGuestPage extends Utils{
    private By _checkoutAsGuestButton = By.xpath("//button[contains(@class,'checkout-as-guest')]");


    public void clickOnCheckoutAsGuestButton(){
        // Click on checkout as guest button
        clickOnElement(_checkoutAsGuestButton);
    }
}
