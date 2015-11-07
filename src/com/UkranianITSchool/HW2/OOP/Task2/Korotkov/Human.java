package com.UkranianITSchool.HW2.OOP.Task2.Korotkov;

import java.util.Random;

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
    }
    public Human(boolean sex, String name, String surname, float height, float weight) {
        this.sex = sex;
        this.name = name;
        this.surname = surname;
        this.height = height;
        this.weight = weight;
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



    /*public Human haveARelationship (Human human1){
        if ((this.talk(human1)== true)&&(this.tolerateSociety(human1)==true)&&(this.spendTimeTogether(human1)==true)){
            if (this.isSex() == human1.isSex()){
                return null;
            } else {
                if (this.isSex()==false){
                    //Human.this.humanBirth;
                }
            }
        }
    };*/



    public abstract void beingHuman();
}
