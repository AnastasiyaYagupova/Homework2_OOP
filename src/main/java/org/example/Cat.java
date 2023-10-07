package org.example;

public class Cat implements Marathon {

    private final int maxLength;
    private final int maxHeight;
    boolean isActive;

    public Cat(int maxLength, int maxHeight) {
        this.maxLength = maxLength;
        this.maxHeight = maxHeight;
        this.isActive = true;
    }

    @Override
    public void run(int length) {
        if (isActive) {
            if (maxLength > length) {
                System.out.println("Кот пробежал " + length);
            } else {
                isActive = false;
                System.out.println("Кот вышел из марафона");
            }
        }
    }

    @Override
    public void jump(int height) {
        if (isActive) {
            if (maxHeight > height) {
                System.out.println("Кот прыгнул " + height);
            } else {
                isActive = false;
                System.out.println("Кот вышел из марафона");
            }
        }
    }
}