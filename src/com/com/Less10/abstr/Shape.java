package com.com.Less10.abstr;

/**
 * Created by uitsc_000 on 18.10.2015.
 */
public abstract class Shape {
    protected String color = "red";
    public abstract void draw();
    public Shape(String color){
        this.color = color;
    }
}
