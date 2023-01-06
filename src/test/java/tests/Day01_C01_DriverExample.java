package tests;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.Driver;

public class Day01_C01_DriverExample {
    /*
    Go to URL: https://opensource-demo.orangehrmlive.com/
    Verify title contains OrangeHRM.
    Use Driver Class.
     */

    @Test
    public void test() {
        Driver.getDriver().get("https://opensource-demo.orangehrmlive.com/");
        String title=Driver.getDriver().getTitle();
        Assert.assertTrue(title.contains("OrnageHRM"));
        Driver.closeDriver();
    }
    @Test
    public void test02() {
        WebDriver driver=Driver.getDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/");
        Assert.assertTrue(driver.getTitle().contains("OrnageHRM"));
    }
}
