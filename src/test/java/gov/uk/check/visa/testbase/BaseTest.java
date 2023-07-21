package gov.uk.check.visa.testbase;

import gov.uk.check.visa.propertyreader.PropertyReader;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import gov.uk.check.visa.utilities.Utility;

public class BaseTest extends Utility
{
    String browser= PropertyReader.getInstance().getProperty("browser");

    @BeforeMethod(alwaysRun = true)
    public void setUp()
    {
        selectBrowser(browser);
    }

    @AfterMethod(alwaysRun = true)
    public void tearDown()
    {
        closeBrowser();
    }

}