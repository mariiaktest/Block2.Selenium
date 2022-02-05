package IntroToAuto;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.time.Duration;

public class vacancy {
    private WebDriver driver;
    private WebDriverWait wait;

    @BeforeTest
    public void setUp () {
      //  driver = new ChromeDriver();
  //driver = new FirefoxDriver();
        driver = new SafariDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        wait = new WebDriverWait(driver, 10);
    }

    @Test(groups = "groupDemo")
    public void groupDemo(){
      //  System.out.println(driver);
        driver.get("https://novaposhta.ua");
        driver.findElement(By.linkText("Вакансії")).click();
        driver.switchTo().frame("RUAFRAME");
        driver.findElement(By.className("listfilter_filters_rubric_opts")).click();
//        driver.findElement(By.xpath("//*[@id='ddlRubric']/option[3]")).click();
//        driver.findElement(By.id("GridView1_ctl04_btnViewVacancy")).click();
//        driver.findElement(By.className("vac_links_apply")).click();
//        driver.get("https://rabota.ua/company477532/vacancy8842242?mode=apply#apply");
//        driver.findElement(By.xpath("//span[text() = 'Откликнуться']")).click();
//        By fileInput = By.cssSelector("input[type=file]");
//        String filePath = "/Users/mariia.karpenko/Desktop/np";
//        driver.findElement(fileInput).sendKeys(filePath);
    }

    @AfterTest
    public void tearDown (){
        driver.close();
    }
}
