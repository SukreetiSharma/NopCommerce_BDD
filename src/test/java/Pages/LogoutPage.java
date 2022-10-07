package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LogoutPage {
    WebDriver driver;
    WebDriverWait wait;
    By Logout = By.xpath("//a[contains(text(),'Logout')]");

    public LogoutPage(WebDriver driver) {
        this.driver=driver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(20));    }

    public void ableToLogout() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(Logout));
        driver.findElement(Logout).click();
    }

}
