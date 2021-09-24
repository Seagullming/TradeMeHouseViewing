package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Homepage extends GeneralPageObject {

    public Homepage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "/html/body/tm-root/div[1]/main/div/tm-dynamic-homepage/tm-homepage-search-header/nav/div[2]/ul/li[4]/a")
    private WebElement property;

    public void clickProperty() {
        this.property.click();
    }
}
