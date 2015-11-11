package com.UkranianITSchool.HW2.OOP.Task2.Korotkov;

import java.util.Random;
import java.util.Scanner;

/**
 * Created by Андрей on 04.11.2015.
 */
public abstract class Human {
    private boolean sex;
    private String name;
    private String surname;
    private float height;
    private float weight;

    public Human() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите пол человека true-муж., false-женский: ");
        this.sex = scanner.hasNext();
        System.out.println("Введите имя человека ");
        this.name = scanner.next();
        System.out.println("Введите фамилию человека ");
        this.surname = scanner.next();
        System.out.println("Рост ");
        this.height = scanner.nextFloat();
        System.out.println("Вес ");
        this.weight = scanner.nextFloat();
    }


    public boolean isSex() {
        return sex;
    }
    public void setSex(boolean sex) {
        this.sex = sex;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getSurname() {
        return surname;
    }
    public void setSurname(String surname) {
        this.surname = surname;
    }
    public float getHeight() {
        return height;
    }
    public void setHeight(float height) {
        this.height = height;
    }
    public float getWeight() {
        return weight;
    }
    public void setWeight(float w) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Human{" +
                "sex=" + sex +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", height=" + height +
                ", weight=" + weight +
                '}';
    }

    public boolean talk (Human human1){
        if (this.isSex() == true){
            if (human1.isSex() == false){
                return true;
            } else {
                Random random = new Random();
                double a = random.nextDouble();
                if (a <= 0.5){
                    return true;
                } else return false;
            }
        } else return true;
    };
    public boolean tolerateSociety (Human human1){
        Random random = new Random();
        if (this.isSex() == true){
            if (human1.isSex() == true){
                double a = random.nextDouble();
                if (a<=0.056) return true;
                else return false;
            } else{
                double a = random.nextDouble();
                if (a<=0.7) return true;
                else return false;
            }
        } else{
            if (human1.isSex() == false){
                double a = random.nextDouble();
                if (a<=0.05) return true;
                else return false;
            } else {
                double a = random.nextDouble();
                if (a<=0.7) return true;
                else return false;
            }
        }
    };
    public boolean spendTimeTogether (Human human1){
        double a, b;
        if (this.getHeight()>= human1.getHeight()){
            a = this.getHeight();
            b = human1.getHeight();
        } else {
            a = human1.getHeight();
            b = this.getHeight();
        }
        Random random = new Random();
        double a1 = random.nextDouble();
        if ((a - b) >= (a / 10)) {
            if (a1<=0.85) return true;
            else return false;
        } else {
            if (a1<=0.95) return true;
            else return false;
        }

    };



    public void haveARelationship (Human human1){
        if ((this.talk(human1)== true)&&(this.tolerateSociety(human1)==true)&&(this.spendTimeTogether(human1)==true)){
            if (this.isSex() == human1.isSex()){
                System.out.println("Люди одного пола, и они не могут родить ребенка.");
            } else {
                if (this.isSex()==false){
                    humanBirth(human1);
                } else {
                    human1.humanBirth(this);
                }
            }
        } else {
            System.out.println("Ничего не вышло. Пара разошлась.");
        }
    }
    public Human humanBirth(Human human){
        if (this.isSex()==true){
            String test = "Мужик не может родить ребенка!";
            System.out.println(test);
            return null;
        } else {
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
            newHuman.setSurname(human.getSurname());
            if (newHuman.isSex() == true){
                float h1  = (float)(human.getHeight()+0.1*this.getHeight()-this.getHeight());
                float w1  = (float)(human.getWeight()+0.1*this.getWeight()-this.getWeight());
                newHuman.setHeight(h1);
                newHuman.setWeight(w1);
            } else {
                float h1  = (float)(this.getHeight()+0.1*human.getHeight()-this.getHeight());
                float w1  = (float)(this.getWeight()+0.1*human.getWeight()-this.getWeight());
                newHuman.setHeight(h1);
                newHuman.setWeight(w1);
            }
            return newHuman;
        }
    }

    public abstract void beingHuman();
}
