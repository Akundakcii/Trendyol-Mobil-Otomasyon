package pages;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import util.ElementHelper;

import java.time.Duration;
import java.util.List;

public class TrendyolTakeComputerPages {

    AppiumDriver appiumDriver;
    ElementHelper elementHelper;
    WebDriverWait webDriverWait;

    public TrendyolTakeComputerPages(AppiumDriver appiumDriver) {
        this.appiumDriver = appiumDriver;
        this.elementHelper = new ElementHelper(appiumDriver);
        this.webDriverWait = new WebDriverWait(appiumDriver, Duration.ofSeconds(10));
    }

    By menuElements = new AppiumBy.ByAndroidUIAutomator("new UiSelector().className(\"android.widget.TextView\")");
    By computer = new By.ByXPath("//android.widget.ImageView[@content-desc=\"Bilgisayar & Tablet\"]");
    By computergame = new By.ByXPath("//android.widget.ImageView[@content-desc=\"Oyuncu Dizüstü Bilgisayarı\"]");
    By filterClose = By.id("trendyol.com:id/imageViewTooltipClose");
    By filterMax = new By.ByXPath("(//androidx.cardview.widget.CardView[@resource-id=\"trendyol.com:id/cardViewOpenFilter\"])[1]");
    By filterMaxPrice = new By.ByXPath("//android.widget.RadioButton[@resource-id=\"trendyol.com:id/radioButtonSortingTypeItem\" and @text=\"En Yüksek Fiyat\"]");
    By gameComputerList = new By.ByXPath("(//android.widget.ImageView[@resource-id=\"trendyol.com:id/imageViewProduct\"])");

    By addBasketButton = By.id("trendyol.com:id/primaryButton");
    By deleteProduct = By.id("trendyol.com:id/imageViewDeleteProduct");
    By sepetInfoClose = new By.ByXPath("//com.skydoves.balloon.compose.BalloonComposeView/android.view.View/android.view.View/android.view.View");
    By goBasketDetail = By.id("trendyol.com:id/productDetailBasket");
    By delete2 = By.id("trendyol.com:id/textViewBasketRemoveAction");

    public void clickToElectronicCategoryIconFromMenu() {

        List<WebElement> elementTexts = appiumDriver.findElements(menuElements);
        for (WebElement elementText : elementTexts) {
            String text = elementText.getText();
            if (text.equals("Elektronik")) {
                elementText.click();
                break;
            }
        }


    }

    public void clickComputer() {
        elementHelper.click(computer);
    }

    public void clickGameComputer() {
        elementHelper.click(computergame);
    }

    public void closeFilter() {
        elementHelper.isA(filterClose);
    }

    public void selectFilter() {
        elementHelper.click(filterMax);
    }

    public void maxPrice() {
        elementHelper.click(filterMaxPrice);
    }

    public void selectProduct() {
        List<WebElement> productList = appiumDriver.findElements(gameComputerList);
        productList.get(0).click();
    }

    public void addBasket() {
        elementHelper.click(addBasketButton);
    }

    public void gotoBasket() {

        elementHelper.isA(sepetInfoClose);
        elementHelper.click(goBasketDetail);
    }

    public void deleteProduct() {
        elementHelper.click(deleteProduct);
        elementHelper.click(delete2);
    }
}
