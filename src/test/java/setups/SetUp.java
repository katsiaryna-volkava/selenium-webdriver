package setups;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import pages.TimeJournalSearchPanel;

import java.nio.file.Path;
import java.nio.file.Paths;

public class SetUp {

    private WebDriver driver;

    private static final Path COMMON_DRIVER_CROSSPLATFORM_PATH = Paths.get("C:\\Users\\Katsiaryna_Volkava\\Documents\\LEARNING\\mentoring\\ATM\\idea_projects\\time\\src\\main\\resources");
    private static final String GOOGLE_CHROME_DRIVER_EXECUTABLE = "chromedriver.exe";
    private static final String CHROME_DRIVER_PROPERTY = "webdriver.chrome.driver";
    private static final String URL_FOR_LOGIN = "https://qa.time.epam.com/api/login?make-me=4060741400306100872";

    @BeforeMethod
    public void browserSetup() {
        prepareChromeBrowser();
        loginAsUserAndHomePageIsOpened();
    }

    void loginAsUserAndHomePageIsOpened() {
        driver.get(URL_FOR_LOGIN);
    }


    void prepareChromeBrowser() {
        String chromeDriverPath = COMMON_DRIVER_CROSSPLATFORM_PATH.resolve(GOOGLE_CHROME_DRIVER_EXECUTABLE).toString();
        System.setProperty(CHROME_DRIVER_PROPERTY, chromeDriverPath);
        driver = new ChromeDriver();
    }

    @AfterMethod
    public void browserClose() {
        driver.quit();
    }
}
