package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class Property extends GeneralPageObject {
    public Property(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "/html/body/tm-root/div[1]/main/div/tm-property-residential-home/div[1]/tm-search-form/div/section/div[1]/div/a[2]")
    private WebElement forRent;

    @FindBy(xpath = "/html/body/tm-root/div[1]/main/div/tm-property-residential-rent-home/div[1]/tm-search-form/div/section/div[2]/div/form/tm-home-search-banner/div/div/div/tg-row[2]/tg-col[1]/tm-location-search-multi-dropdown/div/tg-input-group/div/tg-select-container[1]/div[1]/select")
    private Select regionList;

    public void clickForRent() {
        this.forRent.click();
    }

    public void selectWellington() {
        this.regionList.selectByIndex(1);
    }
}
