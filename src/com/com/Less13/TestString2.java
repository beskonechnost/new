package com.com.Less13;

/**
 * Created by uitsc_000 on 31.10.2015.
 */
public class TestString2 {
    public static void main(String[] args) {
        String s1 = "Java";//литерал и ссылка на него
        String s2 = new String("Java");
        System.out.println(s1==s2);
        s2 = s2.intern();//преобразует объект в литерал
        System.out.println(s1==s2);
    }
}
