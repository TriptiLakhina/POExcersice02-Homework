package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;

import java.util.Iterator;
import java.util.Set;

public class FacebookPage extends Utils {

    private By _closeFB_NopCommerceConnectPopUpWindow = By.xpath("//div[@aria-label=\"Close\"]");
    private By _allowCookies = By.xpath("(//div[contains(@aria-label,'Allow all cookies')])[2]");
    private By _fbEmail_Phone = By.xpath("//input[@placeholder='Email or phone']");
    private By _fbPassword = By.xpath("//input[@placeholder='Password']");
    private By _fbLoginButton = By.xpath("//div[@aria-label='Accessible login button']");
    private By _fbFormActionHeader = By.xpath("//form[@id='login_form']");
    private By _pageTitle_Facebook = By.xpath("//div[contains(@class,'78zum5 x1iyjqo2 x1n2onr6')]");


    public void verifyFacebookPageUrlAndHeaderElements() {
        // Get Main window handle
        String MainWindow = getWindowHandle();
        String mainWindowURL = getCurrentUrl();
        System.out.println("Main Window url is: " + mainWindowURL);
        // To handle all new opened windows
        Set<String> s1 = driver.getWindowHandles();
        Iterator<String> i1 = s1.iterator();

        while (i1.hasNext())
        {
            String ChildWindow = i1.next();
            if (!MainWindow.equalsIgnoreCase(ChildWindow)) {
                // Switch to Child Window
                driver.switchTo().window(ChildWindow);
                // Get the url of Child window
                String facebookURL = getCurrentUrl();
                System.out.println("Child Window url is: " + facebookURL);
                // Assert to verify the Url matches
                Assert.assertEquals(facebookURL, "https://www.facebook.com/nopCommerce", "URL does not match");
                // Assert to verify URL directs to the correct page
                Assert.assertEquals(facebookURL.contains(getTextFromElement(_pageTitle_Facebook)),true,"URL does not match to the directed page");
                // Click on Allow all cookies
                clickOnElement(_allowCookies);
                // Close the Popup window for Nop Commerce Connect
                explicitWait_ElementToBeClickable(_closeFB_NopCommerceConnectPopUpWindow);
                clickOnElement(_closeFB_NopCommerceConnectPopUpWindow);
                // Verify the Email text field box is present in header
                arrayListSizeNotEqualToZero(_fbEmail_Phone,"Text field Email is Present","Element Email is Absent");
                // Verify the Password field box is present in header
                arrayListSizeNotEqualToZero(_fbPassword,"Text field Password is Present","Element Password is Absent");
                // Verify the element Login button is present in header
                arrayListSizeNotEqualToZero(_fbLoginButton,"LogIn Button is Present","Element LogIn is Absent");
                // Close the child window
                driver.close();
            }
        }
        // Switching to Main Window
        driver.switchTo().window(MainWindow);
    }
}
