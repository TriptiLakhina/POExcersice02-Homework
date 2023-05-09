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
        String facebookURL = getCurrentUrl();
        System.out.println("Child Window url is: " + facebookURL);
        Assert.assertEquals(facebookURL, "https://www.facebook.com/nopCommerce", "URL does not match");
        Assert.assertEquals(facebookURL.contains(getTextFromElement(_pageTitle_Facebook)),true,"URL does not match to the directed page");
//        explicitWait_ElementToBeClickable(_allowCookies);
        clickOnElement(_allowCookies);
        explicitWait_ElementToBeClickable(_closeFB_NopCommerceConnectPopUpWindow);
        clickOnElement(_closeFB_NopCommerceConnectPopUpWindow);
        arrayListSizeNotEqualToZero(_fbEmail_Phone,"Element Email is Present","Element Email is Absent");
//        if(driver.findElements(_fbEmail_Phone).size() != 0){
//            System.out.println("Element Email is Present");
//        }else{
//            System.out.println("Element Email is Absent");
//        }

        arrayListSizeNotEqualToZero(_fbPassword,"Element Password is Present","Element Password is Absent");
//        if(driver.findElements(_fbPassword).size() != 0){
//            System.out.println("Element Password is Present");
//        }else{
//            System.out.println("Element Password is Absent");
//        }

        arrayListSizeNotEqualToZero(_fbLoginButton,"Element LogIn is Present","Element LogIn is Absent");
//        if(driver.findElements(_fbLoginButton).size() != 0){
//            System.out.println("Element LogIn is Present");
//        }else{
//            System.out.println("Element LogIn is Absent");
//        }



    }
    public void switchToMainWindow() {

        String childWindow = getWindowHandle();
        Set<String> s1 = driver.getWindowHandles();
        Iterator<String> i1 = s1.iterator();

        while (i1.hasNext()) {
            String MainWindow = i1.next();
            if (!childWindow.equalsIgnoreCase(MainWindow)) {
                // Switching to Main Window
                driver.switchTo().window(MainWindow);

            }
        }
   }
    public void closeChildWindow(){
        String facebookUrl = getWindowHandle();
        driver.close();
    }







}
