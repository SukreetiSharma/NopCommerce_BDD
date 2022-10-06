package StepDefinitaion;

import BaseClass.BaseClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.io.IOException;

public class AddTopics extends BaseClass {
    @Given("User is able to login and redirect to dashboard")
    public void user_is_able_to_login_and_redirect_to_dashboard() throws IOException {
        setup();
        pageFactory.getLoginPage().LoginToDashboard();
    }
//    @When("Click on Content Management and select topics")
//    public void click_on_content_management_and_select_topics() {
//
//    }
//    @When("Add new topics with details and save")
//    public void add_new_topics_with_details_and_save() {
//
//    }
//    @Then("verify user is able to add topic")
//    public void verify_user_is_able_to_add_topic() {
//
//    }

}
