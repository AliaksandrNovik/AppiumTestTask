package driver;

import org.openqa.selenium.remote.DesiredCapabilities;

public class CapabilityIOS {

    public static DesiredCapabilities getCapabilities(){
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("app", "/Users/aliaksandr/IdeaProjects/bytestnovik/src/main/resources/cedeo.apk");
        caps.setCapability("platformName", "Android");
        caps.setCapability("platformVersion", "5.1");
        caps.setCapability("udid", "71UBBLJ22KAQ");
        caps.setCapability("deviceName", "Android");
        return caps;
    }

}
