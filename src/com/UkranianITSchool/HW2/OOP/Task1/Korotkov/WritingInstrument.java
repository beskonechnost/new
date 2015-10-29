package com.UkranianITSchool.HW2.OOP.Task1.Korotkov;

/**
 * Created by Андрей on 29.10.2015.
 */
public abstract class WritingInstrument {
    private String name;
    private double prise;
    private String color;

    public WritingInstrument() {
    }
    public WritingInstrument(String name, double prise, String color) {
        this.name = name;
        this.prise = prise;
        this.color = color;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public double getPrise() {
        return prise;
    }
    public void setPrise(double prise) {
        this.prise = prise;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "WritingInstrument{" +
                "name='" + name + '\'' +
                ", prise=" + prise +
                ", color='" + color + '\'' +
                '}';
    }

    public abstract void write();

    public static double averagePrice(WritingInstrument[] writingInstruments){
        double a = 0;
        for (int i = 0; i < writingInstruments.length; i++){
            a += writingInstruments[i].getPrise();
        }
        return a/writingInstruments.length;
    }
}
