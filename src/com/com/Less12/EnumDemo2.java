package com.com.Less12;

/**
 * Created by uitsc_000 on 25.10.2015.
 */
enum Applel {
    Jonathan(10), GoldenDel(12), RedDel(8), Winesap(13), Cortland(7);

    private int prise;

    Applel(int prise){
        this.prise = prise;
    }

    int getPrise(){
        return prise;
    }
}
public class EnumDemo2 {
    public static void main(String[] args) {
        Applel apple = Applel.Cortland;
        Applel apple1 = Applel.GoldenDel;
        Applel apple2 = Applel.RedDel;
        System.out.println("Winesap costs " + Applel.Winesap.getPrise() + " cent");

        if (apple.compareTo(apple1)<0){
            System.out.println(apple + "comes before "+apple1);}
        else {
            if (apple.compareTo(apple1) > 0) System.out.println(apple1+" comes before "+apple);
            else System.out.println(apple+ " equals "+apple1);
        }
    }
}
