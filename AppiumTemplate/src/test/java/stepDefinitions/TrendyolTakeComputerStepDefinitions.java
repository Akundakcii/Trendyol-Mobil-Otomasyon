package stepDefinitions;

import io.cucumber.java.en.When;
import org.openqa.selenium.WebElement;
import pages.TrendyolTakeComputerPages;
import util.DriverFactory;

import java.util.List;

public class TrendyolTakeComputerStepDefinitions {
    TrendyolTakeComputerPages trendyolTakeComputerPages = new TrendyolTakeComputerPages(DriverFactory.getAppiumDriver());

    @When("Select Electronik category")
    public void select_electronik_category() {
        trendyolTakeComputerPages.clickToElectronicCategoryIconFromMenu();
    }

    @When("Select computer")
    public void select_computer() {
        trendyolTakeComputerPages.clickComputer();

    }

    @When("Select gaming computer")
    public void select_gaming_computer() {
        trendyolTakeComputerPages.clickGameComputer();
    }

    @When("Close filter info")
    public void close_filter_info() {
        trendyolTakeComputerPages.closeFilter();
    }

    @When("Do Filter max price")
    public void do_filter_max_price() {
        trendyolTakeComputerPages.selectFilter();
        trendyolTakeComputerPages.maxPrice();
    }

    @When("Select product")
    public void select_product() {
        trendyolTakeComputerPages.selectProduct();
    }

    @When("Click basket")
    public void click_basket() {
        trendyolTakeComputerPages.addBasket();
    }

    @When("close info")
    public void close_info() {

    }

    @When("GotoBasket")
    public void goto_basket() {
        trendyolTakeComputerPages.gotoBasket();
    }

    @When("Delete Product")
    public void delete_product() {
        trendyolTakeComputerPages.deleteProduct();
    }

}
