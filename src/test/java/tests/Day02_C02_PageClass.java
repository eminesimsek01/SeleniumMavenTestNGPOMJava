package tests;

import org.testng.annotations.Test;
import pages.SauceDemoLoginPage;
import utilities.Driver;

public class Day02_C02_PageClass {
    @Test
    public void pageClasstest() {
        //Navigate to https://www.saucedemo.com/
        Driver.getDriver().get("https://www.saucedemo.com/");

        //Login sayfasında yapılan aksiyonlar
        SauceDemoLoginPage loginPage=new SauceDemoLoginPage();
        loginPage.txtPasswrod.sendKeys("secret_sauce");
        loginPage.txtUsername.sendKeys("standard-use");
        loginPage.btnLogin.click();

    }
}
