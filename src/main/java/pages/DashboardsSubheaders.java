package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class DashboardsSubheaders extends BasePage{


    @FindBy(xpath = "//div[@class = 'subheader']/*")
    private List<WebElement> dasboards;

    private List<String> availableDashboards;


    public DashboardsSubheaders(WebDriver driver) {
        super(driver);
    }

    public List<String> findAvailableDashboards() {
        for (WebElement dashboard : dasboards) {
            availableDashboards.add(dashboard.getText());
        }
        return availableDashboards;
    }



    @Override
    protected void waitForPageToBeLoaded() {

    }
}
