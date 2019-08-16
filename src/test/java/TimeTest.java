import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;

import org.testng.annotations.Test;
import pages.TimeJournalHeader;
import pages.TimeJournalSearchPanel;

import java.util.ArrayList;
import java.util.List;

public class TimeTest {

    private WebDriver driver;
    private List<String> dashboardsThatAreExpectedToBeAvailable;

    {
        dashboardsThatAreExpectedToBeAvailable = new ArrayList<>();
        dashboardsThatAreExpectedToBeAvailable.add("Project");
        dashboardsThatAreExpectedToBeAvailable.add("Overtime");
        dashboardsThatAreExpectedToBeAvailable.add("HR Dashboard");
    }

    @Test
    public void checkThatCorrectUseIsLoggedIn() {
        String actualUserName = new TimeJournalSearchPanel(driver).findLoggedUserFullName();
        Assert.assertEquals(actualUserName, "Katsiaryna Volkava");
    }

    @Test
    public void checkDashboardsAvailability() {
        List<String> availableDashboards = new TimeJournalHeader(driver)
                .goToDashboardsSection()
                .findAvailableDashboards();
        Assert.assertEquals(availableDashboards, dashboardsThatAreExpectedToBeAvailable);

    }
}
