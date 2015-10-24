package com.com.Less11;

/**
 * Created by uitsc_000 on 24.10.2015.
 */
public class Less11 implements MyInterface{
    public static void main(String[] args) {
        Enum_in_interface s = Enum_in_interface.C;
        System.out.println("Привет я Enum из интерфейса "+s);

        MyInterface.static_metod_in_interface();

        MyInterface g = new Less11();
        g.default_metod_in_interface();

        Class_in_interface f = new Class_in_interface();
        f.print();
    }
}
