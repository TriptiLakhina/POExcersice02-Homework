package org.example;

import org.openqa.selenium.By;

public class ProductAppleMacBookPro13InchPage extends Utils{
    private By _emailAFriendButton = By.xpath("//button[starts-with(@class, \"button-2 email\")]");

    public void emailAFriend(){
        // Click on Email a friend button
        explicitWait_ElementToBeClickable(_emailAFriendButton);
        clickOnElement(_emailAFriendButton);

    }
}
