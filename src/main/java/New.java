//import Pages.CalculatedCostPage;
//import Pages.DeliveryForm;
//import Pages.OpeningDeliveryCostPage;
//import PageObject.СalculatedCostSteps;
//import org.openqa.selenium.WebDriver;
//import org.testng.Assert;
//
//public class New {
//    public static final String COST_BUTTON = "//span[text() = 'Вартість доставки']";
//    private static final String MAIN_PAGE = "https://novaposhta.ua";
//    public static final String CALCULATE_DELIVERY_BUTTON = "input[name = 'yt0']";
//    private static final String RECIPIENT_CITY_INPUT = "DeliveryForm_recipientCity";
//    public static final String COST = "input[name = 'DeliveryForm[optionsSeat][1][cost]']";
//    private static final String COST_INPUT = "input[name = 'DeliveryForm[optionsSeat][1][cost]']";
//    public static final String SENDER_CITY_INPUT = "DeliveryForm_senderCity";
//    public static final String WEIGHT = "input[name = 'DeliveryForm[optionsSeat][1][weight]']";
//    public static final String WEIGHT_INPUT = "input[name = 'DeliveryForm[optionsSeat][1][weight]']";
//    public static final String LENGTH = "input[name = 'DeliveryForm[optionsSeat][1][weight]']";
//    public static final String LENGTH_INPUT = "input[name = 'DeliveryForm[optionsSeat][1][volumetricLength]']";
//    public static final String SENDER_CITY = "//span[text() = 'м. Київ, Київська обл.']";
//    public static final String RECIPIENT_CITY = "//span[text() = 'м. Дніпро, Дніпропетровська обл.']";
//    public static final String WIDTH = "input[name = 'DeliveryForm[optionsSeat][1][volumetricWidth]']";
//    public static final String WIDTH_INPUT = "input[name = 'DeliveryForm[optionsSeat][1][volumetricWidth]']";
//    public static final String HEIGHT = "input[name = 'DeliveryForm[optionsSeat][1][volumetricHeight]']";
//    public static final String HEIGHT_INPUT = "input[name = 'DeliveryForm[optionsSeat][1][volumetricHeight]']";
//    public static final String FLOOR_INPUT = "DeliveryForm_floorCountAsc";
//    DeliveryForm deliveryForm;
//    OpeningDeliveryCostPage openingDeliveryCostPage;
//    CalculatedCostPage calculatedCostPage;
//
//    public New(WebDriver driver) {
//        deliveryForm = new DeliveryForm(driver);
//        openingDeliveryCostPage = new OpeningDeliveryCostPage(driver);
//        calculatedCostPage = new CalculatedCostPage(driver);
//    }
//
//    public void clickDeliveryCostButton() {
//        deliveryForm.clickDeliveryCostButton();
//    }
//
//    public String enterDeliveryForm(String data) {
//        deliveryForm.typeSenderCity(КИЇВ);
//        deliveryForm.clickSenderCity();
//        deliveryForm.typeRecipientCity(ДНІПРО);
//        deliveryForm.clickRecipientCity();
//        deliveryForm.clickCost();
//        deliveryForm.enterCost(cost);
//        deliveryForm.clickWeightField();
//        deliveryForm.enterWeight(weight);
//        deliveryForm.clickLengthField();
//        deliveryForm.enterLength(length);
//        deliveryForm.clickWidthField();
//        deliveryForm.enterWidth(width);
//        deliveryForm.clickHeightField();
//        deliveryForm.enterHeight(height);
//        deliveryForm.enterFloor(floor);
//        deliveryForm.clickCalculateButton();
//        СalculatedCostSteps calculatedCostSteps = new СalculatedCostSteps(driver);
//        String Text = calculatedCostSteps.getCostMessage();
//        Assert.assertEquals(Text, РОЗРАХУНКОВА_ВАРТІСТЬ_ДОСТАВКИ);
//    }
//
//    }
