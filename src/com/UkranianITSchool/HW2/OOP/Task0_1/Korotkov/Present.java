package com.UkranianITSchool.HW2.OOP.Task0_1.Korotkov;

import java.util.Arrays;

/**
 * Created by Андрей on 28.10.2015.
 */
public class Present extends Candy{
    private Candy[] candyPresent;
    private int countCandyInPresent = 0;
    private double pricePresentPackaging;

    public Present() {
    }
    public Present(String name, double weight, double price, double sugarCandy, Candy[] candyPresent, int countCandyInPresent, double pricePresentPackaging) {
        super(name, weight, price, sugarCandy);
        this.candyPresent = candyPresent;
        this.countCandyInPresent = countCandyInPresent;
        this.pricePresentPackaging = pricePresentPackaging;
    }

    public Candy[] getCandyPresent() {
        return candyPresent;
    }
    public void setCandyPresent(Candy[] candyPresent) {
        this.candyPresent = candyPresent;
    }
    public int getCountCandyInPresent() {
        return countCandyInPresent;
    }
    public void setCountCandyInPresent(int countCandyInPresent) {
        this.countCandyInPresent = countCandyInPresent;
    }
    public double getPricePresentPackaging() {
        return pricePresentPackaging;
    }
    public void setPricePresentPackaging(double pricePresentPackaging) {
        this.pricePresentPackaging = pricePresentPackaging;
    }

    public void setCandyPresent1(Candy candy, int n) {
        this.candyPresent[n] = candy;
    }

    @Override
    public String toString() {
        return "Present{" +
                "candyPresent=" + Arrays.toString(candyPresent) +
                ", countCandyInPresent=" + countCandyInPresent +
                ", pricePresentPackaging=" + pricePresentPackaging +
                '}';
    }

    public void addCandy(Candy candy){
        this.candyPresent[getCountCandyInPresent()]=candy;
        setCountCandyInPresent(getCountCandyInPresent()+1);
        this.setWeight(this.getWeight()+candy.getWeight());
        this.setPrice(this.getPrice()+candy.getPrice());
        this.setSugarCandy(this.getSugarCandy()+candy.getSugarCandy());
    }
    public void sortForPrise() {
        for (int i = getCountCandyInPresent() - 1; i >= 0; i--) {
            for (int j = 0; j < i; j++) {
                if (this.getCandyPresent()[j].getPrice() > this.getCandyPresent()[j + 1].getPrice()) {
                    Candy c1 = this.getCandyPresent()[j];
                    Candy c2 = this.getCandyPresent()[j + 1];
                    this.setCandyPresent1(c1, j + 1);
                    this.setCandyPresent1(c2, j);
                }
            }
        }
    }

    public void rangeSugar (double minSugarInCandy, double maxSugarInCandy){
        for (int i = 0; i < this.candyPresent.length; i++){
            if ((this.getCandyPresent()[i].getSugarCandy()>minSugarInCandy)&&(this.getCandyPresent()[i].getSugarCandy()<maxSugarInCandy)){
                System.out.println(this.candyPresent[i].toString());
            }
        }
    }
}
