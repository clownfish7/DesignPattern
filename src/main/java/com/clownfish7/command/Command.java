package com.clownfish7.command;

/**
 * @author You
 * @create 2019-07-27 15:29
 */
public interface Command {

    public void exec();
    public void undo();
}
