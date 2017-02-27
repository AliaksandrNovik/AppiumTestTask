package tests;

import driver.CapabilityIOS;
import driver.DriverManager;
import io.appium.java_client.events.api.general.SearchingEventListener;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import page.SearchPage;

import java.net.MalformedURLException;
import java.net.URL;

public class ExampleTest {

    @BeforeClass(alwaysRun = true)
    public void setUp() throws MalformedURLException {
        DriverManager.getInstance(new URL("http://0.0.0.0:4723/wd/hub"), CapabilityIOS.getCapabilities());
    }

    @Test
    public void loginTest(){
        SearchPage searchPage = new SearchPage(DriverManager.getWebDriver());
        searchPage.openPage("http://google.com");
        searchPage.setSearchRow("Test task was finished");
        searchPage.pressEnterKey();
    }

    @AfterClass(alwaysRun = true)
    public void afterClass(){
        DriverManager.getWebDriver().quit();
    }



}
