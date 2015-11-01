package com.com.Less13;

/**
 * Created by uitsc_000 on 31.10.2015.
 */
public class TestString1 {
    public static void main(String[] args) {
        String s = "This is a demo of the getChars method.";
        int start = 10;
        int end = 14;
        char buf[] = new char[end - start];
        s.getChars(start, end, buf, 0);
        System.out.println(buf);
    }
}
