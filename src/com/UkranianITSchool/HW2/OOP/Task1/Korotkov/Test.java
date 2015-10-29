package com.UkranianITSchool.HW2.OOP.Task1.Korotkov;

import java.util.Scanner;

import static com.UkranianITSchool.HW2.OOP.Task1.Korotkov.WritingInstrument.averagePrice;

/**
 * Created by Андрей on 29.10.2015.
 */
public class Test {
    public static void main(String[] args) {
        //1.3. При помощи статических полей и метода найти и отпечатать среднюю цену товара.
        WritingInstrument[] shop = new WritingInstrument[5];
        shop[0] = new Pens("Parker",200.1,"Red","Перьевая","Механическая");
        shop[1] = new Pencil("Kahinor",10.5,"Green","B","Дубовая основа");
        shop[2] = new Pencil("DDS", 6.7,"Yellow","1H","Березовая основа");
        shop[3] = new Pens("Sova",99.1,"Blue","Перьевая","Механическая");
        shop[4] = new Pens("MAXRITER",25.5,"Red","Шариковая","Простая с колпачком");
        double m = averagePrice(shop);
        System.out.println(m);


        //3. Заполнить контейнер, распечатать, отсортировать, распечатать.
        System.out.println("Здравствуйте! Давайте создадим Ваше персональное хранилище пишущих предметов");
        System.out.println("Сколько предметов вы хотите хранить в Вашем контейнере? ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        WritingInstrument[] store = new WritingInstrument[number];
        Container container = new Container(store, 0);
        System.out.println("Какую продукцию будем добовлять в Ваше хранилище?");
        for (int i = 0; i<store.length; i++){
            System.out.println("В магазине есть ручки: Parker, Sova и  MAXRITER. И карандаши Kahinor и DDS. Напишите имя желаемого товара: ");
            String nameProduct = scanner.next();
            switch (nameProduct){
                case "Parker":
                    container.Add(shop[0]); break;
                case "Sova":
                    container.Add(shop[3]); break;
                case "MAXRITER":
                    container.Add(shop[4]); break;
                case "Kahinor":
                    container.Add(shop[1]); break;
                case "DDS":
                    container.Add(shop[2]); break;
            }
        }
        System.out.println("Распечатаем информацию о товарах в нашем хранилище:");
        System.out.println();
        container.Print();
        System.out.println("Отсортируем товары в контейнере по цене");
        container.SortByPrice();
        System.out.println();
        System.out.println("Распечатаем информацию о товарах в нашем хранилище после сортировки: ");
    }
}
