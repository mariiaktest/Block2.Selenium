package Pages;

import PageObject.SetUp;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OpeningDeliveryCostPage extends SetUp {
    public static final String COST_BUTTON = "//span[text() = 'Вартість доставки']";

    public OpeningDeliveryCostPage(WebDriver driver) {
        this.driver = driver;
    }
    public void clickDeliveryCostButton() {
        driver.findElement(By.xpath(COST_BUTTON)).click();
    }
}

