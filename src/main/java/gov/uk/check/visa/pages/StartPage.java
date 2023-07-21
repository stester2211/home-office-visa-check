package gov.uk.check.visa.pages;

import gov.uk.check.visa.utilities.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class StartPage extends Utility
{
    @CacheLookup
    @FindBy(xpath = "//button[contains(text(),'Accept additional cookies')]")
    WebElement acceptCookies;
    @CacheLookup
    @FindBy(xpath = "//button[contains(text(),'Hide this message')]")
    WebElement hideMessage;
    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Start now']")
    WebElement startNowButton;
    public void acceptCookies()
    {
        //click On accept cookie button
        clickOnElement(acceptCookies);
    }
    public void clickHideMessage()
    {
        //click on hide button
        clickOnElement(hideMessage);
    }
    public void clickStartNow()
    {
        //Click on start button
        clickOnElement(startNowButton);
    }
}
