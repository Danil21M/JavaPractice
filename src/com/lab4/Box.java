package com.lab4;

import java.util.ArrayList;
import java.util.Collections;

public class Box<F extends Fruit> {

    private float allWeight=0;

    private ArrayList<F> Fruits = new ArrayList<>();
    MyArray arr = new MyArray<>();

    public Box(){
    }

    public Box(F... array){
        ArrayList<F> temp = arr.arrayToList(array);
        Fruits.addAll(temp);
        for(F i:temp){
            allWeight+=i.getWeight();
        }
    }

    public void weightZero(){
        allWeight=0;
    }

    public void setAllWeight(Box<F> box){
        F element =(F)box.getFruits().get(0);
        float value = element.getWeight();
        int count = box.getFruits().size();

        for (int i = 0; i < count; i++) {
            allWeight += value;
        }
    }

    public float getAllWeight(){
        return allWeight;
    }

    public ArrayList<F> getFruits(){
        return Fruits;
    }


    public void add(F... array){
        ArrayList<F> temp = arr.arrayToList(array);
        Fruits.addAll(temp);
        for(F i:temp){

            allWeight+=i.getWeight();
        }
    }

    public boolean compare(Box<?> box){
        if(Math.abs(this.allWeight - box.getAllWeight())<0.001) return true;
        else return false;
    }

    public void pourOutFruit(Box<F> box){
        if(box == this)return;

        ArrayList temp = Fruits;
        Fruits.clear();
        box.add((F[]) (temp.toArray()));
        allWeight = 0;

    }

}
