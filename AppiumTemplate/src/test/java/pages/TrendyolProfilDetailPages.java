package pages;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import util.ElementHelper;

import java.time.Duration;

public class TrendyolProfilDetailPages {
    AppiumDriver appiumDriver;
    ElementHelper elementHelper;
    WebDriverWait webDriverWait;

    public TrendyolProfilDetailPages(AppiumDriver appiumDriver) {
        this.appiumDriver = appiumDriver;
        this.elementHelper = new ElementHelper(appiumDriver);
        this.webDriverWait = new WebDriverWait(appiumDriver, Duration.ofSeconds(10));
    }
    public static final By clickProfilButton=By.id("trendyol.com:id/tab_account");
    public static final By clickProfil = By.id("trendyol.com:id/cardViewProfile");

    public static final By tallText = new By.ByXPath("//android.widget.TextView[@text=\"Boy: 165 cm\"]");
    public static final By weightText = new By.ByXPath("//androidx.compose.ui.platform.ComposeView[@resource-id=\"trendyol.com:id/bodyMassViewAccountInfo\"]/android.view.View/android.view.View/android.view.View[2]");

    public static final By nameText= By.id("trendyol.com:id/editTextName");
    public static final By phoneText = By.id("trendyol.com:id/editTextPhone");
    public static final By clcikinformation = By.id("trendyol.com:id/checkboxCorporate");
    public static final By updateButton = By.id("trendyol.com:id/buttonUpdateAccountInfo");


    public void clickProfil(){
        elementHelper.click(clickProfilButton);
        elementHelper.click(clickProfil);
    }
    public void  writeTallWeight(){
        WebElement tallElement = appiumDriver.findElement(tallText);
        WebElement weightElement = appiumDriver.findElement(weightText);
        elementHelper.click(tallText);

        Actions actions = new Actions(appiumDriver);
        actions.moveToElement(tallElement);
        actions.click();
        actions.sendKeys("180");
        actions.build().perform();

        elementHelper.click(weightText);


        actions = new Actions(appiumDriver);
        actions.moveToElement(weightElement);
        actions.click();
        actions.sendKeys("77");
        actions.build().perform();
    }
    public void writeName(){
        elementHelper.sendKey(nameText,"Ahmet Kundakci");
    }
    public void writePhone(){
        elementHelper.sendKey(phoneText,"5466547765");
    }
    public void clickInformation(){
        elementHelper.click(clcikinformation);
    }
    public void clickUpdateButton(){
       // elementHelper.click(updateButton);
        // Bunu Acarsak telefona kod ısteyecek oyuzden acmıyorum.
        //acılırsa ekstra 2 adım daha olacak

    }
}
