package PageObject;

import Pages.CalculatedCostPage;
import org.openqa.selenium.WebDriver;

public class СalculatedCostSteps {
    CalculatedCostPage calculatedCostPage;
    public СalculatedCostSteps(WebDriver driver) {
        calculatedCostPage = new CalculatedCostPage(driver);
    }
    public String getCostMessage() {
       return calculatedCostPage.getCostMessage();
    }
        }
