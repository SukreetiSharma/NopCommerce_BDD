package BaseClass;

import PageFactory.PageFactory;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {
    public  static WebDriver driver;
    protected static PageFactory pageFactory;

    public static void setup() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://admin-demo.nopcommerce.com");
        pageFactory = new PageFactory(driver);
    }

    public static void close(){
        driver.close();
    }
}