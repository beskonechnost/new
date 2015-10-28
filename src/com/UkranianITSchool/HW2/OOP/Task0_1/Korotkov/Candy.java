package com.UkranianITSchool.HW2.OOP.Task0_1.Korotkov;

/**
 * Created by Андрей on 28.10.2015.
 */
public class Candy {
    private String name;
    private double weight;
    private double price;
    private String view;
    private double sugarCandy;

    public Candy() {
    }
    public Candy(String name, double weight, double price, String view, double sugarCandy) {
        this.name = name;
        this.weight = weight;
        this.price = price;
        this.view = view;
        this.sugarCandy = sugarCandy;
    }
    public Candy(String name, double weight, double price, double sugarCandy) {
        this.name = name;
        this.weight = weight;
        this.price = price;
        this.sugarCandy = sugarCandy;
    } //делаю этот конструктор для того
    //чтобы можно было наследовать поля "коныеты" для "подарка", но без затрагивания поля "вид", который нужен только для конфеты.
    //"вид" - значит шоколадная конфета, карамелька, ириска и т.п.

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
    public String getView() {
        return view;
    }
    public void setView(String view) {
        this.view = view;
    }
    public double getSugarCandy() {
        return sugarCandy;
    }
    public void setSugarCandy(double sugarCandy) {
        this.sugarCandy = sugarCandy;
    }

    @Override
    public String toString() {
        return "Candy{" +
                "name='" + name + '\'' +
                ", weight=" + weight +
                ", price=" + price +
                ", view='" + view + '\'' +
                ", sugarCandy=" + sugarCandy +
                '}';
    }
}
