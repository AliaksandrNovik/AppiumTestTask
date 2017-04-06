package page;

import driver.DriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MenuPage extends Page{

    private final By connectionButton = By.id("connexion");

    public MenuPage(WebDriver driver) {
        super(driver);
    }

    public LoginPage openLoginPage(){
        driver.findElement(connectionButton).click();
        return new LoginPage(DriverManager.getWebDriver());
    }
}
