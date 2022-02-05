package Pages;

import PageObject.SetUp;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CalculatedCostPage extends SetUp {
    public static final String COST_MESSAGE = "h3";

    public CalculatedCostPage (WebDriver driver) {
        this.driver = driver;
    }
    public String getCostMessage() {
       return driver.findElement(By.tagName(COST_MESSAGE)).getText();
    }
}
