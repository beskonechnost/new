package com.GLTest.NewTest;

/**
 * Created by Андрей on 01.12.2015.
 */
public class TestA extends Ancestor{
    public String param = "Hello. Это свойство класса.";

    public class TestInner extends AncestorInner{
        public String par = "Это свойство внутреннего класса!";

        public void metodTestInner(){
            System.out.println("Это метод внутреннего класса!");
        }

        @Override
        public String toString() {
            return "TestInner{" +
                    "par='" + par + '\'' +
                    "} " + super.toString();
        }
    }

    public void metodTestA(){
        System.out.println("Это метод класса!");
    }

    @Override
    public String toString() {
        return "TestA{" +
                "param='" + param + '\'' +
                "} " + super.toString();
    }
}
