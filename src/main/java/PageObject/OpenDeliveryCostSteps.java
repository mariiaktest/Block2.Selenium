package PageObject;

import Pages.OpeningDeliveryCostPage;
import org.openqa.selenium.WebDriver;

public class OpenDeliveryCostSteps {
    OpeningDeliveryCostPage openingDeliveryCostPage;
    public OpenDeliveryCostSteps (WebDriver driver) {
        openingDeliveryCostPage = new OpeningDeliveryCostPage(driver);
    }
    public void clickDeliveryCostButton() {
     openingDeliveryCostPage.clickDeliveryCostButton();
    }
}
