package com.com.Less12;

/**
 * Created by uitsc_000 on 25.10.2015.
 */
public class Test {
    public static void main(String[] args) {
        Bank bank = new Bank("VIP");
        Bank.account sd = bank.new account("SSS", 100.07);
        double r = 50.01;
        sd.add(r);
        sd.see();
        double b = 10.2;
        sd.remove(b);
        sd.see();
    }
}
