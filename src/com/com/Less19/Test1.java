package com.com.Less19;

import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * Created by uitsc_000 on 21.11.2015.
 */
public class Test1 {
    public static void main(String[] args) {
        /*Arrays.asList("a1","a2","a3")
                .stream()
                .findFirst()
                .ifPresent(System.out::println);
        Arrays.asList()
                .stream()
                .findFirst()
                .ifPresent(System.out::println);

        IntStream.range(-2, 3)
                .forEach(System.out::print);
        System.out.println();*/

        /*Stream<Date> stream = new Stream.generate(()->{//тут некая бочина с generate
            return new Date();});
        stream.forEach(p->System.out.println(p));*/

        /*List<Integer> list =Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        Stream<Integer> stream = list.stream();
        List<Integer> evenNumbersList = stream.filter(i -> i%2==0).collect(Collectors.toList());
        //List<Integer> evenNumbersList = stream.filter(i -> i%2==0).toList();//eoe jlby dfhbfyn pfgbcb
        //Integer[] evenNumbersArr = stream.filter(i->i%2==0).toArray(Integer[]::new);
        System.out.println(evenNumbersList);
        //System.out.println(Arrays.toString(evenNumbersArr));
        //работа с листом и массивом, запись*/

        Stream.of("d2", "a2", "b1", "b2", "c")
                .filter(s -> {
                    System.out.println("filter: " + s);
                    return true;
                });

        Stream.of("d2","a2","b2","c")
                .map(s->{
                    System.out.println("map: "+s);
                    return s.toUpperCase();
                })
                .anyMatch(s->{
                    System.out.println("anyMatch: "+s);
                    return s.startsWith("A");
                });

        List<Integer> list = new ArrayList<>();
        for(int i = 1; i<10; i++){
            list.add(i);
        }
        Stream<Integer>stream = list.parallelStream();
        Integer[] evenNumbersArr = stream.filter(i -> i%2 == 0).toArray(Integer[]::new);
        System.out.println(Arrays.deepToString(evenNumbersArr));
        System.out.println();

        List<Integer> number = Arrays.asList(3,2,2,3,7,3,5);
        IntSummaryStatistics stats = number.stream().mapToInt((x) -> x).summaryStatistics();
        System.out.println(stats.getMax());
        System.out.println(stats.getMin());
        System.out.println(stats.getSum());
        System.out.println(stats.getAverage());

        Random random = new Random();
        random.ints().limit(10).forEach(System.out::println);
    }
}
