package com.com.Less16;

import java.util.ArrayList;

/**
 * Created by uitsc_000 on 08.11.2015.
 */
public class TestList {
    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<>();
        System.out.println(al.size());
        al.add("a");
        al.add("b");
        al.add("w");
        al.add("d");
        al.add("k");
        al.add(1, "a2");
        System.out.println(al.size());
        System.out.println(al);
        al.remove("w");
        al.remove(2);
        System.out.println(al.size());
        System.out.println(al);
    }
}
