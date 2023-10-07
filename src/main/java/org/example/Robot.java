package org.example;

public class Robot implements Marathon {

    private final int maxLength;
    private final int maxHeight;
    boolean isActive;

    public Robot(int maxLength, int maxHeight) {
        this.maxLength = maxLength;
        this.maxHeight = maxHeight;
        this.isActive = true;
    }

    @Override
    public void run(int length) {
        if (isActive) {
            if (maxLength > length) {
                System.out.println("Робот пробежал " + length);
            } else {
                isActive = false;
                System.out.println("Робот вышел из марафона");
            }
        }
    }

    @Override
    public void jump(int height) {
        if (isActive) {
            if (maxHeight > height) {
                System.out.println("Робот пробежал " + height);
            } else {
                isActive = false;
                System.out.println("Робот вышел из марафона");
            }
        }
    }
}
