package com.com.Less14;

/**
 * Created by uitsc_000 on 01.11.2015.
 */
public class TestMyExeption {
    static void throwOne() throws MyExeption{
        System.out.println("внутри throwOne");
        throw  new MyExeption("demo");
    }
    public static void main(String[] args) {
        try {
            throwOne();
        }catch (MyExeption e){
            e.myEx();
            System.out.println("Выброс "+e);
        }
    }
}
