package org.bitbuckets.subsystems.helloworld;

import org.bitbuckets.subsystems.State;

public class HelloWorldSubsystem {
    State state = new IdleState();

    public void triggerHelloWorld() {
        state.end();
        state = new HelloWorldState();
        state.initialize();
    }

    public void periodic() {
        state.execute();

        // switch back to idle if our current state is done
        if (state.isFinished()) {
            state.end();
            state = new IdleState();
            state.initialize();
        }
    }
}
