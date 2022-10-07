package StepDefinitaion;

import BaseClass.BaseClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import java.io.IOException;

public class SearchMessageTemplate extends BaseClass {
    @Given("User is able to login and redirect to dashboard")
    public void user_is_able_to_login_and_redirect_to_dashboard() throws IOException {
        setup();
        pageFactory.getLoginPage().LoginToDashboard();
    }
    @When("select Message Template and search Message Template")
    public void select_message_template_and_search_message_template() {
        pageFactory.getSearchMessage().Searchmeassage();
    }
    @Then("Verify Message Template")
    public void verify_message_template() {
        pageFactory.getSearchMessage().Verify();
        pageFactory.getLogout().ableToLogout();
        close();
    }

}
