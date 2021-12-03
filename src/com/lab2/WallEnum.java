package com.lab2;

public enum WallEnum {
    LOW(1, "low"), MIDLE(5, "midle"), HIGH(9,"high");

    int val;
    String name;
    WallEnum(int _val, String _name){
        this.val = _val;
        this.name = _name;
    }

    public int getVal(){
        return val;
    }

    public String getName(){
        return name;
    }
}
