package com.UkranianITSchool.HW2.OOP.Task0_1.Korotkov;

import java.util.Arrays;

/**
 * Created by Андрей on 28.10.2015.
 */
public class Present{
    private String name;
    private double weight;
    private double price;
    private double sugarCandy;
    private Candy[] candyPresent;
    private int countCandyInPresent = 0;
    private double pricePresentPackaging;

    public Present() {
    }
    public Present(String name, double weight, double price, double sugarCandy, Candy[] candyPresent, int countCandyInPresent, double pricePresentPackaging) {
        this.name = name;
        this.weight = weight;
        this.price = price;
        this.sugarCandy = sugarCandy;
        this.candyPresent = candyPresent;
        this.countCandyInPresent = countCandyInPresent;
        this.pricePresentPackaging = pricePresentPackaging;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public double getWeight() {
        return weight;
    }
    public void setWeight(double weight) {
        this.weight = weight;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public double getSugarCandy() {
        return sugarCandy;
    }
    public void setSugarCandy(double sugarCandy) {
        this.sugarCandy = sugarCandy;
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
    }//метод позволяющий менять элемент массива на нужную нам сладость. Используеться при сортировке.

    @Override
    public String toString() {
        return "Present{" +
                "name='" + name + '\'' +
                ", weight=" + weight +
                ", price=" + price +
                ", sugarCandy=" + sugarCandy +
                ", candyPresent=" + Arrays.toString(candyPresent) +
                ", countCandyInPresent=" + countCandyInPresent +
                ", pricePresentPackaging=" + pricePresentPackaging +
                '}';
    }

    public void addCandy(Candy candy){
        this.candyPresent[getCountCandyInPresent()]=candy;
        setCountCandyInPresent(getCountCandyInPresent()+1);
        this.setWeight(this.getWeight()+candy.getWeight());
        this.setPrice(this.getPrice()+candy.getPrice());
        this.setSugarCandy(this.getSugarCandy()+candy.getSugarSweetness());
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
        for (int i = 0; i < this.countCandyInPresent; i++){
            if ((this.getCandyPresent()[i].getSugarSweetness()>minSugarInCandy)&&(this.getCandyPresent()[i].getSugarSweetness()<maxSugarInCandy)){
                System.out.println(this.candyPresent[i].toString());
            }
        }
    }
}
