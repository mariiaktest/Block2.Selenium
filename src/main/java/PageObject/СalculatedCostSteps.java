package PageObject;

import Pages.CalculatedCostPage;
import org.openqa.selenium.WebDriver;

public class –°alculatedCostSteps {
    CalculatedCostPage calculatedCostPage;
    public –°alculatedCostSteps(WebDriver driver) {
        calculatedCostPage = new CalculatedCostPage(driver);
    }
    public String getCostMessage() {
       return calculatedCostPage.getCostMessage();
    }
        }
