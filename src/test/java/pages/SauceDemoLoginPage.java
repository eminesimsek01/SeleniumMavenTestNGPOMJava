package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class SauceDemoLoginPage {
    //initElements methodu Page Class'ı initialize etmek adına kullanılır
    public SauceDemoLoginPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    //FindBy anatosyonu emelentleri locate ederken kullandığımız ve initElements methodu ile
    // elementlerin bulunmasını sağlayan bir anotasyondur.
    @FindBy(id="user-name")
    public WebElement txtUsername;
    @FindBy(id="password")
    public WebElement txtPasswrod;
    @FindBy(xpath="//*[@id='login-button]")
    public WebElement btnLogin;

    //Örnek olması açısından @FindAll anotatin kullanımı. Page classtan bağımsızdır

    @FindAll({
            id
    }="user")

}
