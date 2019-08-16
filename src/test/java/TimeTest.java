import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.TimeJournalSearchPanel;

public class TimeTest {

    private WebDriver driver;

    @Test
    public void fullNameOfALoggedUserIsShown() {
        String actualUserName = new TimeJournalSearchPanel(driver).findLoggedUserFullName();
        Assert.assertEquals(actualUserName, "Katsiaryna Volkava");
    }

 /*   @Test
    @Deprecated
    public void checkDashboardsAvailability() throws InterruptedException {
        new TimeJournalHeader(driver).goToDashboardsSection();


    }*/
}
