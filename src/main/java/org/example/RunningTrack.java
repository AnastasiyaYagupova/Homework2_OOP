package org.example;

public class RunningTrack implements Let {

    private final int length;

    public RunningTrack(int length) {
        this.length = length;
    }

    @Override
    public void let(Marathon athlete) {
        athlete.run(length);
    }
}
