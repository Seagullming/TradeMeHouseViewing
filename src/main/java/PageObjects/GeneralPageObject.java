package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class GeneralPageObject {
    WebDriver driver;

    public GeneralPageObject(WebDriver driver)
    {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }
}
