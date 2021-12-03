package com.lab3;

public class IntArray {
    private String[][] array;

    public IntArray(String[][] array) {
        this.array = array;
    }

    public int giveIntSum() throws MyArraySizeException, MyArrayDataException {
        if ((array.length != 4) || (array[0].length != 4)) {
            throw new MyArraySizeException("Выход за пределы массива");
        }

        int sum = 0;

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                try {
                    sum+= Integer.valueOf(array[i][j]);
                }catch (NumberFormatException e){
                    throw new MyArrayDataException("В ячейке " + (i+1) + " " + (j+1) + " массива лежит что-то не то");
                }
            }
        }

        return sum;
    }
}
