package com.com.Less18;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/**
 * Created by uitsc_000 on 15.11.2015.
 */
public class TreeMapTest {
    public static void main(String[] args) {
        Map<String, Double> tm = new TreeMap<>();
        tm.put("John Doe", 3434.34);
        tm.put("Tom Smith", 123.22);
        tm.put("Tod Hall", 99.22);
        tm.put("Ralph Smith", -19.08);
        Set<Map.Entry<String,Double>> set = tm.entrySet();
        for (Map.Entry<String, Double> me : set){
            System.out.print(me.getKey() + ": ");
            System.out.println(me.getValue());
        }
        System.out.println();
        double balanse = tm.get("John Doe");
        tm.put("John Doe",balanse+1000);
        System.out.println("John Doe's new balanse: "+tm.get("John Doe"));
    }
}
