package org.bitbuckets.subsystems.helloworld;

import org.bitbuckets.subsystems.State;

public class IdleState implements State {

    public void initialize() {
        System.out.println("Entering IdleState");
    }

    public void execute() {
        System.out.println("Executing IdleState");
    }

    public boolean isFinished() {
        return false;
    }

    public void end() {
        System.out.println("Ending IdleState");
    }

}
