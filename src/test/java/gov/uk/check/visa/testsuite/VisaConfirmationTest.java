package gov.uk.check.visa.testsuite;

import gov.uk.check.visa.customlisteners.CustomListeners;
import gov.uk.check.visa.pages.*;
import gov.uk.check.visa.testbase.BaseTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

@Listeners(CustomListeners.class)

public class VisaConfirmationTest extends BaseTest
{
    SoftAssert softAssert= new SoftAssert();
    StartPage startPage;
    SelectNationalityPage selectNationalityPage;
    ReasonForTravelPage reasonForTravelPage;
    ResultPage resultPage;
    DurationOfStayPage durationOfStayPage;

    @BeforeMethod(alwaysRun = true)
    public void inIT()
    {
        startPage= new StartPage();
        selectNationalityPage= new SelectNationalityPage();
        reasonForTravelPage= new ReasonForTravelPage();
        resultPage= new ResultPage();
        durationOfStayPage = new DurationOfStayPage();
    }

    //1.anAustralianComingToUKForTourism().
    @Test(groups = {"smoke","sanity","regression"})
    public void anAustralianComingToUKForTourism() throws InterruptedException {
        //Accept Cookies
        startPage.acceptCookies();

        //Click On Hide Message Button
        startPage.clickHideMessage();

        //Click on start button
        startPage.clickStartNow();

        //Select a Nationality 'Australia'
        selectNationalityPage.selectNationality("Australia");

        //Click on Continue button
        selectNationalityPage.clickNextStepButton();

        //Select reason 'Tourism'
        reasonForTravelPage.selectReasonForVisit("Tourism or visiting family and friends");

        //Click on Continue button
        reasonForTravelPage.clickNextContinueButton();

        //verify result 'You will not need a visa to come to the UK'
        resultPage.confirmResultMessage("You will not need a visa to come to the UK");
        softAssert.assertAll();
    }

    //2.aChileanComingToTheUKForWorkAndPlansOnStayingForLongerThanSixMonths().
    @Test(groups = {"regression"})
    public void aChileanComingToTheUKForWorkAndPlansOnStayingForLongerThanSixMonths() throws InterruptedException {
        //Accept Cookies
        startPage.acceptCookies();

        //Click On Hide Message Button
        startPage.clickHideMessage();

        //Click on start button
        startPage.clickStartNow();

        //Select a Nationality 'Chile'
        selectNationalityPage.selectNationality("Chile");

        //Click on Continue button
        selectNationalityPage.clickNextStepButton();

        //Select reason 'Work, academic visit or business'
        reasonForTravelPage.selectReasonForVisit("Work, academic visit or business");

        //Click on Continue button
        reasonForTravelPage.clickNextContinueButton();

        //Select intendent to stay for 'longer than 6 months'
        durationOfStayPage.selectLengthOfStay("lessThanSix");

        //Click on Continue button
        durationOfStayPage.clickNextStepButton();

        //Select have planning to work for 'Health and care professional'
        //Click on Continue button
        //verify result 'You need a visa to work in health and care'
    }
    //3.aColumbianNationalComingToTheUKToJoinAPartnerForALongStayTheyDoHaveAnArticle10Or20Card()
    @Test(groups = {"sanity","regression"})
    public void aColumbianNationalComingToTheUKToJoinAPartnerForALongStayTheyDoHaveAnArticle10Or20Card()
    {
        //Accept Cookies
        startPage.acceptCookies();

        //Click On Hide Message Button
        startPage.clickHideMessage();

        //Click on start button
        startPage.clickStartNow();

        //Select a Nationality 'Colombia'
        selectNationalityPage.selectNationality("Colombia");

        //Click on Continue button
        selectNationalityPage.clickNextStepButton();

        //Select reason 'Join partner or family for a long stay'
        reasonForTravelPage.selectReasonForVisit("Join partner or family for a long stay");

        //Click on Continue button
        reasonForTravelPage.clickNextContinueButton();

        //Select state My partner of family member have uk immigration status 'yes'
        //Click on Continue button
        //verify result 'You’ll need a visa to join your family or partner in the UK'
    }

}
