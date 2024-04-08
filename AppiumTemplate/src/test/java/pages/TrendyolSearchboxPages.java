package pages;

import enums.SwipeEnum;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import util.ElementHelper;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class TrendyolSearchboxPages {
    AppiumDriver appiumDriver;
    ElementHelper elementHelper;
    WebDriverWait webDriverWait;

    public TrendyolSearchboxPages(AppiumDriver appiumDriver) {
        this.appiumDriver = appiumDriver;
        this.elementHelper = new ElementHelper(appiumDriver);
        this.webDriverWait = new WebDriverWait(appiumDriver, Duration.ofSeconds(10));
    }

    By searchBoxText = By.id("trendyol.com:id/edittext_search_view");
    By botListIndis = new By.ByXPath("//androidx.recyclerview.widget.RecyclerView[@resource-id=\"trendyol.com:id/recyclerViewSearchAutoComplete\"]/android.view.ViewGroup");
    By closeInfo = By.id("trendyol.com:id/imageViewTooltipClose");
    By botfavSearch = new By.ByXPath("(//android.widget.RelativeLayout[@resource-id=\"trendyol.com:id/favoriteButton\"])");
    By discontClose = By.id("trendyol.com:id/imageViewClose");
    By gotoCompany = new By.ByXPath("//android.widget.TextView[@text=\"Mağazaya Git\"]");

    By closeDiscontMassege = By.id("trendyol.com:id/imageViewClose");
    By disconteList = new By.ByXPath("(//android.view.ViewGroup[@resource-id=\"trendyol.com:id/constraintLayout\"])");
    By disconteList1 = new By.ByXPath("(//android.widget.TextView[@resource-id=\"trendyol.com:id/buttonCouponAction\"])");
    By allProductGet = new By.ByXPath("//android.widget.TextView[@resource-id=\"trendyol.com:id/buttonCouponAction\" and @text=\"Tüm Ürünler\"]");

    By filtere = new By.ByXPath("(//androidx.cardview.widget.CardView[@resource-id=\"trendyol.com:id/cardViewOpenFilter\"])");
    By maxFiltre = new By.ByXPath("//android.widget.RadioButton[@resource-id=\"trendyol.com:id/radioButtonSortingTypeItem\" and @text=\"En Yüksek Fiyat\"]");
    By product3 = new By.ByXPath("(//android.view.ViewGroup[@resource-id=\"trendyol.com:id/constraintLayout\"])");
    By goBasket = By.id("trendyol.com:id/primaryButton");

    By gooBasket = By.id("trendyol.com:id/variantSelectionDialogPrimaryButton");
    By currentBasket = By.id("trendyol.com:id/productDetailBasket");
    By price = By.id("trendyol.com:id/textViewSalePrice");

    By closeCargoInfo = new By.ByXPath("//com.skydoves.balloon.compose.BalloonComposeView/android.view.View/android.view.View/android.view.View");
    By cupon = new By.ByXPath("//androidx.compose.ui.platform.ComposeView[@resource-id=\"trendyol.com:id/viewBottomBanner\"]/android.view.View/android.view.View/android.view.View[2]/android.widget.Button");
    By afterPrice = By.id("trendyol.com:id/approveBasketPrice");

    By deleteProdcut = By.id("trendyol.com:id/imageViewDeleteProduct");
    By delete2 = By.id("trendyol.com:id/textViewBasketRemoveAction");


    public void searchBot() {
        elementHelper.click(searchBoxText);
        elementHelper.sendKey(searchBoxText, "Sapka");
        List<WebElement> productList = appiumDriver.findElements(botListIndis);
        productList.get(0).click();
        elementHelper.isA(closeInfo);
    }

    public void favAdd() {

        List<WebElement> productList = appiumDriver.findElements(botfavSearch);
        productList.get(1).click();
        elementHelper.isA(discontClose);


    }

    public void gotoCompany() {
        elementHelper.isA(gotoCompany);
        elementHelper.isA(closeDiscontMassege);
    }

    int urunIndis = 1;
    int hat =2;

    public void disconteList() {

        List<WebElement> productList = new ArrayList<>();
        while (productList.size() < 2) { // 2. ürün bulunana kadar devam et
            elementHelper.swipe(disconteList, SwipeEnum.LEFT);
            productList = appiumDriver.findElements(disconteList1);
        }
        productList.get(urunIndis).click(); // 2. ürünü tıkla


    }

    public void cuponUse() {


        elementHelper.click(allProductGet);
        elementHelper.click(filtere);
        elementHelper.click(maxFiltre);

        List<WebElement> productList = new ArrayList<>();
        while (productList.size() < 2) { // 2. ürün bulunana kadar devam et
            elementHelper.swipe(product3, SwipeEnum.LEFT);
            productList = appiumDriver.findElements(product3);
        }
        productList.get(urunIndis).click(); // 2. ürünü tıkla


    }


    public void toBuy() {
        elementHelper.click(goBasket);
        elementHelper.isA(gooBasket);
        elementHelper.isA(closeCargoInfo);
        elementHelper.click(currentBasket);


    }

    public void control() {
        List<WebElement> productPrice = appiumDriver.findElements(price);
        String cuponPriceText = productPrice.get(0).getText();
        String onlyVaule = cuponPriceText.replaceAll("[^0-9]", "");
        int priceValue = Integer.parseInt(onlyVaule);


        elementHelper.isA(cupon);
        List<WebElement> AfterPrice = appiumDriver.findElements(afterPrice);
        String afterPriceText = AfterPrice.get(0).getText();
        String afterPrice = afterPriceText.replaceAll("[^0-9]", "");
        int finalPrice = Integer.parseInt(afterPrice);


        Assert.assertNotEquals(priceValue, finalPrice);

    }

    public void DeleteProduct() {
        elementHelper.click(deleteProdcut);
        elementHelper.click(delete2);
    }


}



