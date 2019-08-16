package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TimeJournalHeader {

    private WebDriver driver;

    public TimeJournalHeader(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//a[@href='/dashboard/']")
    private WebElement dashboardControl;

    public DashboardsSubheaders goToDashboardsSection() {
        dashboardControl.click();
        return new DashboardsSubheaders();
    }


}
