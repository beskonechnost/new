package com.com.Less12;

/**
 * Created by uitsc_000 on 25.10.2015.
 */
enum City{Kharkov(2400000, "t1", 240), Kiev(4000000, "t2", 370), Lvov(1700000, "t3", 140);
    int populftion;
    String terr;
    int obj;

    City(int populftion, String terr, int obj){
        this.populftion = populftion;
        this.terr = terr;
        this.obj = obj;
    }

    @Override
    public String toString() {
        return "City{" +
                "populftion=" + populftion +
                ", terr='" + terr + '\'' +
                ", obj=" + obj +
                '}';
    }
}

public class Offes {
    String nameDerector;
    int sotrud;
    City sd;

    public Offes(String nameDerector, int sotrud, City sd) {
        this.nameDerector = nameDerector;
        this.sotrud = sotrud;
        this.sd = sd;
    }

    @Override
    public String toString() {
        return "Offes{" +
                "nameDerector='" + nameDerector + '\'' +
                ", sotrud=" + sotrud +
                ", sd=" + sd +
                '}';
    }
}
