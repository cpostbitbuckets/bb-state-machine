package org.bitbuckets.subsystems.arm;

import org.bitbuckets.subsystems.State;
import org.bitbuckets.subsystems.Subsystem;

public class ToggleArmState extends State {

    private final boolean armClosed;

    public ToggleArmState(Subsystem subsystem, boolean armClosed) {
        super(subsystem);
        this.armClosed = armClosed;
    }

    public void execute() {
        super.execute();
        System.out.println("Setting arm closed to " + armClosed);
    }

    public boolean isFinished() {
        return true;
    }

}
