package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;

public class CompareProductsPage extends Utils{
    // Storing locators
    private By _productName_HTCOneM8AndroidL5Lollipop = By.xpath("//table[@class=\"compare-products-table\"]/tbody/tr[3]/td[3]/a");
    private By _productName_$25VirtualGiftCard = By.xpath("//table[@class=\"compare-products-table\"]/tbody/tr[3]/td[2]/a");
    private By _clearListButton = By.xpath("//div[@class=\"page-body\"]/a");
    private By _actualNoItemsToCompareMessage = By.xpath("//div[@class=\"no-data\"]");


    public void captureProductName_HTCOneM8AndroidL5Lollipop() {
        // Capture & print the name of product 1 in product comparison
        String productName1 = getTextFromElement(_productName_HTCOneM8AndroidL5Lollipop);
        System.out.println("Product 1 name in comparison list is: " + productName1);

    }

    public void captureProductName_$25VirtualGiftCard() {
        // Capture & print the name of product 2 in product comparison
        String productName2 = getTextFromElement(_productName_$25VirtualGiftCard);
        System.out.println("Product 2 name in comparison list is: " + productName2);
    }

    public void clickOnClearListButton() {
        // Click on clear list
        clickOnElement(_clearListButton);
    }

    public void captureActualNoItemsToCompareMessage() {
        String expectedNoItemsToCompareMessage = "No items in the list to compare";
        // Capture the message when no products in product comparison
        String actualNoItemsToCompareMessage = getTextFromElement(_actualNoItemsToCompareMessage);
        System.out.print("\nEmpty comparison list display message: ");
        // Verify the display message for empty product comparison
        Assert.assertEquals(actualNoItemsToCompareMessage, expectedNoItemsToCompareMessage, "Wrong blank comparison display message");
    }
}
