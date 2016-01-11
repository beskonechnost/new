package com.Play;

import java.util.Scanner;

/**
 * Created by Андрей on 05.01.2016.
 */
public class Play1Console {
    public static void main(String[] args) {
        try {
            Thread t = Thread.currentThread();
            Scanner scanner = new Scanner(System.in);
            System.out.println("Ну что, сыграем! Выбирите сложность: 1 - легкий уровень, 2 - средний");
            int levelSelection = scanner.nextInt();
            int result = 0;
            if (levelSelection == 1) {
                System.out.println("Выбран легкий уровень. Приготовтесь, игра начнется через...");
                t.sleep(1000);
                System.out.print("3...   ");
                t.sleep(1000);
                System.out.print("2...   ");
                t.sleep(1000);
                System.out.println("1!");
                t.sleep(1000);
                System.out.println("Поехали!!!");
                new ThreadTimeForPlay();
                result = RandPlayClass.randEasy();
            } else {
                if (levelSelection == 2){
                    System.out.println("Выбран средний уровень. Приготовтесь, игра начнется через...");
                    t.sleep(1000);
                    System.out.print("3...   ");
                    t.sleep(1000);
                    System.out.print("2...   ");
                    t.sleep(1000);
                    System.out.println("1!");
                    t.sleep(1000);
                    System.out.println("Поехали!!!");
                    new ThreadTimeForPlay();
                    result = RandPlayClass.randMiddle();
                }
            }
            System.out.println("Ваш результат. Павильно подсчитано "+result+" примеров!");


        /*RandPlayClass play = new RandPlayClass();
        play.randMiddle();*/
        } catch (InterruptedException e) {
            System.out.println("Ошибка завершения главного потока");
        }
    }
}
