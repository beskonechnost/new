package com.com.Less16;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

/**
 * Created by uitsc_000 on 08.11.2015.
 */
public class J8List {
    public static void main(String[] args) {
        List<String> myList = Arrays.asList("a1", "a2", "b1", "c2", "c1");
        myList
                .stream()
                .filter(s -> s.startsWith("c"))
                .map(String::toUpperCase)
                .sorted()
                .forEach(System.out::println);

        IntStream.range(1, 4)
                .forEach(System.out::println);
    }
}
