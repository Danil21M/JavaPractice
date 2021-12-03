package com.lab2;

public class Wall extends Barrier{
    private int heigth;
    private String name;

    public Wall(String _name, int _heigth) {
        this.name = _name;
        this.heigth = _heigth;
    }

    public int getHeigth() {
        return heigth;
    }
    public String getWallName() {return name;}

    @Override
    protected boolean moving(IActions actions) {
        System.out.println("The " + this.name + "; heigth - " + this.heigth);

        actions.jump();

        if (getHeigth() <= actions.getJumpHeight()) {
            System.out.println("Перепрыгнул\n");

            return true;
        } else {
            System.out.println("Не долетел\n");

            return false;
        }
    }
}
