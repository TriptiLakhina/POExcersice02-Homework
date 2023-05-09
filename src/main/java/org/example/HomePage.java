package org.example;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.testng.Assert;

import java.util.Iterator;
import java.util.Set;


public class HomePage extends Utils {
    // Storing locators as global variables
    private By _registerLink = By.xpath("//a[@href=\"/register?returnUrl=%2F\"]");
    private By _communityPollGoodButton = By.xpath("//input[@id=\"pollanswers-2\"]");
    private By _communityPollVoteButton = By.xpath("//button[@id=\"vote-poll-1\"]");
    private By _communityPollErrorMessage = By.xpath("//div[@id= \"block-poll-vote-error-1\"]");
    private By _addToCartButton_AppleMacBookPro13Inch = By.xpath("//div[@class=\"product-grid home-page-product-grid\"]/div[2]/div[2]/div[1]/div[2]/div[3]/div[2]/button[1]");
    private By _addToCompareButton_HTCOneM8AndroidL5Lollipop = By.xpath("//div[@class=\"product-grid home-page-product-grid\"]/div[2]/div[3]/div[1]/div[2]/div[3]/div[2]/button[2]");
    private By _successNotificationBarClose = By.xpath("//div[@class=\"bar-notification success\"]/span");
    private By _addToCompareButton_$25VirtualGiftCard = By.xpath("//div[@class=\"product-grid home-page-product-grid\"]/div[2]/div[4]/div[1]/div[2]/div[3]/div[2]/button[2]");
    private By _productComparisonLinkFromSuccessNotificationBar = By.xpath("//div[@class=\"bar-notification success\"]/p/a");
    private By _electronicsCategoryMenu = By.xpath("//ul[@class=\"top-menu notmobile\"]/li[2]/a");
    private By _loginLink = By.xpath("//a[@href=\"/login?returnUrl=%2F\"]");
    private By _actualCommunityPollExcellentVoteMessage = By.xpath("By.xpath(//ul[@class=\"poll-results\"]/li[1])");
    private By _actualCommunityPollGoodVoteMessage = By.xpath("By.xpath(//ul[@class=\"poll-results\"]/li[2])");
    private By _actualCommunityPollPoorVoteMessage = By.xpath("By.xpath(//ul[@class=\"poll-results\"]/li[3])");
    private By _actualCommunityPollVeryBadVoteMessage = By.xpath("By.xpath(//ul[@class=\"poll-results\"]/li[4])");
    private By _actualCommunityPollVoteCountMessage = By.xpath("//span[contains(@class,\"poll-total\")]");
    private By _productTitles = By.cssSelector("div.product-grid h2");
    private By _searchButton = By.xpath("//button[@class='button-1 search-box-button']");
    private By _currencySelector = By.cssSelector("select[name=customerCurrency]");
    private By _productPricesFeaturedProducts = By.cssSelector("div.prices");
    private By _searchTextBox = By.cssSelector("input#small-searchterms");
    private By _buildYourOwnComputer = By.xpath("//a[text()='Build your own computer']");
    private By _newRelease_News = By.xpath("//a[text()='nopCommerce new release!']");
    private By _welcomeToStoreMessage = By.cssSelector("div.topic-block-title");
    private By _facebookButton = By.cssSelector("li.facebook");



    public void clickOnRegisterLink() {
        // Click on register link
        clickOnElement(_registerLink);
    }

    public void clickOnGoodButton() {
        // Implying explicit wait
        explicitWait_UrlMatches("https://demo.nopcommerce.com/");
        explicitWait_ElementToBeClickable(_communityPollGoodButton);
        // Click on Good radio button
        clickOnElement(_communityPollGoodButton);

    }

    public void clickOnVoteButton() {
        // Click on Vote button
        clickOnElement(_communityPollVoteButton);
    }

    public void verifyUserCanNotVoteSuccessfully() {
        String expectedErrorMsg_CommunityPoll = "Please register to Vote";
        // Explicit wait to capture the disappearing text
        explicitWait_ElementToBeClickable(_communityPollErrorMessage);
        // Get Error message Text
        String actualErrorMessageForCommunityPoll = getTextFromElement(_communityPollErrorMessage);
        // Assert to verify if the actual message is same as expected message
        Assert.assertEquals(actualErrorMessageForCommunityPoll, expectedErrorMsg_CommunityPoll, "Community poll is not working");
    }

    public void addToCartButton_AppleMacBookPro13Inch() {
        // Click on add to cart button of Apple MacBook Pro 13-inch
        clickOnElement(_addToCartButton_AppleMacBookPro13Inch);
    }

    public void addToCompare_HTCOneM8AndroidL5Lollipop() {
        // Click on add to compare for Product 1 - HTC One M8 Android L 5.0 Lollipop
        clickOnElement(_addToCompareButton_HTCOneM8AndroidL5Lollipop);
    }

    public void closeSuccessNotificationBar() {
        // Close the Green coloured success notification bar
        explicitWait_ElementToBeClickable(_successNotificationBarClose);
        clickOnElement(_successNotificationBarClose);
    }

    public void addToCompare_$25VirtualGiftCard() {
        // Click on add to compare for product 2 - $25 Virtual Gift Card - from homepage (featured products)
        explicitWait_InvisibilityOfElementLocated(_successNotificationBarClose);
        clickOnElement(_addToCompareButton_$25VirtualGiftCard);
    }

    public void openProductComparisonFromSuccessNotificationBar() {
        // Click on Green colour success notification bar to open the Product comparison list
        explicitWait_ElementToBeClickable(_productComparisonLinkFromSuccessNotificationBar);
        clickOnElement(_productComparisonLinkFromSuccessNotificationBar);
    }

    public void clickOnElectronicsCategoryMenu() {
        // Click on Electronics menu
        clickOnElement(_electronicsCategoryMenu);
    }


    public void clickOnLoginLink() {
        // Click on login link on homepage
        clickOnElement(_loginLink);

    }

    public void captureActualVoteMessage_RegisteredUser() {
        String expectedTotalVoteCountMessage = "18 votes";
        // Capturing the text on Vote poll for registered customers
        explicitWait_InvisibilityOfElementLocated(_communityPollVoteButton);
        explicitWait_VisibilityOfElementLocated(_actualCommunityPollVoteCountMessage, 20);
        explicitWait_ElementToBeClickable(_actualCommunityPollExcellentVoteMessage);
        String actualCountMessage = getTextFromElement(_actualCommunityPollVoteCountMessage);

        // Printing the message displayed to registered user on vote poll
        System.out.println("Message displayed to registered user after vote poll: ");
        System.out.println("Total no of votes: " + actualCountMessage);
        Assert.assertEquals(actualCountMessage, expectedTotalVoteCountMessage, "Community poll is not giving the correct count for registered users vote");

    }


    public void printoutProductTitles() {
        getTextFromElements(_productTitles);

    }


    public void verifySearchAlertMessage() {
        String expectedSearchAlertMessage = "Please enter some search keyword";
        clickOnElement(_searchButton);
        // Creating object to switch to alert
        Alert alert = driver.switchTo().alert();
        // Asserting to verify the alert popup message
        Assert.assertEquals(alert.getText(), "Please enter some search keyword");
        // Accepting alert
        alert.accept();

    }

    public void openProduct_BuildYourOwnComputer() {
        // Click on 'Build your own computer
        clickOnElement(_buildYourOwnComputer);
    }

    public void verifyCommunityPollAlertMessage() {
        // Click on Vote Button
        clickOnElement(_communityPollVoteButton);
        // Get the alert message text
        handleAlertMessage_GetText();
        // Assert to verify the alert message text
        Assert.assertEquals(handleAlertMessage_GetText(), "Please select an answer", "Wrong alert message display");
        // Accept the alert message
        handleAlertMessage_Accept();

    }

    public void clickOnNewRelease() {
        clickOnElement(_newRelease_News);
    }

    public void verifyUserCanSelectTheCurrencyUSD() {
        // Select US Dollar from dropdown
        selectElementByIndex(_currencySelector, 0);
        Assert.assertEquals(getTextFromElements(_productPricesFeaturedProducts).contains('$'),true,"All products do not display the selected currency$");

    }
    public void verifyUserCanSelectTheCurrencyEuro() {
        // Select US Dollar from dropdown
        selectElementByIndex(_currencySelector, 1);
        Assert.assertEquals(getTextFromElements(_productPricesFeaturedProducts).contains('€'),true,"All products do not display the selected currency€");

    }

    public void verifyUserSeeCorrectProductsInSearch() {
        // Type product name in Search text box
        typeText(_searchTextBox, "Nike");
        // Click on search button
        clickOnElement(_searchButton);
        // Verify the products displayed contains text searched for
        Assert.assertEquals(getTextFromElements(_productTitles).contains("Nike"), true, "search does not show the correct products");

    }

    public void clickOnFacebookIconLink()
    {
        String MainWindow = getWindowHandle();
        String mainWindowURL = getCurrentUrl();
        System.out.println("Main Window url is: " + mainWindowURL);
        clickOnElement(_facebookButton);
        // To handle all new opened windows
        Set<String> s1 = driver.getWindowHandles();
        Iterator<String> i1 = s1.iterator();

        while (i1.hasNext())
        {
            String ChildWindow = i1.next();
            if (!MainWindow.equalsIgnoreCase(ChildWindow))
            {
                // Switching to Child Window
                driver.switchTo().window(ChildWindow);

            }
        }
    }



    public void verifyHomePageWelcomeMessage() {
        String actualWelcomeMessage = getTextFromElement(_welcomeToStoreMessage);
        System.out.println(actualWelcomeMessage);
//        Assert.assertEquals(actualWelcomeMessage,"Welcome", "Welcome message is wrong");
        //Welcome to our store
    }



}





