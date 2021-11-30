package command.dell.com;

import org.openqa.selenium.By;

public interface Command {
    public void execute(By by);
    public void execute(By by, By by2);
    public void execute(By by, int index);
    public String execute(By by, int index, int index2);
    public void execute(By String, String txt, int index);
    public void execute(By by, String txt);


}
