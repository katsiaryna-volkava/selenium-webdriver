package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utils.WaitUtils;


public class TimeJournalSearchPanel extends BasePage {

    private static final String USER_FULL_NAME_XPATH = "//following::span[@class='name']//span[@class='display-value']";

    @FindBy(xpath = USER_FULL_NAME_XPATH)
    private WebElement userFullName;

    public TimeJournalSearchPanel(WebDriver driver) {
        super(driver);
    }

    public String findLoggedUserFullName() {
        String loggedUserNameIs = userFullName.getText();
        return loggedUserNameIs;
    }


    @Override
    protected void waitForPageToBeLoaded() {
        WaitUtils.waitUntilVisibilityOfElementLocatedBy(driver, By.xpath(USER_FULL_NAME_XPATH));
    }
}
