package command.dell.com;

import org.openqa.selenium.By;

public class CommandControl {
    Command cmd;
    public CommandControl(){}
    public void setCommand(Command cmd){
        this.cmd=cmd;
    }

    public void performClick(By by){
        cmd.execute(by);
    }
    public void hoverAndThenClick(By by, By by2){
        cmd.execute(by, by2);
    }

    public void performClickOnSpecificIndex(By by, int index){
        cmd.execute(by, index);
    }

    public void performSendKeys(By by, String txt){
        cmd.execute(by, txt);
    }

    public String getString(By by, int index, int index2){
        return cmd.execute(by, index, index2);
    }

    public void performSendKeysOnSpecificIndex(By by, String txt, int index ){
        cmd.execute(by, txt, index);
    }

    public void move(By by){
        cmd.execute(by);
    }


}
