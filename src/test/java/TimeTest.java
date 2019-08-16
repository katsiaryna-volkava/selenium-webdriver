import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.TimeJournalHeader;
import pages.TimeJournalSearchPanel;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;

public class TimeTest {

    private WebDriver driver;

    @Test
    public void userIsLoggedInViaMakeMe() {
        String actualUserName = new TimeJournalSearchPanel(driver).findLoggedUserFullName();
        Assert.assertEquals(actualUserName, "Katsiaryna Volkava");
    }

  /*  @Test
    @Deprecated
    public void checkDashboardsAvailability() throws InterruptedException {
        new TimeJournalHeader(driver).goToDashboardsSection();


    }*/
}
