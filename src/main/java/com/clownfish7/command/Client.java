package com.clownfish7.command;

/**
 * @author You
 * @create 2019-07-27 16:01
 */
public class Client {
    public static void main(String[] args) {
        RemoteController controller = new RemoteController();
        LightReceiver lightReceiver = new LightReceiver();
        controller.setCommand(0, new LightOnCommand(lightReceiver), new LightOffCommand(lightReceiver));

        controller.onButtonPushed(0);
        controller.offButtonPushed(0);
        controller.undoButtonPushed();

        System.out.println("============================");
        TVReceiver tvReceiver = new TVReceiver();
        controller.setCommand(1, new TVOnCommand(tvReceiver),new TVOffCommand(tvReceiver) );
        controller.onButtonPushed(1);
        controller.offButtonPushed(1);
        controller.undoButtonPushed();

    }
}
