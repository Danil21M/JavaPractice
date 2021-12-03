package com.lab1;

public class Dog extends Animal{ //Наследование от класса Animal

    public Dog(String name){
        this.name=name;
    }

    @Override
    public void run(int lenght) {
        if (lenght<=500){
            System.out.println("Пес " + this.name + " пробежал.");
        }
        else {
            System.out.println("Пес "+ this.name + " НЕ пробежал.");
        }
    }

    public void swim(int lenght) {
        if(lenght<=10){
            System.out.println("Пес " + this.name + "проплыл.\n");
        }
        else {
            System.out.println("Пес " + this.name + "НЕ проплыл.\n");
        }
    }

}
