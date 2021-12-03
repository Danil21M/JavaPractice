package com.lab2;
import java.util.Random;
public class Main {
    public static void main(String[] args){
        Random rand = new Random();
        IActions[] actions = new IActions[3];

        int distance = rand.nextInt(10);
        int heigth = rand.nextInt(10);
        actions[0] = new Human("Danya", distance, heigth);

        distance = rand.nextInt(10);
        heigth = rand.nextInt(10);
        actions[1] = new Robot("8-bit", distance, heigth);

        distance = rand.nextInt(10);
        heigth = rand.nextInt(10);
        actions[2] = new Cat("Mosya", distance, heigth);

        Barrier[] barriers = new Barrier[4];

    }
}
