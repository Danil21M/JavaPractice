package com.lab2;

public class Robot implements IActions {
    private String name;
    private int runDistance;
    private int jumpHeight;

    public Robot(String name, int distance, int height) {
        this.name = name;
        this.runDistance = distance;
        this.jumpHeight = height;
    }

    @Override
    public void run() {
        System.out.println("Robot " + this.name + " is running " + this.getRunDistance());
    }

    @Override
    public void jump() {
        System.out.println("Robot " + this.name + " is jumping " + this.getJumpHeight());
    }

    @Override
    public int getRunDistance() {
        return this.runDistance;
    }

    @Override
    public int getJumpHeight() {
        return this.jumpHeight;
    }
}
