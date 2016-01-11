package com.Play;

/**
 * Created by Андрей on 11.01.2016.
 */
public class ThreadTimeForPlay implements Runnable{
    Thread t;

    public ThreadTimeForPlay() {
        t = new Thread(this, "Демонстрационный поток");
        System.out.println("Дочерний поток создан: "+t);
        t.start();
    }//конструктор, который предназначен для создания второго потока


    @Override
    public void run() {
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
    }
}
