package com.com.Less17;

import java.util.Comparator;
import java.util.TreeSet;

/**
 * Created by uitsc_000 on 14.11.2015.
 */
class TestComporator implements Comparator<String>{
    @Override
    public int compare(String o1, String o2) {
        String a1 = o1;
        String a2 = o2;
        return a2.compareTo(a1);
    }
}
class Test1{
    public static void main(String[] args) {
        TreeSet<String> ts = new TreeSet<String>(new TestComporator());
        ts.add("C");
        ts.add("F");
        ts.add("W");
        ts.add("M");
        ts.add("A");
        ts.add("B");

        for (String element : ts){
            System.out.println(element+" ");
        }
    }
}
