package com.lab2;

public class Cat implements IParticipant {
    private String name;
    private int maxRun;
    private int maxJump;

    public Cat(String name, int run, int jump){
        this.name = name;
        this.maxRun = run;
        this.maxJump = jump;
    }
    @Override
    public void Jump(int height) {
        System.out.println("Кошка " + name +" перепрыгнула препятствие высотой " + height);
    }

    @Override
    public void Run(int length) {
        System.out.println("Кошка " + name +" пробежала препятствие длиной " + length);
    }

    @Override
    public void NoJump(int height){
        System.out.println("Кошка " + name +" не смогла перепрыгнуть препятствие высотой " + height);
    }

    @Override
    public void NoRun(int length) {
        System.out.println("Кошка " + name +" не смогла пробежать препятствие длиной  " + length);
    }

    public String getName(){return name;}
    public int getRun(){return maxRun;}
    public int getJump(){return maxJump;}
}
