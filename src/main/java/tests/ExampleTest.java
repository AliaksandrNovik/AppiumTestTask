package tests;

import driver.CapabilityIOS;
import driver.DriverManager;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import page.InformationAlertPage;
import page.LoginPage;
import page.MainPage;
import page.MenuPage;
import sun.applet.Main;

import java.net.MalformedURLException;
import java.net.URL;

public class ExampleTest {

    @BeforeClass(alwaysRun = true)
    public void setUp() throws MalformedURLException {
        DriverManager.getInstance(new URL("http://0.0.0.0:4723/wd/hub"), CapabilityIOS.getCapabilities());
    }

    @Test
    public void loginTest(){
        InformationAlertPage alertMessage = new InformationAlertPage(DriverManager.getWebDriver());
        alertMessage.getAnnularButton().click();
        MainPage mainPage = new MainPage(DriverManager.getWebDriver());
        MenuPage menuPage = mainPage.openRightSideMenu();
        LoginPage loginPage = menuPage.openLoginPage();
        loginPage.getLoginField().sendKeys(System.getProperty("login"));
        loginPage.getPasswordField().sendKeys(System.getProperty("passwd"));
        mainPage = loginPage.clickLoginAndOpenMainPage();
        Assert.assertTrue(mainPage.getUserIcon().isDisplayed(), "User icon should be dsiplayed");
        Assert.assertTrue(mainPage.getUserName().isDisplayed(), "user name should be displayed");
    }

    @AfterClass(alwaysRun = true)
    public void afterClass(){
        DriverManager.getWebDriver().quit();
    }



}
