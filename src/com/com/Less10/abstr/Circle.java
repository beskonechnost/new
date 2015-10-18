package com.com.Less10.abstr;

/**
 * Created by uitsc_000 on 18.10.2015.
 */
public class Circle extends Shape{
    protected int x, y, r;

    public Circle(String color, int x, int y, int r) {
        super(color);
        this.x = x;
        this.y = y;
        this.r = r;
    }

    @Override
    public void draw() {
        System.out.println("Drawing circle (x="+x+", y="+y+", radius="+r+", color="+super.color+")");
    }
}
