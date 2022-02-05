package Homework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.time.Duration;

public class DataProvider {
    private WebDriver driver;
    private WebDriverWait wait;

    @BeforeTest
    public void setUp () {
        driver = new ChromeDriver();
//         driver = new FirefoxDriver();
//         driver = new SafariDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        wait = new WebDriverWait(driver, 10);
    }
    @org.testng.annotations.DataProvider(name = "DeliveryCostData", parallel = false) //change to parallel = true for Task4
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
    public void deliveryCost(String cost, String weight, String length, String width, String height, String floor) {
        driver.get("https://novaposhta.ua/ru/office/view/id/203/city/%D0%9A%D0%B8%D0%B5%D0%B2");
        driver.findElement(By.xpath("//span[text() = 'Стоимость доставки']")).click();
        driver.findElement(By.id("DeliveryForm_senderCity")).sendKeys("Київ");
        driver.findElement(By.xpath("//span[text() = 'м. Київ, Київська обл.']")).click();
        driver.findElement(By.id("DeliveryForm_recipientCity")).sendKeys("Дніпро");
        driver.findElement(By.xpath("//span[text() = 'м. Дніпро, Дніпропетровська обл.']")).click();
        driver.findElement(By.cssSelector("input[name = 'DeliveryForm[optionsSeat][1][cost]']")).click();
        driver.findElement(By.cssSelector("input[name = 'DeliveryForm[optionsSeat][1][cost]']")).sendKeys(cost);
        driver.findElement(By.cssSelector("input[name = 'DeliveryForm[optionsSeat][1][weight]']")).click();
        driver.findElement(By.cssSelector("input[name = 'DeliveryForm[optionsSeat][1][weight]']")).sendKeys(weight);
        driver.findElement(By.cssSelector("input[name = 'DeliveryForm[optionsSeat][1][volumetricLength]']")).click();
        driver.findElement(By.cssSelector("input[name = 'DeliveryForm[optionsSeat][1][volumetricLength]']")).sendKeys(length);
        driver.findElement(By.cssSelector("input[name = 'DeliveryForm[optionsSeat][1][volumetricWidth]']")).click();
        driver.findElement(By.cssSelector("input[name = 'DeliveryForm[optionsSeat][1][volumetricWidth]']")).sendKeys(width);
        driver.findElement(By.cssSelector("input[name = 'DeliveryForm[optionsSeat][1][volumetricHeight]']")).click();
        driver.findElement(By.cssSelector("input[name = 'DeliveryForm[optionsSeat][1][volumetricHeight]']")).sendKeys(height);
        driver.findElement(By.id("DeliveryForm_floorCountAsc")).sendKeys(floor);
        driver.findElement(By.cssSelector("input[name = 'yt0']")).click();
        String Text = driver.findElement(By.tagName("h3")).getText();
        Assert.assertEquals(Text,"Расчетная стоимость доставки" );
    }

}
