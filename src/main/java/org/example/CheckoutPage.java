package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;

public class CheckoutPage extends Utils{
    private By _billingFirstName = By.cssSelector("input#BillingNewAddress_FirstName");
    private By _billingLastName = By.xpath("(//input[@type='text'])[3]");
    private By _billingEmail = By.xpath("(//input[@type='email'])[1]");
    private By _billingCountry = By.xpath("//select[contains(@name,'CountryId')]");
    private By _billingCity = By.xpath("//input[contains(@name,'City')]");
    private By _billingAddress1 = By.xpath("//input[contains(@id,'Address1')]");
    private By _zip_PostalCode = By.xpath("//input[contains(@name,'ZipPostalCode')]");
    private By _phoneNumber = By.xpath("//input[contains(@name,'PhoneNumber')]");
    private By _billingContinueButton = By.xpath("(//button[contains(@name,'save')])[1]");
    private By _shippingMethod_NextDayAir_RadioButton = By.cssSelector("input#shippingoption_1");
    private By _shippingMethodContinueButton = By.xpath("//button[starts-with(@class,'button-1 shipping')]");
    private By _paymentMethod_CreditCard_RadioButton = By.cssSelector("input#paymentmethod_1");
    private By _paymentMethodContinueButton = By.xpath("//button[contains(@class,'payment-method')]");
    private By _paymentInformationContinueButton = By.xpath("//button[contains(@class,'payment-info')]");
    private By _selectCreditCard_Dropdown = By.cssSelector("select.dropdownlists");
    private By _cardholderName = By.xpath("//input[@name='CardholderName']");
    private By _cardNumber = By.xpath("//input[@name='CardNumber']");
    private By _expirationDate_Month = By.xpath("//select[@name='ExpireMonth']");
    private By _expirationDate_Year = By.xpath("//select[@name='ExpireYear']");
    private By _cardCode = By.xpath("//input[@id='CardCode']");
    private By _billingAddressDetails = By.xpath("(//ul[@class='info-list'])[1]");
    private By _shippingAddressDetails = By.xpath("(//ul[@class='info-list'])[3]");
    private By _orderConfirmButton = By.xpath("//button[contains(@class,'confirm-order')]");

    public void fillInCheckoutDetailsAsGuestUser() {
        // Type First name
        typeText(_billingFirstName,"TestFirstName");
        // Type Last name
        typeText(_billingLastName,"TestLastName");
        // Type Email
        typeText(_billingEmail,"TestEmail@gmail.com");
        // Select Country from dropdown
        selectElementByText(_billingCountry,"United Kingdom");
        // Type City
        typeText(_billingCity,"London");
        // Type Address 1
        typeText(_billingAddress1,"33 Blairhead Drive");
        // Type Zip/Postal code
        typeText(_zip_PostalCode,"SH64 1GH");
        // Type phone number
        typeText(_phoneNumber,"07557123456");
        // Click on Continue
        clickOnElement(_billingContinueButton);
        // Click on shipping method radio button - next day air
        clickOnElement(_shippingMethod_NextDayAir_RadioButton);
        // Click on Shipping method continue button
        clickOnElement(_shippingMethodContinueButton);
        // Click on credit card as payment method
        clickOnElement(_paymentMethod_CreditCard_RadioButton);
        // Click on payment method continue button
        clickOnElement(_paymentMethodContinueButton);
        // Select credit card from dropdown
        selectElementByText(_selectCreditCard_Dropdown,"Visa");
        // Type Cardholder's name
        typeText(_cardholderName,"Test Name");
        // Type Card number - 4024007140689935
        typeText(_cardNumber,"4024007140689935");
        // Select Expiration date - Month 06 from dropdown
        selectElementByValue(_expirationDate_Month,"6");
        // Select Expiration date - Year 2030 from dropdown
        selectElementByText(_expirationDate_Year,"2030");
        // Type card code - 233
        typeText(_cardCode,"233");
        // Click on payment information Continue button
        clickOnElement(_paymentInformationContinueButton);
        // Assert to verify Shipping address is same as Billing address as shipping address ticked for to be same as billing address
        String billingAddress = getTextFromElement(_billingAddressDetails);
        String shippingAddress = getTextFromElement(_shippingAddressDetails);
        Assert.assertEquals(billingAddress,shippingAddress,"Shipping address does not match the billing address");
        // Click on confirm button
        clickOnElement(_orderConfirmButton);
    }
}
