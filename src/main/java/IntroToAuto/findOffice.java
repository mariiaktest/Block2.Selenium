package IntroToAuto;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.time.Duration;

public class findOffice {
    private WebDriver driver;
    private WebDriverWait wait;
    @BeforeTest
    public void setUp () {
       driver = new ChromeDriver();
       //driver = new FirefoxDriver();
        // driver = new SafariDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        wait = new WebDriverWait(driver, 10);
    }
    @Test
    public void findOffice () {
        driver.get("https://novaposhta.ua");
        driver.findElement(By.linkText("Відділення")).click();
        driver.findElement(By.xpath("//*[@id='top_menu']/li[5]/ul/li[3]/a")).click();
        driver.findElement(By.id("oCityFilter")).sendKeys("Київ");
        driver.findElement(By.id("li8d5a980d-391c-11dd-90d9-001a92567626")).click();
        driver.findElement(By.id("oWarehouseFilter")).sendKeys("203");
        driver.findElement(By.id("oSearchFilter")).click();
        String address = String.valueOf(driver.findElement(By.xpath("//span[text() = 'Киев, просп. Отрадный, 6/1']")).getText());
        Assert.assertEquals(address,"Киев, просп. Отрадный, 6/1");
        String weight = driver.findElement(By.xpath("//span[text() = '30 кг']")).getText();
        Assert.assertEquals(weight, "30 кг");
    }
    @AfterTest
    public void tearDown (){
        driver.close();
    }
}
