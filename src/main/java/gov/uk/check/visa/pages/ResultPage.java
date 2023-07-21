package gov.uk.check.visa.pages;

import gov.uk.check.visa.utilities.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class ResultPage extends Utility
{
    //4.ResultPage - resultMessage locator and create methods 'String getResultMessage()'
    // and 'void confirmResultMessage(String expectedMessage)' (Note Use Assert.assertTrue)
    @CacheLookup
    @FindBy(xpath = "//h2[contains(text(),'You will not need a visa to come to the UK')]")
    WebElement resultMessage;

    public String getTextFromElement()
    {
        return getTextFromElement(resultMessage);
    }
    public void confirmResultMessage(String expectedMessage)
    {
        //verify result 'You will not need a visa to come to the UK'
        Assert.assertTrue(getTextFromElement().equalsIgnoreCase(expectedMessage));
    }
}
