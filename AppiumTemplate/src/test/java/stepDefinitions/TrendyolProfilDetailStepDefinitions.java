package stepDefinitions;

import io.cucumber.java.en.When;
import pages.TrendyolProfilDetailPages;
import util.DriverFactory;

public class TrendyolProfilDetailStepDefinitions {

    TrendyolProfilDetailPages TrendyolProfilDetailPages = new TrendyolProfilDetailPages(DriverFactory.getAppiumDriver());

    @When("Click profil Button")
    public void click_profil_button() {
        TrendyolProfilDetailPages.clickProfil();
    }

    @When("Write tall and weight")
    public void write_tall_and_weight() {
       TrendyolProfilDetailPages.writeTallWeight();
    }

    @When("Write name and surname")
    public void write_name_and_surname() {
       TrendyolProfilDetailPages.writeName();
    }

    @When("Write phone number")
    public void write_phone_number() {
      TrendyolProfilDetailPages.writePhone();
    }

    @When("Check information")
    public void check_information() {
        TrendyolProfilDetailPages.clickInformation();
    }

    @When("Click Update Button")
    public void click_update_button() {
        TrendyolProfilDetailPages.clickUpdateButton();
    }
}
