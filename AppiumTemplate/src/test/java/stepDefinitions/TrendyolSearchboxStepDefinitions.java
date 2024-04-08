package stepDefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.TrendyolSearchboxPages;
import util.DriverFactory;

public class TrendyolSearchboxStepDefinitions {
    TrendyolSearchboxPages trendyolSearchboxPages = new TrendyolSearchboxPages(DriverFactory.getAppiumDriver());

    @When("Searchbox hat write")
    public void searchbox_hat_write() {
    trendyolSearchboxPages.searchBot();
    }

    @When("random one product fav add")
    public void random_one_product_fav_add() {
        trendyolSearchboxPages.favAdd();
    }

    @When("go to company")
    public void go_to_company() {
        trendyolSearchboxPages.gotoCompany();
    }

    @When("message close")
    public void message_close() {
       trendyolSearchboxPages.disconteList();
    }

    @When("cupon use")
    public void cupon_use() {
        trendyolSearchboxPages.cuponUse();
    }

    @When("product buy")
    public void product_buy() {
      trendyolSearchboxPages.toBuy();
    }

    @Then("control price")
    public void control_price() {
        trendyolSearchboxPages.control();
    }

    @When("delete product")
    public void delete_product() {
       trendyolSearchboxPages.DeleteProduct();
    }



}
