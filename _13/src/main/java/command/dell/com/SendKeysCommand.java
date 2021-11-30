package command.dell.com;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class SendKeysCommand implements Command {
    WebDriver webdriverInstance;

    public SendKeysCommand(WebDriver webdriverInstance) {
        this.webdriverInstance = webdriverInstance;
    }

    public void execute(String by) {
        // do nothing
    }

    public void execute(By by) {

    }

    @Override
    public void execute(By by, By by2) {

    }

    public void execute(By by, int index) {
        JavascriptExecutor jse = (JavascriptExecutor)webdriverInstance;
        jse.executeScript("arguments[0].click();", webdriverInstance.findElement(by));
    }


    public String execute(By by, int txt, int index) {
        return webdriverInstance.findElement(by).getText();
        //do nothing;
    }

    public void execute(By by, String txt, int index) {
        webdriverInstance.findElements(by).get(index).sendKeys(txt);
        //do nothing;
    }

    public void execute(By by, String txt) {
        JavascriptExecutor jse = (JavascriptExecutor)webdriverInstance;

        jse.executeScript("arguments[0].scrollIntoView();", webdriverInstance.findElement(by));
        webdriverInstance.findElement(by).sendKeys(txt);
    }

}
