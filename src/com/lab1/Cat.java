package com.lab1;

public class Cat extends Animal { //Наследование от класса Animal

    public Cat(String name) { //Конструктор класса
        this.name = name;
    }

    @Override
    public void run(int lenght) {
        if (lenght <= 200) {
            System.out.println("Кот " + this.name + " пробежал.");
        } else {
            System.out.println("Кот " + this.name + " НЕ пробежла.");
        }
    }

    @Override
    public void swim(int lenght) {
        System.out.println("Кот " + this.name + " потонул. Ты разве не знал, что кошки не умеют плавать?\n");
    }
}
