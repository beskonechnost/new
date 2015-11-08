package com.com.Less16;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

/**
 * Created by uitsc_000 on 08.11.2015.
 */
public class Test {
    public static void main(String[] args) {
        HashSet<String> hs = new HashSet<String>();
        hs.add("a");
        hs.add("b");
        hs.add("w");
        hs.add("d");
        hs.add("k");
        System.out.println(hs);

        LinkedHashSet<String> hs1 = new LinkedHashSet<String>();//запись происходит в том же порядке, в котором задаются элементы
        hs1.add("a");
        hs1.add("b");
        hs1.add("w");
        hs1.add("d");
        hs1.add("k");
        System.out.println(hs1);

        TreeSet<String> hs2 = new TreeSet<String>();
        hs2.add("a");
        hs2.add("b");
        hs2.add("w");
        hs2.add("d");
        hs2.add("k");
        System.out.println(hs2);
    }
}
