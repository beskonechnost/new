package com.GLTest.NewTest;

/**
 * Created by Андрей on 01.12.2015.
 */
public class Ancestor {
    public String p = "Свойство предка класса!";
    public void metodAncestor(){
        System.out.println("Это метод класса предка!");
    }
    @Override
    public String toString() {
        return "Ancestor{" +
                "p='" + p + '\'' +
                '}';
    }
}
