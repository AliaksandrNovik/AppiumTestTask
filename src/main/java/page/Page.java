package page;

import io.appium.java_client.ios.IOSDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Created by aliaksandr on 26.02.17.
 */
public class Page {

    protected WebDriver driver;

    public Page(WebDriver driver) {
        this.driver = driver;
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
