import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class Runner {

    private JavascriptExecutor js;

    @FindBy(xpath = "//span/section[@class='drop-down-display']")
     private WebElement userName;

    public void testing() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        js = (JavascriptExecutor) driver;

        driver.get("https://qa.time.epam.com/api/login?make-me=4060741400306100872");
        js.executeScript("arguments[0].click()",driver.findElement(By.xpath("//following::span[@class='name']//span[@class='display-value']")));

        Thread.sleep(5000);
    }


    public static void main(String[] args) throws InterruptedException {
        Runner runner = new Runner();
        runner.testing();
    }
}
