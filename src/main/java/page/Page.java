package page;

import io.appium.java_client.ios.IOSDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class Page {

    protected WebDriver driver;

    public Page(WebDriver driver) {
        this.driver = driver;
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        PageFactory.initElements(driver, this);

    }

    public void openPage(String urlToPage){
        driver.get(urlToPage);
    }

    public WebElement waitForElement(By locator, long timeOutInSeconds, long sleepInMillis) {
        WebDriverWait wait = new WebDriverWait(driver, timeOutInSeconds, sleepInMillis);
        return wait.until(ExpectedConditions.presenceOfElementLocated(locator));
    }

    public void waitForElement(WebElement waitButton){
        new WebDriverWait(driver, 10).until(ExpectedConditions
                .visibilityOf(waitButton));
    }
}
