package ntn.steps;

import com.google.inject.internal.cglib.core.$KeyFactory;
import net.thucydides.core.annotations.Steps;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import ntn.steps.serenity.LoginSteps;

public class DefinitionSteps {

    @Steps
    LoginSteps anna;

    @Given("^The login page is showed$")
    public void the_login_page_is_showed()  {
        anna.is_the_home_page();
    }

/*
    @When("^The user provides valid zickzack(\\d+)@gmail\\.com and Qaz@(\\d+) account then attemp to login$")
    public void the_user_provides_valid_zickzack_gmail_com_and_Qaz_account_then_attemp_to_login(String username, String password) {
        // Write code here that turns the phrase above into concrete actions
        anna.enters(username,password);
        anna.starts_login();
    }
    @When("^The user provides valid (\\d+) and Qaz@(\\d+) account then attemp to login$")
    public void the_user_provides_valid_and_Qaz_account_then_attemp_to_login(String username, String password) {
        // Write code here that turns the phrase above into concrete actions
        anna.enters(username,password);
        anna.starts_login();
    }

 */

    @When("^The user provides valid (.+) and password account then attemp to login$")
    public void the_user_provides_valid_and_account_then_attemp_to_login(String username, String password) {
        anna.enters(username,password);
        anna.starts_login();
         }
  

    @Then("^The Homepage is show login name$")
    public void the_homepage_is_show_login_name()  {
        anna.should_see_result("hardynguyen");
    }
}


