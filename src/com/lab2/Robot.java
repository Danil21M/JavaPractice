package com.lab2;

public class Robot implements IParticipant {
    private String name;
    private int maxRun;
    private int maxJump;

    public Robot(String name, int run, int jump){       //Конструктор класса
        this.name = name;
        this.maxRun = run;
        this.maxJump= jump;
    }

    @Override
    public void Jump(int height) {

        System.out.println("Робот " + name + " перепрыгнул препятствие высотой " + height);
    }

    @Override
    public void Run(int length) {

        System.out.println("Робот " + name +" пробежал препятствие длиной  " + length);
    }

    @Override
    public void NoJump(int height){
        System.out.println("Робот " + name + " не смог перепрыгнуть препятствие высотой " + height);
    }

    @Override
    public void NoRun(int length) {
        System.out.println("Робот " + name +" не смог пробежать препятствие длиной  " + length);
    }

    public String getName(){return name;}
    public int getRun(){return maxRun;}
    public int getJump(){return maxJump;}
}
