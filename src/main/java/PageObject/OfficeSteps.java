package PageObject;

import Pages.OfficePage;
import org.openqa.selenium.WebDriver;

public class OfficeSteps {
    OfficePage officePage;
    public OfficeSteps (WebDriver driver) {
        officePage = new OfficePage(driver);
    }
    public void openOfficeMenu(){
        officePage.openOfficeMenu();
    }
    public void enterCityAndOfficeNumber() {
        officePage.enterCityAndOfficeNumber();
    }
    public String getAddress() {
      return   officePage.getAddress();
    }
    public String  getWeight() {
       return officePage.getWeight();
    }
}
