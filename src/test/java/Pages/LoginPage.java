package Pages;

import BaseClass.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.io.IOException;
import java.time.Duration;

public class LoginPage extends BaseClass {
    WebDriver driver;
    WebDriverWait wait;
    By Login = By.xpath("//button");
    By Dashboard = By.xpath("//p[contains(text(),' Dashboard')]");
    By ContentManagement = By.xpath("//p[contains(text(), 'Content management')]");

    public LoginPage(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(20));
    }

    public void LoginToDashboard() throws IOException {
        driver.findElement(Login).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(Dashboard));
        driver.findElement(ContentManagement).click();
    }

}
