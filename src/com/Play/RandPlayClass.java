package com.Play;

import java.util.Random;
import java.util.Scanner;

/**
 * Created by Андрей on 05.01.2016.
 */
public class RandPlayClass{

    public static int randEasy(){
       long start, end;
        start = System.currentTimeMillis();
        end = start + 60000L;
        int bonus = 0;
        while (end>=start){
            Random rand = new Random();
            int a = rand.nextInt(100);
            System.out.print(a);
            System.out.print(" + ");
            int b = rand.nextInt(100);
            System.out.println(b);
            Scanner scanner = new Scanner(System.in);
            int c = scanner.nextInt();
            if (c == a+b){
                bonus = bonus + 1;
            }else {
                bonus = bonus - 1;
            }
            start = System.currentTimeMillis();
        }
        return bonus;
    }
    public static int randMiddle(){
        long start, end;
        start = System.currentTimeMillis();
        end = start + 60000L;
        int bonus = 0;
        while (end>=start){
            Random rand = new Random();
            int a = rand.nextInt(100);
            System.out.print(a);
            double z = rand.nextDouble();
            if (z<0.5){
                System.out.print(" - ");
            }else {
                System.out.print(" + ");
            }
            int b = rand.nextInt(100);
            System.out.println(b);
            Scanner scanner = new Scanner(System.in);
            int c = scanner.nextInt();
            if (z<0.5){
                if (c == a-b){
                    bonus = bonus + 1;
                } else {
                    bonus = bonus - 1;
                }
            } else {
                if (c == a+b){
                    bonus = bonus + 1;
                } else {
                    bonus = bonus - 1;
                }
            }
            start = System.currentTimeMillis();
        }
        return bonus;
    }

    /*public static void time60SecondToConsole(){
        long start = System.currentTimeMillis();
        long end = start + 60000L;
        int times = 60;
        System.out.println(times);
        while (end>=start){
            long prom = System.currentTimeMillis();
            if (prom - start >= 1000){
                times = times - 1;
                System.out.println(times);
                start = start + 1000;
            }
        }//это старый (пробный) таймер
    }*/

    /*public static void time60SecondToConsole(){
        long start = System.currentTimeMillis();
        int times = 60;
        System.out.println(times);
        while (times >= 0) {
            long prom = System.currentTimeMillis();
            if (prom - start >= 1000) {
                times = times - 1;
                if (times % 10 == 0) System.out.println("Времени осталось: " + times);
                start = start + 1000;
            }
        }
        System.out.println("Время вышло! Дате ответ, на последнее задание!");
    }//это новая версия таймера (она реализована в классе ThreadTimeForPlay, как отдельный, новый поток)
    */
}
