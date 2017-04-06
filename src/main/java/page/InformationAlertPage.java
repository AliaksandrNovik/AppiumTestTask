package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class InformationAlertPage extends Page{

    private String annulerClassLocatorId = "button2";

    public InformationAlertPage(WebDriver driver) {
        super(driver);
    }

    public WebElement getAnnularButton(){
        return driver.findElement(By.id(annulerClassLocatorId));
    }

}
