package com.com.Less14;

import java.util.IllegalFormatCodePointException;

/**
 * Created by uitsc_000 on 01.11.2015.
 */
public class ThrowsGenerate {
    static void thtowOne() throws IllegalAccessException{
        System.out.println("Внутри thtowOne");
        throw  new IllegalAccessException("demo");
    }

    public static void main(String[] args) {
        try {
            thtowOne();
        } catch (IllegalAccessException e) {
            System.out.println("Выброс "+e);
        }
        finally {
            System.out.println("всегда отрабатывает");
        }
    }
}
