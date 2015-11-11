package com.com.Less16;

import java.util.LinkedList;

/**
 * Created by uitsc_000 on 08.11.2015.
 */
public class TestLinkedList {
    public static void main(String[] args) {
        LinkedList<String> ll = new LinkedList<>();
        System.out.println(ll.size());
        ll.add("a");
        ll.add("b");
        ll.add("w");
        ll.add("d");
        ll.add("k");
        ll.addFirst("A");
        ll.addLast("Z");
        ll.add(1, "a2");
        System.out.println(ll);
        ll.remove("w");
        ll.remove(2);
        System.out.println(ll);
        ll.removeFirst();
        ll.removeLast();
        System.out.println(ll);
        String val = ll.get(2);
        ll.set(2, val + "Changed");
        System.out.println(ll);
    }
}
