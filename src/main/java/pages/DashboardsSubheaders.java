package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class DashboardsSubheaders {

    private WebDriver driver;

    @FindBy(xpath = "")
    private List<WebElement> avalaibleDashboards;
}
