package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TimeJournalHeader extends BasePage{

    public TimeJournalHeader(WebDriver driver, WebElement dashboardControl) {
        super(driver);
        this.dashboardControl = dashboardControl;
    }

    @FindBy(xpath = "//a[@href='/dashboard/']")
    private WebElement dashboardControl;

    public DashboardsSubheaders goToDashboardsSection() {
        dashboardControl.click();
        return new DashboardsSubheaders();
    }

    @Override
    protected void waitForPageToBeLoaded() {

    }

}
