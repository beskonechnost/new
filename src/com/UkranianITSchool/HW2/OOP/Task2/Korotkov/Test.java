package com.UkranianITSchool.HW2.OOP.Task2.Korotkov;

/**
 * Created by Андрей on 11.11.2015.
 */
public class Test {
    public static void main(String[] args) {
        Human h1 = new Human() {
            @Override
            public void beingHuman() {

            }
        };
        Human h2 = new Human() {
            @Override
            public void beingHuman() {

            }
        };
        h1.talk(h2);
        h1.tolerateSociety(h2);
        h1.spendTimeTogether(h2);
        h1.haveARelationship(h2);
    }
}
