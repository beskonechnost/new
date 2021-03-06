package com.com.Less10;

/**
 * Created by uitsc_000 on 18.10.2015.
 */
public class BlackBox {
    int a, b;

    public BlackBox(int a, int b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        BlackBox blackBox = (BlackBox) o;

        if (a != blackBox.a) return false;
        return b == blackBox.b;

    }

    @Override
    public int hashCode() {
        int result = a;
        result = 31 * result + b;
        return result;
    }
}
