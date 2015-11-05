package com.UkranianITSchool.HW2.OOP.Task2.Korotkov;

import java.util.Random;
import java.util.Scanner;

/**
 * Created by Андрей on 04.11.2015.
 */
public class Woman extends Human{

    public Woman() {
    }
    public Woman(boolean sex, String name, String surname, float height, float weight) {
        super(sex, name, surname, height, weight);
    }

    public Human humanBirth (Man man){
        Human newHuman = new Human() {
            @Override
            public void beingHuman() {

            }
        };

        Random random = new Random();
        double a = random.nextDouble();
        if (a<=0.5) {
            newHuman.setSex(true);
            System.out.println("Поздравляем, у вас мальчик!");
        }
        else  {newHuman.setSex(false);
            System.out.println("Поздравляем, у вас девочка!");
        }
        System.out.println("Выберете имя для ребенка и введите его: ");
        Scanner scanner = new Scanner(System.in);
        newHuman.setName(scanner.next());
        newHuman.setSurname(man.getSurname());
        if (newHuman.isSex() == true){
            float h1  = (float)(man.getHeight()+0.1*this.getHeight()-this.getHeight());
            float w1  = (float)(man.getWeight()+0.1*this.getWeight()-this.getWeight());
            newHuman.setHeight(h1);
            newHuman.setWeight(w1);
        } else {
            float h1  = (float)(this.getHeight()+0.1*man.getHeight()-this.getHeight());
            float w1  = (float)(this.getWeight()+0.1*man.getWeight()-this.getWeight());
            newHuman.setHeight(h1);
            newHuman.setWeight(w1);
        }
        return newHuman;
    }

    @Override
    public void beingHuman() {

    }
}
