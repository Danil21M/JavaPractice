package com.lab4;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class MyArray<A> {

    public ArrayList<A> swapElements(ArrayList<A> array, int index1, int index2){
        if((index1<array.size()) && (index2<array.size())){
            A el1 = array.get(index1);
            A el2 = array.get(index2);
            array.remove(index1);
            array.add(index1,el2);
            array.remove(index2);
            array.add(index2,el1);
            return array;
        }
        else{
            System.out.println("Данных элементов нет в этом массиве,\nМассив не был изменен");
            return array;
        }
    }

    public ArrayList<A> arrayToList(A[] arr){
        ArrayList<A> array = new ArrayList<>();
        Collections.addAll(array, arr);
        return array;
    }
}
