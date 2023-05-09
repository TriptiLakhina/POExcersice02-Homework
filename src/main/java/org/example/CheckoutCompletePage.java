package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;

public class CheckoutCompletePage extends Utils{
    private By _orderSuccessMessage = By.xpath("//div[@class='section order-completed']//div[@class='title']");
    private By _orderNumber = By.xpath("//div[@class='order-number']");



    public void verifyUserCanSeeOrderNumber(){
        String orderSuccessMessage = getTextFromElement(_orderSuccessMessage);
        String orderNumber = getTextFromElement(_orderNumber);
        Assert.assertEquals(orderSuccessMessage,"Your order has been successfully processed!", "Order success message text is wrong");
        System.out.println(orderNumber);
    }
}
