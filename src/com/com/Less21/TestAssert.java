package com.com.Less21;

/**
 * Created by uitsc_000 on 28.11.2015.
 */
public class TestAssert {
    static int val = 3;
    static int getnum(){
        return val--;
    }

    public static void main(String[] args) {
        int n;
        for (int i = 0; i<10; i++){
            n = getnum();
            assert n >0;
            System.out.println("n is "+n);
        }
    }
}
