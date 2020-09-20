package org.bitbuckets.subsystems;

public interface State {
    void initialize();

    void execute();

    boolean isFinished();

    void end();
}
