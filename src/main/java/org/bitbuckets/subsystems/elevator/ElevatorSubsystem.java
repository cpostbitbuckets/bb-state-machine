package org.bitbuckets.subsystems.elevator;

import org.bitbuckets.subsystems.Subsystem;
import org.bitbuckets.subsystems.arm.ArmSubsystem;

public class ElevatorSubsystem extends Subsystem {
    private final ArmSubsystem armSubsystem;

    public ElevatorSubsystem(ArmSubsystem armSubsystem) {
        this.armSubsystem = armSubsystem;
    }

}
