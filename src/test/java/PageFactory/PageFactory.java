package PageFactory;

import Pages.LoginPage;
import org.openqa.selenium.WebDriver;

public class PageFactory {
    WebDriver driver;
    public LoginPage loginPage;
    public PageFactory(WebDriver driver){
        this.driver = driver;
    }
    public LoginPage getLoginPage(){
        if(loginPage == null){
            loginPage = new LoginPage(driver);
        }
        return loginPage;
    }
}
