package ntn.steps.serenity;

import ntn.pages.LoginShopee;
import net.thucydides.core.annotations.Step;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;
import static org.hamcrest.Matchers.hasItem;

public class LoginSteps {

    LoginShopee shopeePage;

    @Step
    public void enters(String value, String value2) {
        shopeePage.enter_value(value,value2);
    }

    @Step
    public void starts_login() {
        shopeePage.attempt_login();
    }

    @Step
    public void should_see_result(String definition) {
        assertThat(shopeePage.getResult(), containsString(definition));
    }

    @Step
    public void is_the_home_page() {
        shopeePage.open();
        shopeePage.start_login_page();
    }


}