package pages;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;

import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import util.ElementHelper;

import java.time.Duration;


public class TrendyolLoginPages {

    AppiumDriver appiumDriver;
    ElementHelper elementHelper;
    WebDriverWait webDriverWait;

    public TrendyolLoginPages(AppiumDriver appiumDriver) {
        this.appiumDriver = appiumDriver;
        this.elementHelper = new ElementHelper(appiumDriver);
        this.webDriverWait = new WebDriverWait(appiumDriver, Duration.ofSeconds(10));
    }

    public static final By genderSelection = By.id("trendyol.com:id/buttonSelectGenderMan");
    public static final By gendernextExitButton = By.id("trendyol.com:id/imageButtonClose");
    public static final By maininfoExitButton = By.id("trendyol.com:id/imageViewTooltipClose");
    public static final By userAccountButton = By.id("trendyol.com:id/tab_account");
    public static final By emailTextbox = By.id("trendyol.com:id/editTextEmail");
    public static final By passwordText = By.id("trendyol.com:id/editTextPassword");
    public static final By loginButton = By.id("trendyol.com:id/buttonLogin");

    public static final By mainClick = By.id("trendyol.com:id/imageViewTopArrow");

    public static final By controlEmail = By.id("trendyol.com:id/textViewEmail");
    public static final By gotoMainPage = By.id("trendyol.com:id/tab_home");

    public static final By saveProfilClose = By.id("com.google.android.gms:id/cancel");

    public void genderSelect() {
        elementHelper.click(genderSelection);
    }

    String email = "***EPOSTA**GİRİNİZ***";
    String password = "***SİFRE**GİRİNİZ";

    public void accountClose() {

        elementHelper.click(gendernextExitButton);

       elementHelper.isA(maininfoExitButton);
       // elementHelper.click(maininfoExitButton);
    }

    public void userAccount() {
        elementHelper.click(userAccountButton);

        elementHelper.isA(saveProfilClose);

        elementHelper.sendKey(emailTextbox, email);
        elementHelper.sendKey(passwordText, password);


    }

    public void accontButton() {
        elementHelper.click(loginButton);

    }

    public void control() {

       elementHelper.isA(mainClick);

        String actualeMail = elementHelper.findElement(controlEmail).getText();

        Assert.assertEquals(actualeMail, email);
    }

    public void gotoMainPage() {
        elementHelper.click(gotoMainPage);
    }


}
