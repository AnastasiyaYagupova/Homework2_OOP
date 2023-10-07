package org.example;

public class Human implements Marathon {

    private final int maxLength;
    private final int maxHeight;
    boolean isActive;

    public Human(int maxLength, int maxHeight) {
        this.maxLength = maxLength;
        this.maxHeight = maxHeight;
        this.isActive = true;
    }

    @Override
    public void run(int length) {
        if (isActive) {
            if (maxLength > length) {
                System.out.println("Человек пробежал " + length);
            } else {
                isActive = false;
                System.out.println("Человек вышел из марафона");
            }
        }
    }

    @Override
    public void jump(int height) {
        if (isActive) {
            if (maxHeight > height) {
                System.out.println("Человек пробежал " + height);
            } else {
                isActive = false;
                System.out.println("Человек вышел из марафона");
            }
        }
    }
}
