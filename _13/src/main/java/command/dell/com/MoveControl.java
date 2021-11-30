package command.dell.com;

import org.openqa.selenium.By;

public class MoveControl {
    Command cmd;
    public MoveControl(){}
    public void setCommand(Command cmd){
        this.cmd=cmd;
    }
    public void move(By by){
        cmd.execute(by);
    }
}
