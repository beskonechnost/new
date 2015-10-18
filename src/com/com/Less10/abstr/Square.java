package com.com.Less10.abstr;

/**
 * Created by uitsc_000 on 18.10.2015.
 */
public class Square extends Shape{
    protected int x, y, x1, y1;

    public Square(String color, int x, int y, int x1, int y1) {
        super(color);
        this.x = x;
        this.y = y;
        this.x1 = x1;
        this.y1 = y1;
    }

    @Override
    public void draw() {
        System.out.println("Drawing circle (x="+x+", y="+y+", x1="+x1+", y1="+y1+", color="+super.color+")");
    }
}
