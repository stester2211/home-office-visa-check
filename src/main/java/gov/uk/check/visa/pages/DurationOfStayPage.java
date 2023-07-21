package gov.uk.check.visa.pages;

import gov.uk.check.visa.utilities.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class DurationOfStayPage extends Utility
{
    //7.DurationOfStayPage - nextStepButton, lessThanSixMonths, moreThanSixMonths locators and create methods
    //  'void selectLengthOfStay(String moreOrLess)' (Note: use switch statement for select moreOrLess stay) and
    //  'void clickNextStepButton()'

    @CacheLookup
    @FindBy(xpath = "//input[@id='response-0']")
    WebElement lessThanSixMonths;
    @CacheLookup
    @FindBy(xpath = "//input[@id='response-1']")
    WebElement moreThanSixMonths;
    @CacheLookup
    @FindBy(xpath = "//button[contains(text(),'Continue')]")
    WebElement nextStepButton;

    public void selectLengthOfStay(String moreOrLess)
    {
        switch (moreOrLess)
        {
            case "lessThanSix":
                clickOnElement(lessThanSixMonths);
                break;
            case "moreThanSix":
                clickOnElement(moreThanSixMonths);
                break;
        }
    }
    public void clickNextStepButton()
    {
        clickOnElement(nextStepButton);
    }

}
