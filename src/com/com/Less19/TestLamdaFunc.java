package com.com.Less19;

import java.util.Arrays;
import java.util.List;

/**
 * Created by uitsc_000 on 21.11.2015.
 */
public class TestLamdaFunc {
    public static void main(String[] args) {
        List<String> ml = Arrays.asList("a1", "a2", "b3", "c1", "c2");
        ml.stream() //коллекция в процессе не менеяеться, а действия проходят
                .filter(s -> s.startsWith("c"))
                .map(String::toUpperCase)
                .sorted()
                .forEach(System.out::println);
        System.out.println(ml);
    }
}
