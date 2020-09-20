package org.bitbuckets.subsystems;

public abstract class State {
    protected final Subsystem subsystem;

    public State(Subsystem subsystem) {
        this.subsystem = subsystem;
    }

    public void initialize() {
        System.out.println(subsystem.getClass().getSimpleName() + ": Entering " + getClass().getSimpleName());
    }

    public void execute() {
        System.out.println(subsystem.getClass().getSimpleName() + ": Executing " + getClass().getSimpleName());
    }

    abstract public boolean isFinished();

    public void end() {
        System.out.println(subsystem.getClass().getSimpleName() + ": Ending " + getClass().getSimpleName());
    }

}
