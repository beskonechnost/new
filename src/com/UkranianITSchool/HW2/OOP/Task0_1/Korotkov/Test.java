package com.UkranianITSchool.HW2.OOP.Task0_1.Korotkov;

import java.util.Scanner;

/**
 * Created by Андрей on 28.10.2015.
 */
public class Test {
    public static void main(String[] args) {

        Candy chocolateMilk = new Candy("Шоколадка_молочная",0.05,3.5,"Шоколадная",0.026);
        Candy chocolateBlack = new Candy("Шоколадка_черная",0.05,4.1,"Шоколадная",0.024);
        Candy snickers = new Candy("Сникерс",0.05,4.5,"Шоколадная",0.025);
        Candy toffee = new Candy("Ириска",0.025,1.7,"Ирис",0.003);
        Candy caramel = new Candy("Карамелька",0.025,1.1,"Карамель",0.008);

        Candy[] candyInPresent = new Candy[40];
        Present myPresent = new Present("Мой подарок",0,1.0,0,candyInPresent,0,1.0);

        System.out.println("Здравствуйте!");
        Scanner scan = new Scanner(System.in);
            System.out.println("Сколько конфет в набор вы хотите добавить? (в набор помещаеться не больше 40 конфет)");
            int wantCountCandy = scan.nextInt();
            while (wantCountCandy>myPresent.getCountCandyInPresent()){
                    System.out.println("Введите название конфеты, которую хотите добавить: ");
                    System.out.println("Названия на выбор: Шоколадка_молочная, Шоколадка_черная, Сникерс, Ириска, Карамелька");
                    String nameWantCandy = scan.next();
                    switch (nameWantCandy) {
                        case "Шоколадка_молочная":
                            myPresent.addCandy(chocolateMilk);
                            break;
                        case "Шоколадка_черная":
                            myPresent.addCandy(chocolateBlack);
                            break;
                        case "Сникерс":
                            myPresent.addCandy(snickers);
                            break;
                        case "Ириска":
                            myPresent.addCandy(toffee);
                            break;
                        case "Карамелька":
                            myPresent.addCandy(caramel);
                            break;
                    }
            }
        System.out.println();
        System.out.print("Стоимость вашего подарка:" + myPresent.getPrice()+", вес подарка: "+myPresent.getWeight()+", сахара в конфетах подарка: "+myPresent.getSugarCandy());
        System.out.println();
        System.out.println("Отсортеруем конфеты в нашем подарке по цене, в порядке возростания: ");
        myPresent.sortForPrise();
        System.out.println(myPresent.toString());

        System.out.println("Определим конфеты в нашем подарке, которая соответствует заданному диапазону содержания сахара");
        double minSugar = 0;
        double maxSugar = 0.01;
        myPresent.rangeSugar(minSugar,maxSugar);
    }
}
