package org.example;

import org.openqa.selenium.By;

public class ProductPage extends Utils{
    private By _addToCartButton = By.xpath("//button[contains(@id,'add-to-cart')]");
    private By _addToWishlistButton = By.xpath("//button[contains(@id,'add-to-wishlist')]");
    private By _addToCompareButton = By.xpath("(//button[contains(@class,'button-2 add-to-compare')])[1]");
    private By _emailAFriendButton = By.xpath("(//button[contains(@class,'button-2 email-a-friend')])[1]") ;
    private By _shoppingCartButton_Header = By.cssSelector("span.cart-label");



    public void clickOnEmailAFriendButton(){
        // Click on Email a friend button
        explicitWait_ElementToBeClickable(_emailAFriendButton);
        clickOnElement(_emailAFriendButton);

    }
    public void clickOnAddToCartButton() {
        // Click on add to cart button
        explicitWait_ElementToBeClickable(_addToCartButton);
        clickOnElement(_addToCartButton);
    }

    public void clickOnShoppingCartButton_Header() {
        // Click on shopping cart button
        clickOnElement(_shoppingCartButton_Header);
    }
}
