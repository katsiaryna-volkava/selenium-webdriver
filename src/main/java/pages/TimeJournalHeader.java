package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TimeJournalHeader extends BasePage{

    public TimeJournalHeader(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//a[@href='/dashboard/']")
    private WebElement dashboardControl;

    public DashboardsSubheaders goToDashboardsSection() {
        dashboardControl.click();
        return new DashboardsSubheaders(driver);
    }

    @Override
    protected void waitForPageToBeLoaded() { }
}
