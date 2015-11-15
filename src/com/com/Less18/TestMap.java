package com.com.Less18;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * Created by uitsc_000 on 15.11.2015.
 */
public class TestMap {
    public static void main(String[] args) {
        HashMap<String, Double> hm = new HashMap<>();
        hm.put("John Doe", 3434.34);
        hm.put("Tom Smith", 123.22);
        hm.put("Tod Hall", 99.22);
        hm.put("Ralph Smith", -19.08);
        Set<Map.Entry<String,Double>> set = hm.entrySet();
        for (Map.Entry<String, Double> me : set){
            System.out.print(me.getKey() + ": ");
            System.out.println(me.getValue());
        }
        System.out.println();
        double balanse = hm.get("John Doe");
        hm.put("John Doe",balanse+1000);
        System.out.println("John Doe's new balanse: "+hm.get("John Doe"));
    }
}
