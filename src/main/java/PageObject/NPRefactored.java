package PageObject;
import Pages.OfficePage;
import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.Assert;

public class NPRefactored extends SetUp {
    public static final String РОЗРАХУНКОВА_ВАРТІСТЬ_ДОСТАВКИ = "Розрахункова вартість доставки";
    public static final String ДНІПРО = "Дніпро";
    public static final String КИЇВ = "Київ";

    @DataProvider(name = "DeliveryCostData", parallel = false)
    public Object [][] createCostData () {
        return new Object[][]{
                {"1000", "10", "20", "30", "15", "7"},
                {"250", "2", "15", "10", "15", "2"},
                {"12500", "15", "32", "32", "32", "14"},
                {"344", "24", "25", "35", "15", "9"},
                {"1030", "15", "34", "34", "18", "4"},
        };
    }

    @Test(dataProvider = "DeliveryCostData")
    public void firstTest (String cost, String weight, String length, String width, String height, String floor){
        OpenDeliveryCostSteps openDeliveryCostSteps = new OpenDeliveryCostSteps(driver);
        openDeliveryCostSteps.clickDeliveryCostButton();
        DeliveryFormSteps deliveryFormSteps = new DeliveryFormSteps(driver);
        deliveryFormSteps.typeSenderCity(КИЇВ);
        deliveryFormSteps.clickSenderCity();
        deliveryFormSteps.typeRecipientCity(ДНІПРО);
        deliveryFormSteps.clickRecipientCity();
        deliveryFormSteps.clickCost();
        deliveryFormSteps.enterCost(cost);
        deliveryFormSteps.clickWeightField();
        deliveryFormSteps.enterWeight(weight);
        deliveryFormSteps.clickLengthField();
        deliveryFormSteps.enterLength(length);
        deliveryFormSteps.clickWidthField();
        deliveryFormSteps.enterWidth(width);
        deliveryFormSteps.clickHeightField();
        deliveryFormSteps.enterHeight(height);
        deliveryFormSteps.enterFloor(floor);
        deliveryFormSteps.clickCalculateButton();
        СalculatedCostSteps calculatedCostSteps = new СalculatedCostSteps(driver);
        String Text = calculatedCostSteps.getCostMessage();
        Assert.assertEquals(Text, РОЗРАХУНКОВА_ВАРТІСТЬ_ДОСТАВКИ);
    }
    @Test
    public void secondTest() {
        OfficeSteps officeSteps = new OfficeSteps(driver);
        officeSteps.openOfficeMenu();
        officeSteps.enterCityAndOfficeNumber();
        String Address = officeSteps.getAddress();
        Assert.assertEquals(Address,"Київ, просп. Відрадний, 6/1");
        officeSteps.getWeight();
        String Weight = officeSteps.getWeight();
        Assert.assertEquals(Weight, "30 кг");
    }
}


