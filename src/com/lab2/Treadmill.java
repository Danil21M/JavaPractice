package com.lab2;

public class Treadmill extends Barrier{

    private int length;
    private String name;

    public Treadmill(String _name, int _length) {
        this.name = _name;
        this.length = _length;
    }

    public int getLength() {
        return length;
    }
    public String getRoudName() {return name;}

    @Override
    protected boolean moving(IActions actions) {
        System.out.println("The " + this.name + "; length - " + this.length);

        actions.run();

        if (getLength() <= actions.getRunDistance()) {
            System.out.println("Пробежал\n");

            return true;
        } else {
            System.out.println("Споткнулся\n");

            return false;
        }
    }
}
