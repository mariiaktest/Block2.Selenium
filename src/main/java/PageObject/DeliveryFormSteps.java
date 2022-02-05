package PageObject;

import Pages.DeliveryForm;
import org.openqa.selenium.WebDriver;

public class DeliveryFormSteps {
    DeliveryForm deliveryForm;

    public DeliveryFormSteps(WebDriver driver) {
        deliveryForm = new DeliveryForm(driver);
    }
    public void typeSenderCity (String senderCity) {
        deliveryForm.typeSenderCity(senderCity);
    }
    public void clickSenderCity() {
        deliveryForm.clickSenderCity();
    }
    public void typeRecipientCity (String recipientCity) {
        deliveryForm.typeRecipientCity(recipientCity);
    }
    public void clickRecipientCity() {
        deliveryForm.clickRecipientCity();
    }
    public void clickCost() {
        deliveryForm.clickCost();
    }
    public void enterCost(String cost) {
        deliveryForm.enterCost(cost);
    }
    public void clickWeightField() {
        deliveryForm.clickWeightField();
    }
    public void enterWeight(String weight) {
        deliveryForm.enterWeight(weight);
    }
    public void clickLengthField() {
        deliveryForm.clickLengthField();
    }
    public void enterLength(String length) {
        deliveryForm.enterLength(length);
    }
    public void clickWidthField() {
        deliveryForm.clickWidthField();
    }
    public void enterWidth(String width) {
        deliveryForm.enterWidth(width);
    }
    public void clickHeightField() {
        deliveryForm.clickHeightField();
    }
    public void enterHeight(String height) {
        deliveryForm.enterHeight(height);
    }
    public void enterFloor(String floor) {
        deliveryForm.enterFloor(floor);
    }
    public void clickCalculateButton() {
        deliveryForm.clickCalculateButton();
    }
}

