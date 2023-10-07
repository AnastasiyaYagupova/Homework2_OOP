package org.example;


public class Barrier implements Let {

    private final int height;

    public Barrier(int height) {
        this.height = height;
    }

    @Override
    public void let(Marathon athlete) {
        athlete.jump(height);
    }
}
