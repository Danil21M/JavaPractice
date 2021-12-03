package com.lab3;

public class MyArrayDataException extends Exception{
    private String message;
    public MyArrayDataException(String message){
        this.message = message;
    }
    public String getMessage(){return message;}
}
