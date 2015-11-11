package com.com.Less14;

/**
 * Created by uitsc_000 on 01.11.2015.
 */
public class TestExeption {
    public static void main(String[] args) {
        try {
            int d = 0;
            int a = 42/d;
            System.out.println("Этот текст никогда не напечатается.");
        }catch (ArithmeticException e){
            System.out.println("Деление на ноль.");
        }
        System.out.println("после блоков try-catch.");
    }
}
