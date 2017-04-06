package page;


import driver.DriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MainPage extends Page{

    private final By userIcon = By.id("user_icon");

    private final By userName = By.id("user_icon");

    public MainPage(WebDriver driver) {
        super(driver);
    }

    public MenuPage openRightSideMenu(){
        driver.findElements(By.className("android.widget.ImageButton")).get(0).click();
        return new MenuPage(DriverManager.getWebDriver());
    }

    public WebElement getUserIcon(){
        return driver.findElement(userIcon);
    }

    public WebElement getUserName(){
        return driver.findElement(userName);
    }
}
