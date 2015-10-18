package com.Girl;

/**
 * Created by uitsc_000 on 11.10.2015.
 */
public class Girl {
    private String nameGirl;
    private int age;
    public String r;


    public Girl() {
    }

    public Girl(String nameGirl, int age) {
        this.nameGirl = nameGirl;
        this.age = age;
    }

    public String getNameGirl() {
        return nameGirl;
    }

    public void setNameGirl(String nameGirl) {
        this.nameGirl = nameGirl;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Girl{" +
                "nameGirl='" + nameGirl + '\'' +
                ", age=" + age +
                '}';
    }
    boolean reply(String r){
        if (r.equals("Mac")) return false;
        else return true;
    }

}
