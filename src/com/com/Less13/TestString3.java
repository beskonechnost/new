package com.com.Less13;

/**
 * Created by uitsc_000 on 31.10.2015.
 */
public class TestString3 {
    public static void main(String[] args) {
        System.out.println( "Foobar".endsWith("bar"));
        System.out.println("Foobar".startsWith("Foo"));
        System.out.println("Foobar".regionMatches(1, "oo", 2, 2));//эта байда не работает
    }
}
