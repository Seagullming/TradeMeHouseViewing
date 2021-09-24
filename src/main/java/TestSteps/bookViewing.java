package TestSteps;

import PageObjects.Homepage;
import PageObjects.Property;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class bookViewing {

    private static final WebDriver driver = new ChromeDriver();

    @BeforeSuite
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "chromedriver");
    }

    @Test(testName = "bookViewing")
    public static void bookViewing() {
        driver.get("https://www.trademe.co.nz/");
        driver.manage().window().maximize();
        Homepage home = new Homepage(driver);
        home.clickProperty();
        driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
        Property item = new Property(driver);
        item.clickForRent();
        item.selectWellington();
    }
}
