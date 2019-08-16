package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utils.WaitUtils;


public class TimeJournalSearchPanel extends BasePage {


    private static final String USER_FULL_NAME_XPATH = "//following::span[@class='name']//span[@class='display-value']";
    //private static final String USER_FULL_NAME_XPATH = "//span/section[@class='drop-down-display']";

    //  @FindBy(xpath = "//following::span[@class='name']//span[@class='display-value']")
    @FindBy(xpath = USER_FULL_NAME_XPATH)
    private WebElement userFullName;


    public TimeJournalSearchPanel(WebDriver driver) {
        super(driver);
    }


    public TimeJournalSearchPanel goToTJAsParticularUser() {
        driver.get("https://qa.time.epam.com/api/login?make-me=4060741400306100872");
        return this;
    }

    public String findLoggedUserFullName() {
        String loggedUserNameIs = driver.findElement(By.xpath("//following::span[@class='name']//span[@class='display-value']")).getText();
        return loggedUserNameIs;
    }


    @Override
    protected void waitForPageToBeLoaded() {
        WaitUtils.waitUntilVisibilityOfElementLocatedBy(driver, By.xpath(USER_FULL_NAME_XPATH));
    }
}
