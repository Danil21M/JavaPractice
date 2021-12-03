package com.lab3;

public class Main {
    public static void main(String[] args) {
        String[][] array = {{"2", "4", "3", "4"},
                {"19", "26", "2", "1"},
                {"6", "7", "8", "20"},
                {"6", "7", "8", "20"},
                {"12", "54", "23", "33"}};

        IntArray rr = new IntArray(array);
        try {
            System.out.println(rr.giveIntSum());
        } catch (MyArraySizeException | MyArrayDataException e) {
            e.printStackTrace();
        }

    }
}
