package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import java.time.Duration;

public class SetUp {
   public WebDriver driver;
   private static final String MAIN_PAGE = "https://novaposhta.ua";

//    public SetUp(WebDriver driver) {
//        this.driver = driver;
//        wait = new WebDriverWait(driver,Duration.ofSeconds(10));
//    }

    @BeforeTest
    public void setUp() {
        System.out.println("Base test before");
        driver = new ChromeDriver();
       // driver = new FirefoxDriver();
       // driver = new SafariDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.get(MAIN_PAGE);
        }
    @AfterTest
    public void tearDown() {
        driver.quit();
        driver = null;
    }
}
