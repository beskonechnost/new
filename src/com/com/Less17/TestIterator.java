package com.com.Less17;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

/**
 * Created by uitsc_000 on 14.11.2015.
 */
public class TestIterator {
    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<String>();
        al.add("C");
        al.add("A");
        al.add("B");
        al.add("A");
        al.add("E");
        al.add("F");
        System.out.println("Original al: ");
        Iterator<String> itr = al.iterator();
        while (itr.hasNext()){
            String element = itr.next();
            System.out.println(element+" ");
        }
        System.out.println();

        ListIterator<String> litr = al.listIterator();
        while (litr.hasNext()){
            String element = litr.next();
            litr.set(element+"+");
        }
        System.out.println("Modified contets of al: ");
        itr = al.iterator();
        while (itr.hasNext()){
            String element = itr.next();
            System.out.println(element+" ");
        }
        System.out.println();
        System.out.println("Modified list backwards: ");
        while (litr.hasPrevious()){
            String element = litr.previous();
            System.out.println(element+"+");
        }
        System.out.println();
    }
}
