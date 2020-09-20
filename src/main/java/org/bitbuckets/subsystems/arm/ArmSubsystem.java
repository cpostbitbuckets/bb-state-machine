package org.bitbuckets.subsystems.arm;

import org.bitbuckets.subsystems.Subsystem;

public class ArmSubsystem extends Subsystem {

    public void openArm() {
        changeState(new ToggleArmState(this, false));
    }

    public void closeArm() {
        changeState(new ToggleArmState(this, true));
    }
}
