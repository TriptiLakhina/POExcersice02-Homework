package org.example;

import org.openqa.selenium.By;

public class BuildYourOwnComputerProductPage extends Utils{
    private By _processor = By.xpath("//select[@name='product_attribute_1']");
    private By _ram = By.xpath("//select[@id='product_attribute_2']");
    private By _hdd_320GB = By.xpath("(//input[@type='radio'])[1]");
    private By _operatingSystem_VistaPremium = By.xpath("(//input[@type='radio'])[4]");
    private By _software_MicrosoftOffice = By.cssSelector("input#product_attribute_5_10");
    private By _software_AcrobatReader = By.xpath("(//input[@type='checkbox'])[2]");
    private By _software_TotalCommander = By.xpath("(//input[@type='checkbox'])[3]");

    public void fillInTheProductSpecificationsRequired() {
        // Select Processor - 2.2 GHz Intel Pentium Dual-Core E2200
        selectElementByIndex(_processor,1);
        // Select Ram - 8 GB
        selectElementByValue(_ram,"5");
        // Click on HDD radio button for 320 GB
        clickOnElement(_hdd_320GB);
        // Click on Operating system radio button for Vista Premium
        clickOnElement(_operatingSystem_VistaPremium);
        // Check all 3 softwares - No need to check on Microsoft Office as it is checked by default, clicking it again will uncheck it.
        clickOnElement(_software_AcrobatReader);
        clickOnElement(_software_TotalCommander);

    }
}
