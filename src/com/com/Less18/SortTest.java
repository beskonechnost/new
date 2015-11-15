package com.com.Less18;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/**
 * Created by uitsc_000 on 15.11.2015.
 */
public class SortTest {
    public static void main(String[] args) {
        List<String> list1 = Arrays.asList("red","green","blue");
        Collections.sort(list1);
        System.out.println(list1);
        List<String> list2 = Arrays.asList("green", "red", "yellow","blue");
        Collections.sort(list2, Collections.reverseOrder());
        System.out.println(list2);
        Collections.shuffle(list2);//лучайно перемешивает значения листа
        System.out.println(list2);
        List<String> list3 = Arrays.asList("red","green","blue");
        Collections.fill(list3, "black");//заменяет все значения в колекции на заданное
        System.out.println(list3);

        System.out.println(Collections.disjoint(list1, list2));// метод определяет, есть ли в коллекциях общие элементы
        System.out.println(Collections.disjoint(list1, list3));

        System.out.println(Collections.max(list1));
        System.out.println(Collections.min(list1));//максимальные и минимальные значения
        System.out.println(Collections.frequency(list1, "red"));//оличество элементов с заданым свойством
    }
}
