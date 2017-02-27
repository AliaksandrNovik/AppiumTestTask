package driver;

import org.openqa.selenium.remote.DesiredCapabilities;

/**
 * Created by aliaksandr on 27.02.17.
 */
public class CapabilityIOS {

    public static DesiredCapabilities getCapabilities(){
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("platformVersion", "10.2");
        caps.setCapability("browserName", "Safari");
        caps.setCapability("platformName", "iOS");
        caps.setCapability("automationName", "XCUITest");
        caps.setCapability("deviceName", "iPhone Simulator");
        return caps;
    }

}
