package com.com.Less9;

/**
 * Created by uitsc_000 on 17.10.2015.
 */
public class Student implements Cloneable{
    private int id = 71;

    public int getId() {
        return id;
    }

    public void setId(int value) {
        this.id = value;
    }
    public Object clone() {
        try {
            return super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError("Невозможно клонировать");
        }
    }
}
