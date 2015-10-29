package com.UkranianITSchool.HW2.OOP.Task1.Korotkov;

/**
 * Created by Андрей on 29.10.2015.
 */
public class Pencil extends WritingInstrument{
    private String hardness;
    private String theBaseMaterial;

    public Pencil() {
    }
    public Pencil(String name, double prise, String color, String hardness, String theBaseMaterial) {
        super(name, prise, color);
        this.hardness = hardness;
        this.theBaseMaterial = theBaseMaterial;
    }

    public String getHardness() {
        return hardness;
    }
    public void setHardness(String hardness) {
        this.hardness = hardness;
    }
    public String getTheBaseMaterial() {
        return theBaseMaterial;
    }
    public void setTheBaseMaterial(String theBaseMaterial) {
        this.theBaseMaterial = theBaseMaterial;
    }

    @Override
    public String toString() {
        return "Pencil{" + super.toString() +
                "hardness='" + hardness + '\'' +
                ", theBaseMaterial='" + theBaseMaterial + '\'' +
                '}';
    }

    @Override
    public void write() {

    }
}
