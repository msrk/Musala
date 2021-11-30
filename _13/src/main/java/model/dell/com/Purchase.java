package model.dell.com;

import command.dell.com.*;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class Purchase  extends PageBase {
    public Purchase(String filename, WebDriver driver ) {
        super(filename);
        this.driver=driver;
    }

    public void purchase(){
        WaitCommandControl waitCommandControl= new WaitCommandControl();
        CommandControl commadControl = new CommandControl();

        ConcreteWaitCommand concreteWaitCommand = new ConcreteWaitCommand(driver);
        waitCommandControl.setCommand(concreteWaitCommand);
        waitCommandControl.waitUntilVisible(eles.get("womenLink"));
        ClickCommand clickCommand = new ClickCommand(driver);
        SendKeysCommand SendKeysCommand = new SendKeysCommand(driver);

        commadControl.setCommand(clickCommand);
        commadControl.hoverAndThenClick(eles.get("womenLink"), eles.get("blousesLink"));


        waitCommandControl.waitUntilVisible(eles.get("addToChart"));
        commadControl.performClick(eles.get("addToChart"));
        driver.switchTo().defaultContent();
        waitCommandControl.waitUntilVisible(eles.get("proceedToCheckOut"));
        commadControl.performClick(eles.get("proceedToCheckOut"));
        waitCommandControl.waitUntilVisible(eles.get("summaryCheckOut"));
        commadControl.performClick(eles.get("summaryCheckOut"));
        waitCommandControl.waitUntilLoaded("http://automationpractice.com/index.php?controller=order&step=1");

        waitCommandControl.waitUntilVisible(eles.get("addressCheckOut"));
        commadControl.performClick(eles.get("addressCheckOut"));
        waitCommandControl.waitUntilVisible(eles.get("carrierCheckOut"));
       //
        JavascriptExecutor jse = (JavascriptExecutor)driver;

        jse.executeScript("arguments[0].scrollIntoView();", driver.findElement(By.xpath("//table[@class='resume table table-bordered']")));
        commadControl.setCommand(SendKeysCommand);
        waitCommandControl.waitUntilVisible(eles.get("agree"));
        commadControl.performClickOnSpecificIndex(eles.get("agree"),0);
        commadControl.setCommand(clickCommand);
        waitCommandControl.waitUntilVisible(eles.get("carrierCheckOut"));
        commadControl.performClick(eles.get("carrierCheckOut"));
        waitCommandControl.waitUntilVisible(eles.get("payByWire"));
        commadControl.performClick(eles.get("payByWire"));
        waitCommandControl.waitUntilVisible(eles.get("confirmOrder"));
        commadControl.performClick(eles.get("confirmOrder"));
        waitCommandControl.waitUntilVisible(eles.get("backToOrders"));
        commadControl.performClick(eles.get("backToOrders"));
        waitCommandControl.waitUntilVisible(eles.get("orderRefHeader"));
        waitCommandControl.waitUntilVisible(eles.get("orderRef"));
        commadControl.setCommand(SendKeysCommand);
        Assert.assertTrue(commadControl.getString(eles.get("orderRefHeader"),0,0).contains("Order"));
        Assert.assertTrue(commadControl.getString(eles.get("price"),0,0).contains("$30.16"));
    }
}
