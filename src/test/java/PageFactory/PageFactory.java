package PageFactory;

import Pages.LoginPage;
import Pages.LogoutPage;
import Pages.SearchMessageTemplate;
import org.openqa.selenium.WebDriver;

public class PageFactory {
    WebDriver driver;
    public LoginPage loginPage;
    public SearchMessageTemplate searchMessage;
    public LogoutPage logout;
    public PageFactory(WebDriver driver){
        this.driver = driver;
    }
    public LoginPage getLoginPage(){
        if(loginPage == null){
            loginPage = new LoginPage(driver);
        }
        return loginPage;
    }
    public SearchMessageTemplate getSearchMessage(){
        if(searchMessage == null){
            searchMessage = new SearchMessageTemplate(driver);
        }
        return searchMessage;
    }
    public LogoutPage getLogout(){
        if(searchMessage == null){
            logout = new LogoutPage(driver);
        }
        return logout;
    }
}
