package com.lab2;

public enum DistanceLengthEnum {
    LONG(600, "Длинная"), MIDDLE(200, "Нормальная"), SHORT(100, "Малюсенькая");

    private int distance;
    private String name;

    DistanceLengthEnum(int distance, String name){
        this.distance = distance;
        this.name = name;
    }

    public int getDistance() {
        return distance;
    }
}
