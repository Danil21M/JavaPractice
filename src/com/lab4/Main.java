package com.lab4;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        String[] str = new String[]{"раз","два","три"};
        Integer[] intt = new Integer[]{1,2,3};
        MyArray array = new MyArray<>();

        ArrayList<String> newStr = array.swapElements(array.arrayToList(str),0,1);
        for(String i:newStr){
            System.out.println(i);
        }

        ArrayList<Integer> newIntt = array.swapElements(array.arrayToList(intt),0,2);
        for(Integer i:newIntt){
            System.out.println(i);
        }

        Apple apple1 = new Apple();
        Apple[] apples = {
                new Apple(),
                new Apple(),
                new Apple()
        };

        Box<Apple> boxApple1 = new Box(apples);
        boxApple1.add(apple1);

        Orange orange = new Orange();
        Orange[] oranges ={
                new Orange(),
                new Orange()
        };

        Box<Orange> boxOrange =new Box(orange);
        boxOrange.add(oranges);

        System.out.println(boxApple1.getAllWeight());
        System.out.println(boxOrange.getAllWeight());
        System.out.println("boxApple1 и boxOrange одного веса? " + boxApple1.compare(boxOrange));

        Apple apple2 = new Apple();
        Box<Apple> boxApple2 = new Box(apple2);


        boxApple1.pourOutFruit(boxApple1);
        System.out.println(boxApple1.getAllWeight());
        System.out.println(boxApple2.getAllWeight());

        Banana banana = new Banana();
        Box<Banana> boxBanana = new Box(banana);
        System.out.println(boxBanana.getAllWeight());
        pourOutFruit(boxApple1,boxBanana);
        System.out.println(boxBanana.getFruits());
        System.out.println(boxApple1.getFruits());
    }
    public static void pourOutFruit(Box startBox, Box<? extends Banana> finishBox){
        if (startBox.getFruits().get(0) instanceof Orange) {
            finishBox.getFruits().addAll(startBox.getFruits());
            finishBox.setAllWeight(startBox);
            startBox.getFruits().clear();
            startBox.weightZero();
        }
    }
}