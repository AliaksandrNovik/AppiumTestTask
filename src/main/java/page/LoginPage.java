package page;

import driver.DriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage extends Page {

    private By loginField = By.id("Compte");

    private By passwordField = By.id("personal_info");

    private By loginButton = By.id("devis");

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public WebElement getLoginField(){
        return driver.findElement(loginField);
    }

    public WebElement getPasswordField(){
        return driver.findElement(passwordField);
    }

    private WebElement getLoginConnectionButton(){
        return  driver.findElement(loginButton);
    }

    public MainPage clickLoginAndOpenMainPage(){
        getLoginConnectionButton().click();
        return new MainPage(DriverManager.getWebDriver());
    }

}
