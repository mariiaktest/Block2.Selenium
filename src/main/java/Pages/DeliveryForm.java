package Pages;

import PageObject.SetUp;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DeliveryForm extends SetUp {
//    public static final String COST_BUTTON = "//span[text() = 'Вартість доставки']";
//    private static final String MAIN_PAGE = "https://novaposhta.ua";
    public static final String CALCULATE_DELIVERY_BUTTON = "input[name = 'yt0']";
    private static final String RECIPIENT_CITY_INPUT = "DeliveryForm_recipientCity" ;
    public static final String COST = "input[name = 'DeliveryForm[optionsSeat][1][cost]']";
    private static final String COST_INPUT = "input[name = 'DeliveryForm[optionsSeat][1][cost]']";
    public static final String SENDER_CITY_INPUT = "DeliveryForm_senderCity";
    public static final String WEIGHT = "input[name = 'DeliveryForm[optionsSeat][1][weight]']";
    public static final String WEIGHT_INPUT = "input[name = 'DeliveryForm[optionsSeat][1][weight]']";
    public static final String LENGTH = "input[name = 'DeliveryForm[optionsSeat][1][weight]']";
    public static final String LENGTH_INPUT = "input[name = 'DeliveryForm[optionsSeat][1][volumetricLength]']";
    public static final String SENDER_CITY = "//span[text() = 'м. Київ, Київська обл.']";
    public static final String RECIPIENT_CITY = "//span[text() = 'м. Дніпро, Дніпропетровська обл.']";
    public static final String WIDTH = "input[name = 'DeliveryForm[optionsSeat][1][volumetricWidth]']";
    public static final String WIDTH_INPUT = "input[name = 'DeliveryForm[optionsSeat][1][volumetricWidth]']";
    public static final String HEIGHT = "input[name = 'DeliveryForm[optionsSeat][1][volumetricHeight]']";
    public static final String HEIGHT_INPUT = "input[name = 'DeliveryForm[optionsSeat][1][volumetricHeight]']";
    public static final String FLOOR_INPUT = "DeliveryForm_floorCountAsc";
    public static final String COST_MESSAGE = "h3";
    public DeliveryForm (WebDriver driver) {
    this.driver = driver;
    }

    public void typeSenderCity(String senderCity) {
        driver.findElement(By.id(SENDER_CITY_INPUT)).sendKeys(senderCity);
    }

    public void clickSenderCity() {
        driver.findElement(By.xpath(SENDER_CITY)).click();
    }

    public void typeRecipientCity(String recipientCity) {
        driver.findElement(By.id(RECIPIENT_CITY_INPUT)).sendKeys(recipientCity);
    }

    public void clickRecipientCity() {
        driver.findElement(By.xpath(RECIPIENT_CITY)).click();
    }

    public void clickCost() {
        driver.findElement(By.cssSelector(COST)).click();
    }

    public void enterCost(String cost) {
        driver.findElement(By.cssSelector(COST_INPUT)).sendKeys(cost);
    }

    public void clickWeightField() {
        driver.findElement(By.cssSelector(WEIGHT)).click();
    }

    public void enterWeight(String weight) {
        driver.findElement(By.cssSelector(DeliveryForm.WEIGHT_INPUT)).sendKeys(weight);
    }

    public void clickLengthField() {
            driver.findElement(By.cssSelector(LENGTH)).click();
        }

    public void enterLength(String length) {
        driver.findElement(By.cssSelector(LENGTH_INPUT)).sendKeys(length);
    }

    public void clickWidthField() {
        driver.findElement(By.cssSelector(WIDTH)).click();
    }

    public void enterWidth(String width) {
        driver.findElement(By.cssSelector(WIDTH_INPUT)).sendKeys(width);
    }

    public void clickHeightField() {
        driver.findElement(By.cssSelector(HEIGHT)).click();
    }

    public void enterHeight(String height) {
        driver.findElement(By.cssSelector(HEIGHT_INPUT)).sendKeys(height);
    }

    public void enterFloor(String floor) {
        driver.findElement(By.id(FLOOR_INPUT)).sendKeys(floor);
    }

    public void clickCalculateButton() {
        driver.findElement(By.cssSelector(CALCULATE_DELIVERY_BUTTON)).click();
    }
    public String getCostMessage() {
        return driver.findElement(By.tagName(COST_MESSAGE)).getText();
    }
}

