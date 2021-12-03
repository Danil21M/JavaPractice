package com.lab1;

public class Tiger extends Animal{ //Наследование от класса Animal

    public Tiger(String name){
        this.name=name;
    }

    @Override
    public void run(int lenght) {
        System.out.println("Тигр "+this.name+" пробежал всю дистанцию. ("+ lenght+ ")");
    }

    @Override
    public void swim(int lenght) {
        System.out.println("Тигр " + this.name+ " проплыл всю дистанцию. ("+lenght+")\n");
    }

}
