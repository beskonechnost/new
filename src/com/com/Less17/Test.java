package com.com.Less17;

import java.util.ArrayList;

/**
 * Created by uitsc_000 on 14.11.2015.
 */
public class Test {
    public static void main(String[] args) {
        ArrayList<Integer> vals = new ArrayList<Integer>();

        vals.add(1);
        vals.add(2);
        vals.add(3);
        vals.add(4);
        vals.add(5);
        System.out.println("Original contents vals: ");
        for(int v : vals)
            System.out.println(v+" ");
        System.out.println(" ");

        int sum = 0;
        for (int v : vals) sum +=v;
        System.out.println("Sum of vals: "+sum);
    }
}
