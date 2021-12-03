package com.lab1;

public class Main {

    public static void main(String[] args) {
        Animal[] animal = {
                new Cat("Дарси"),
                new Cat("Мося"),
                new Dog("Шкет"),
                new Tiger("Шерхан")
        };

        for (Animal a:animal){
            a.run(501);
            a.swim(15);
        }

        int catCount = 0, dogCount = 0, tigerCount = 0;

        for (int i =0; i<animal.length; i++) {
            if(animal[i] instanceof Cat){catCount++;}
            if(animal[i] instanceof Dog){dogCount++;}
            if(animal[i] instanceof Tiger){tigerCount++;}
        }

        System.out.println("Всего животных: "+ (catCount+dogCount+tigerCount)+"\n Котов - " +catCount+ "\n Собак - " + dogCount+ "\n Тигров - "+tigerCount);
    }
}
