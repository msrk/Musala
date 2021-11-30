package model.dell.com;


import command.dell.com.*;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class Register extends PageBase {
    public Register(String filename, WebDriver driver ) {
        super(filename);
        this.driver=driver;
    }

    public void apply(){
        WaitCommandControl waitCommandControl= new WaitCommandControl();
        CommandControl commadControl = new CommandControl();

        ConcreteWaitCommand concreteWaitCommand = new ConcreteWaitCommand(driver);
        waitCommandControl.setCommand(concreteWaitCommand);
        waitCommandControl.waitUntilVisible(eles.get("careers"));
        ClickCommand clickCommand = new ClickCommand(driver);


        commadControl.setCommand(clickCommand);
        commadControl.performClick(eles.get("careers"));
        waitCommandControl.waitUntilVisible(eles.get("open"));
        commadControl.performClick(eles.get("open"));
        waitCommandControl.waitUntilLoaded("https://www.musala.com/careers/join-us/");
        waitCommandControl.waitUntilVisible(eles.get("location"));
        commadControl.performSendKeys(eles.get("location"), "Anywhere");
        waitCommandControl.waitUntilVisible(eles.get("qa"));
        commadControl.performClick(eles.get("qa"));
        waitCommandControl.waitUntilVisible(eles.get("gd"));
        waitCommandControl.waitUntilVisible(eles.get("req"));
        waitCommandControl.waitUntilVisible(eles.get("res"));
        waitCommandControl.waitUntilVisible(eles.get("offer"));
        commadControl.performClick(eles.get("app"));
        SendKeysCommand SendKeysCommand = new SendKeysCommand(driver);
        commadControl.setCommand(SendKeysCommand);
        commadControl.performSendKeys(eles.get("name"),"name1");
        commadControl.performSendKeys(eles.get("email"),"name1");
        commadControl.performSendKeys(eles.get("mobile"),"22234");
        commadControl.performSendKeys(eles.get("cv"), System.getProperty("user.dir")+"cv.txt");
        waitCommandControl.waitUntilVisible(eles.get("Submit"));
        commadControl.setCommand(clickCommand);
        commadControl.performClick(eles.get("Submit"));
    }

    public void checkCompany(){
        WaitCommandControl waitCommandControl= new WaitCommandControl();
        CommandControl commadControl = new CommandControl();

        ConcreteWaitCommand concreteWaitCommand = new ConcreteWaitCommand(driver);
        waitCommandControl.setCommand(concreteWaitCommand);
        waitCommandControl.waitUntilVisible(eles.get("company"));
        ClickCommand clickCommand = new ClickCommand(driver);


        commadControl.setCommand(clickCommand);
        commadControl.performClick(eles.get("company"));
        waitCommandControl.waitUntilLoaded("https://www.musala.com/company/");
        waitCommandControl.waitUntilVisible(eles.get("leadership"));
        commadControl.setCommand(clickCommand);
        commadControl.performClick(eles.get("facebook"));
        String winHandleBefore = driver.getWindowHandle();

        // Perform the click operation that opens new window

        // Switch to new window opened
        for(String winHandle : driver.getWindowHandles()){
            if(winHandle!= winHandleBefore)
            driver.switchTo().window(winHandle);
        }
        waitCommandControl.waitUntilLoaded("https://www.facebook.com/MusalaSoft?fref=ts");
        waitCommandControl.waitUntilVisible(eles.get("profile"));

    }

    public void fillForm(String email){
        WaitCommandControl waitCommandControl= new WaitCommandControl();
        CommandControl commadControl = new CommandControl();

        ConcreteWaitCommand concreteWaitCommand = new ConcreteWaitCommand(driver);
        waitCommandControl.setCommand(concreteWaitCommand);
        waitCommandControl.waitUntilVisible(eles.get("contactUs"));




        ClickCommand clickCommand = new ClickCommand(driver);
        SendKeysCommand SendKeysCommand = new SendKeysCommand(driver);

        commadControl.setCommand(clickCommand);
        commadControl.performClick(eles.get("contactUs"));
        waitCommandControl.waitUntilVisible(eles.get("name"));

        commadControl.setCommand(SendKeysCommand);
        commadControl.performSendKeys(eles.get("name"),"name1");
        commadControl.performSendKeys(eles.get("email"),"name1");
        commadControl.performSendKeys(eles.get("subject"),"subject1");
        commadControl.performSendKeys(eles.get("message"),"message1");
        waitCommandControl.waitUntilVisible(eles.get("Submit"));
        commadControl.setCommand(clickCommand);
        commadControl.performClickOnSpecificIndex(eles.get("Submit"),0);

    }
}
