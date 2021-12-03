package com.lab3;

public class MyArraySizeException extends Exception{
    private String message;
    public MyArraySizeException(String message){
        this.message = message;
    }
    public String getMessage(){return message;}
}
