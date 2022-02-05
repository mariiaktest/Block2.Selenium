package Pages;

import PageObject.SetUp;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class OfficePage extends SetUp {

    public static final String ВІДДІЛЕННЯ = "Відділення";
    public static final String SEARCH_BY_NUMBER_OR_CITY = "//*[@id='top_menu']/li[5]/ul/li[3]/a";
    public static final String CITY = "oCityFilter";
    public static final String M_КИЇВ_КИЇВСЬКА_ОБЛ = "li8d5a980d-391c-11dd-90d9-001a92567626";
    public static final String ВВЕСТИ_НОМЕР_ВІДДІЛЕННЯ = "oWarehouseFilter";
    public static final String ВІДДІЛЕННЯ_203 = "oSearchFilter";

    public  OfficePage (WebDriver driver) {
        this.driver = driver;
    }
    public void openOfficeMenu() {
        driver.findElement(By.linkText(ВІДДІЛЕННЯ)).click();
        driver.findElement(By.xpath(SEARCH_BY_NUMBER_OR_CITY)).click();
    }
    public void enterCityAndOfficeNumber() {
        driver.findElement(By.id(CITY)).sendKeys("Київ");
        driver.findElement(By.id(M_КИЇВ_КИЇВСЬКА_ОБЛ)).click();
        driver.findElement(By.id(ВВЕСТИ_НОМЕР_ВІДДІЛЕННЯ)).sendKeys("203");
        driver.findElement(By.id(ВІДДІЛЕННЯ_203)).click();
    }
    public String getAddress(){
        return driver.findElement(By.xpath("//span[text() = 'Київ, просп. Відрадний, 6/1']")).getText();
    }
    public String getWeight() {
        return driver.findElement(By.xpath("//span[text() = '30 кг']")).getText();

    }
}
