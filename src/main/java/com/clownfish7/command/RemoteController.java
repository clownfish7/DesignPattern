package com.clownfish7.command;

/**
 * @author You
 * @create 2019-07-27 15:36
 */
public class RemoteController {

    private Command[] onCommands;
    private Command[] offCommands;

    private Command undoCommand;

    public RemoteController() {
        onCommands = new Command[5];
        offCommands = new Command[5];

        for (int i = 0; i < 5; i++) {
            onCommands[i] = new NoCommand();
            offCommands[i] = new NoCommand();
        }
    }

    public void setCommand(int no, Command onCommand, Command offCommand) {
        this.onCommands[no] = onCommand;
        this.offCommands[no] = offCommand;
    }

    public void onButtonPushed(int no) {
        onCommands[no].exec();
        undoCommand = onCommands[no];
    }

    public void offButtonPushed(int no) {
        offCommands[no].exec();
        undoCommand = offCommands[no];
    }

    public void undoButtonPushed() {
        undoCommand.undo();
    }
}
