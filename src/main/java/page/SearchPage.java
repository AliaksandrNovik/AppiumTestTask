package page;


import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchPage extends Page{

    @FindBy(css ="#lst-ib")
    public WebElement searchRow;

    public SearchPage(WebDriver driver) {
        super(driver);
    }

    public void setSearchRow(String textData){
        searchRow.sendKeys(textData);
    }

    public void pressEnterKey(){
        searchRow.sendKeys(Keys.ENTER);
    }

}
