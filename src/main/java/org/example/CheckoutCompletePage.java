package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;

public class CheckoutCompletePage extends Utils{
    private By _orderSuccessMessage = By.xpath("//div[@class='section order-completed']//div[@class='title']");
    private By _orderNumber = By.xpath("//div[@class='order-number']");



    public void verifyUserCanSeeOrderNumber(){
        // Capture the success message
        String orderSuccessMessage = getTextFromElement(_orderSuccessMessage);
        // Capture the order number
        String orderNumber = getTextFromElement(_orderNumber);
        // Assert to verify order success message is same as required
        Assert.assertEquals(orderSuccessMessage,"Your order has been successfully processed!", "Order success message text is wrong");
        // Print the order number
        System.out.println(orderNumber);
    }
}
