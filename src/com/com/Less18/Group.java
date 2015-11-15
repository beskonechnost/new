package com.com.Less18;

import java.util.*;

import static com.com.Less18.Group.*;

/**
 * Created by uitsc_000 on 15.11.2015.
 */
public class Group {
    private String name;
    private Set<Pacing> pacingSet = new HashSet<>();

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Set<Pacing> getPacingSet() {
        return pacingSet;
    }
    public void setPacingSet(Set<Pacing> pacingSet) {
        this.pacingSet = pacingSet;
    }

    public void pacingAdd(Pacing pacing){
        pacingSet.add(pacing);
    }



    public static class Pacing {
        String namePacing;
        int number;

        public Pacing(String namePacing, int number) {
            this.namePacing = namePacing;
            this.number = number;
        }

        @Override
        public String toString() {
            return "Pacing{" +
                    "namePacing='" + namePacing + '\'' +
                    ", number=" + number +
                    '}';
        }
    }

    @Override
    public String toString() {
        return "Group{" +
                "name='" + name + '\'' +
                ", pacingSet=" + pacingSet +
                '}';
    }
}

class Test {
    public static void main(String[] args) {
        Group a = new Group();
        a.setName("B12");
        a.pacingAdd(new Group.Pacing("asd", 12));
        System.out.println(a);
    }
}