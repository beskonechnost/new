package com.UkranianITSchool.HW2.OOP.Task0_1.Korotkov;

/**
 * Created by Андрей on 29.10.2015.
 */
public abstract class Sweetness {
    private String name;
    private double weight;
    private double price;
    private double sugarSweetness;

    public Sweetness(String name, double weight, double price, double sugarSweetness) {
        this.name = name;
        this.weight = weight;
        this.price = price;
        this.sugarSweetness = sugarSweetness;
    }
    public Sweetness() {
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
    public double getSugarSweetness() {
        return sugarSweetness;
    }
    public void setSugarSweetness(double sugarSweetness) {
        this.sugarSweetness = sugarSweetness;
    }

    @Override
    public String toString() {
        return "Sweetness{" +
                "name='" + name + '\'' +
                ", weight=" + weight +
                ", price=" + price +
                ", sugarSweetness=" + sugarSweetness +
                '}';
    }

    public abstract void sweet();
}
