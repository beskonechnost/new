package com.com.Less12;

/**
 * Created by uitsc_000 on 25.10.2015.
 */
enum Apple{
    Jonathan, GoldenDel, RedDel, Winesap, Cortland
}

public class EnumDemo {
    public static void main(String[] args) {
        Apple ap = Apple.Cortland;
        System.out.println("Value of ap: "+ap);
        System.out.println();

        ap = Apple.GoldenDel;
        if (ap == Apple.GoldenDel) System.out.println("ap contains GoldenDel");
        if (ap.equals(Apple.GoldenDel)) System.out.println("ap contains GoldenDel");
        switch (ap){
            case Jonathan:
                System.out.println("J is red");
            case GoldenDel:
                System.out.println("G is yellow");
        }

        //Apple.values(); - возвращает массив значаний, содержащи список констант из энума, ниже показан как этот метод реализован
        Apple allappels[] = Apple.values();
        for (Apple a: allappels) {
            System.out.println(a+" "+a.ordinal());//a.ordinal() - получаем позицию данного элемента в списке констант (нумерация идет с 0 элемента)
            System.out.println(a);
        }

        ap = Apple.valueOf("GoldenDel"); // - valueOf("GoldenDel") - поиск заданого значения в списке констант
        System.out.println("ap const "+ ap);
    }
}
