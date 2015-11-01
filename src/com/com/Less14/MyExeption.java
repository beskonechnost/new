package com.com.Less14;

/**
 * Created by uitsc_000 on 01.11.2015.
 */
public class MyExeption extends Exception{
    public void myEx(){
        System.out.println("мое исключение");
    }

    public MyExeption(String message) {
        super(message);
    }

    @Override
    public String toString() {
        return "MyExeption{} " + super.toString();
    }
}
