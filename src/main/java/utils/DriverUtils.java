package utils;

import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class DriverUtils {

    public static void setImplicitTimeOut(WebDriver driver) {
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
    }
}
