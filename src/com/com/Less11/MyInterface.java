package com.com.Less11;

/**
 * Created by uitsc_000 on 24.10.2015.
 */
public interface MyInterface {

    int b = 10;

    enum Enum_in_interface{A,B,C};

    static void static_metod_in_interface(){
        System.out.println("Привет из статического метода n");
    }

    default void default_metod_in_interface(){
        System.out.println("Привет из деФОЛТНОГО метода");
    }

    class Class_in_interface{
        public void print(){
            System.out.println("привет из класса");
        }
        interface Interface_in_interface{};
    }
}
