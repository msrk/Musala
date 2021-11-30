package command.dell.com;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ClickCommand implements Command {

    WebDriver webdriverInstance;
    public ClickCommand(WebDriver webdriverInstance){
        this.webdriverInstance = webdriverInstance;
    }

    public void execute(By by){

        JavascriptExecutor jse = (JavascriptExecutor)webdriverInstance;
        jse.executeScript("arguments[0].scrollIntoView();", webdriverInstance.findElement(by));
        webdriverInstance.findElement(by).click();
    }

    @Override
    public void execute(By by, By by2) {
        // Locating the Main Menu (Parent element)
        WebElement mainMenu = webdriverInstance.findElement(by);
        JavascriptExecutor jse = (JavascriptExecutor)webdriverInstance;

        jse.executeScript("arguments[0].scrollIntoView();", webdriverInstance.findElement(by));

//Instantiating Actions class
        Actions actions = new Actions(webdriverInstance);

//Hovering on main menu
        actions.moveToElement(mainMenu);
        actions.build().perform();
// Locating the element from Sub Menu
        Actions actions2 = new Actions(webdriverInstance);
        WebDriverWait ait = new WebDriverWait(webdriverInstance, 10);
        ait.until(ExpectedConditions.visibilityOf(webdriverInstance.findElement(by2)));
        WebElement subMenu = webdriverInstance.findElement(by2);

//To mouseover on sub menu
        actions2.moveToElement(mainMenu).moveToElement(subMenu);
        actions2.click().build().perform();

//build()- used to compile all the actions into a single step

    }

    public void execute(By by, int index){
        JavascriptExecutor jse = (JavascriptExecutor)webdriverInstance;

        jse.executeScript("arguments[0].click();", webdriverInstance.findElement(by));
        webdriverInstance.findElement(by).click();
    }

    @Override
    public String execute(By by, int index, int index2) {
        return null;
    }

    public void execute(By by, String txt, int index) {

    }

    public void execute(By by, String txt) {
        Select select = new Select(webdriverInstance.findElement(by));
        select.selectByVisibleText(txt);
    }

}
