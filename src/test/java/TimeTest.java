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

    private static final Path COMMON_DRIVER_CROSSPLATFORM_PATH = Paths.get("C:\\Users\\Katsiaryna_Volkava\\Documents\\LEARNING\\mentoring\\ATM\\idea_projects\\time\\src\\main\\resources");
    private static final String GOOGLE_CHROME_DRIVER_EXECUTABLE = "chromedriver.exe";
    private static final String CHROME_DRIVER_PROPERTY = "webdriver.chrome.driver";

    @BeforeMethod(alwaysRun = true)
    public void browserSetup() {
        prepareChromeBrowser();
        new TimeJournalSearchPanel(driver).goToTJAsParticularUser();
    }

    void prepareChromeBrowser() {
        String chromeDriverPath = COMMON_DRIVER_CROSSPLATFORM_PATH.resolve(GOOGLE_CHROME_DRIVER_EXECUTABLE).toString();
        System.setProperty(CHROME_DRIVER_PROPERTY, chromeDriverPath);
        driver = new ChromeDriver();
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
