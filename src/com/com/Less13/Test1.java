package com.com.Less13;

/**
 * Created by uitsc_000 on 31.10.2015.
 */
public class Test1 {
    public static void main(String[] args) {
        Integer iOb, iOb2;
        int i;

        iOb = 100;
        System.out.println("Original value of iOb: "+iOb);

        ++iOb;
        System.out.println("After ++iOb: "+iOb);
        iOb2 = iOb + (iOb/3);
        System.out.println("iOb2 after expression: "+iOb2);
        i = iOb + (iOb/3);
        System.out.println("i after expression: "+i);
    }
}
