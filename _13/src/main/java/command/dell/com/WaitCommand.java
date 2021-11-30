package command.dell.com;

import org.openqa.selenium.By;

public interface WaitCommand {

    public void execute(By by);
    public void execute(String url);
    //public void executea(By by, String name);
}
