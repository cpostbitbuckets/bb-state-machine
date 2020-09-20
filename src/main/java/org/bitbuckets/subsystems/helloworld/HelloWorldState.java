package org.bitbuckets.subsystems.helloworld;

import org.bitbuckets.subsystems.State;

public class HelloWorldState implements State {
    private String message;

    public void initialize() {
        message = "Hello World";
        System.out.println("Entering HelloWorldState");
    }

    public void execute() {
        System.out.println(message);
    }

    public boolean isFinished() {
        return true;
    }

    public void end() {
        System.out.println("Ending HelloWorldState");
    }

}
