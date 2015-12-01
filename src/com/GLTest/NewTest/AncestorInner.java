package com.GLTest.NewTest;

/**
 * Created by Андрей on 01.12.2015.
 */
public class AncestorInner {
    public String pm = "Свойство предка внутреннего класса!";

    public void metodAncestorInner(){
        System.out.println("Это метод предка внутреннего класса!");
    }

    @Override
    public String toString() {
        return "AncestorInner{" +
                "pm='" + pm + '\'' +
                '}';
    }
}
