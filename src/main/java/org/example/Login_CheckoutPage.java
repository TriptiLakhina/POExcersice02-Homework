package org.example;

import org.openqa.selenium.By;

public class Login_CheckoutPage extends Utils{
    private By _checkoutAsGuestButton = By.xpath("//button[contains(@class,'checkout-as-guest')]");


    public void clickOnCheckoutAsGuestButton(){
        clickOnElement(_checkoutAsGuestButton);
    }
}
