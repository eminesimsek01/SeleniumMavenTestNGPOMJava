package tests;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.SauceDemoHomePage;
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
        //Burada homepage'a geçiş yaptığımızdan dolayı homepage clasımızdan bir obje üretiriz.
        SauceDemoHomePage homePage = new SauceDemoHomePage();
        Select select=new Select(homePage.filterDropdown);
        select.selectByValue("lohi");
        Assert.assertTrue(select.getFirstSelectedOption().getText().contains("low to high"));
        homePage.products.forEach(x-> System.out.println(x.getText()));
    }
}
