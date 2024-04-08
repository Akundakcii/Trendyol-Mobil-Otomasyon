package stepDefinitions;

import io.appium.java_client.AppiumDriver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.annotations.Test;
import pages.TrendyolLoginPages;
import util.DriverFactory;

public class TrendyolLoginStepDefinitions {

TrendyolLoginPages trendyolLoginPages = new TrendyolLoginPages(DriverFactory.getAppiumDriver());

    @Test(priority=1)
@When("Click to Men")
    public void click_to_men() {
trendyolLoginPages.genderSelect();
    }

    @When("Click to  Account")
    public void click_to_account() {
trendyolLoginPages.accountClose();
    }

    @When("Write email and password")
    public void write_email_and_password() {
trendyolLoginPages.userAccount();
trendyolLoginPages.accontButton();
    }

    @Then("is login succesful")
    public void is_login_succesful() {
        trendyolLoginPages.control();

    }
    @When("GotoMainPage")
    public void goto_main_page(){
        trendyolLoginPages.gotoMainPage();
    }
}
