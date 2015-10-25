package com.com.Less12;

/**
 * Created by uitsc_000 on 25.10.2015.
 */
public class Bank {
    private String nameBank;

    class account{
        private String numberAcc;
        private double balans;

        public account(String numberAcc, double balans) {
            this.numberAcc = numberAcc;
            this.balans = balans;
        }
        public account() {
        }

        public String getNumberAcc() {
            return numberAcc;
        }
        public void setNumberAcc(String numberAcc) {
            this.numberAcc = numberAcc;
        }
        public double getBalans() {
            return balans;
        }
        public void setBalans(double balans) {
            this.balans = balans;
        }

        @Override
        public String toString() {
            return "account{" +
                    "numberAcc='" + numberAcc + '\'' +
                    ", balans=" + balans +
                    '}';
        }

        public void add(double sum){
            sum = getBalans() + sum;
            setBalans(sum);
        }
        public  void remove(double rem){
            if (getBalans()>rem){
            rem -=getBalans();
            setBalans(rem);}else{
                System.out.println("Недостаточно средств на счету");
            }
        }
        public void see(){
            System.out.println(toString());
        }
    }

    public Bank(String nameBank) {
        this.nameBank = nameBank;
    }

    public String getNameBank() {
        return nameBank;
    }
    public void setNameBank(String nameBank) {
        this.nameBank = nameBank;
    }

    @Override
    public String toString() {
        return "Bank{" +
                "nameBank='" + nameBank + '\'' +
                '}';
    }
}
