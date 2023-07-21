package gov.uk.check.visa.pages;

import gov.uk.check.visa.utilities.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class SelectNationalityPage extends Utility
{
    @CacheLookup
    @FindBy(xpath = "//select[@id='response']")
    WebElement nationalityDropDownList;
    @CacheLookup
    @FindBy(xpath = "//button[normalize-space()='Continue']")
    WebElement nextStepButton;

    public void selectNationality(String nationality)
    {
        //Select a Nationality 'Australia'
        selectByVisibleTextFromDropDown(nationalityDropDownList, nationality);
    }
    public void clickNextStepButton()
    {
        //Click on Continue button
        clickOnElement(nextStepButton);
    }
}
