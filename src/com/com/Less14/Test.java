package com.com.Less14;

/**
 * Created by uitsc_000 on 01.11.2015.
 */
public class Test {
    public static void main(String[] args) {
        String s = "Now is the time for aii good men "+
                "to come to the aid of their country";
        System.out.println(s);
        System.out.println("indexOf(t) = "+s.indexOf("t"));//работает как с символами так и со строками
        System.out.println("lastIndexOf(t) = "+s.lastIndexOf("t"));//работает как с символами так и со строками
        System.out.println("indexOf(t, 10) = "+s.indexOf("the", 10));//работает как с символами так и со строками

        System.out.println("Hello".replace("l","w"));//меняем в заданой страке все 1-е символы, на 2-е
    }
}
