package tests;

import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import pages.HtmlGoodiesHomePage;
import utilities.Driver;

public class Day02_C03_PageClassExample {
    @Test
    public void testName() {

        Driver.getDriver().get("ttp://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
        HtmlGoodiesHomePage hp=new HtmlGoodiesHomePage();
        Actions actions=new Actions(Driver.getDriver());
        actions.dragAndDrop(hp.copenhag,hp.denmark);
        actions.dragAndDrop(hp.seoul,hp.sKorea);
        actions.dragAndDrop(hp.madrid,hp.spain);
        actions.dragAndDrop(hp.rome,hp.italy);
        actions.dragAndDrop(hp.stockholm,hp.sweden);
        actions.dragAndDrop(hp.washington,hp.us).perform();


    }
}
