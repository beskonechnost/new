package com.Girl;

/**
 * Created by uitsc_000 on 11.10.2015.
 */
public class Selection {
    public static void main(String[] args) {
        Girl Masha = new Girl("Masha", 22);
        Girl Dasha = new Girl("Dasha", 24);
        String R1 = "Mac";
        String R2 = "Else";
        System.out.println(Masha+"зовем в ресторан "+R1+", а она отвечает: "+Masha.reply(R1));
        System.out.println(Dasha+"зовем в ресторан "+R2+", а она отвечает: "+Masha.reply(R2));
    }
}
