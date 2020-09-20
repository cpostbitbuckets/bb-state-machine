package org.bitbuckets.subsystems;

public class Subsystem {
    protected State state = new IdleState(this);

    public void periodic() {
        if (state != null) {
            state.execute();
            if (state.isFinished()) {
                changeState(new IdleState(this));
            }
        }
    }

    public void changeState(State newState) {
        state.end();
        state = newState;
        state.initialize();
    }
}
