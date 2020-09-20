package org.bitbuckets.subsystems;

public class IdleState extends State {

    public IdleState(Subsystem subsystem) {
        super(subsystem);
    }

    public boolean isFinished() {
        return false;
    }

}
