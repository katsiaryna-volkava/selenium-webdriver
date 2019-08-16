import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.TimeJournalHeader;
import pages.TimeJournalSearchPanel;

public class TimeTest {

    private WebDriver driver;



    @BeforeMethod(alwaysRun = true)
    public void browserSetup() {
        driver = new ChromeDriver();
        new TimeJournalSearchPanel(driver).goToTJAsParticularUser();
    }

    @AfterMethod(alwaysRun = true)
    public void browserClose() {
        driver.quit();
        driver = null;
    }

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
