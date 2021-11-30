package command.dell.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class MoveCommand implements  Command {
    WebDriver webdriverInstance;
    public MoveCommand(WebDriver webdriverInstance){
        this.webdriverInstance = webdriverInstance;
    }

    @Override
    public void execute(By by) {
        Actions action= new Actions(webdriverInstance);
        action.moveToElement(webdriverInstance.findElement(by)).build().perform();
    }

    @Override
    public void execute(By by, By by2) {

    }

    @Override
    public void execute(By by, int index) {

    }

    @Override
    public String execute(By by, int index, int index2) {
        return null;
    }

    @Override
    public void execute(By String, String txt, int index) {

    }

    @Override
    public void execute(By by, String txt) {

    }
}
