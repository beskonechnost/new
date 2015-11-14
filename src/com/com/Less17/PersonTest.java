package com.com.Less17;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;

/**
 * Created by uitsc_000 on 14.11.2015.
 */
class PersonTest implements Comparable{
    private String name;
    private String lasrname;
    private int age;

    public PersonTest(String name, String lasrname, int age) {
        this.name = name;
        this.lasrname = lasrname;
        this.age = age;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getLasrname() {
        return lasrname;
    }
    public void setLasrname(String lasrname) {
        this.lasrname = lasrname;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "PersonTest{" +
                "name='" + name + '\'' +
                ", lasrname='" + lasrname + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public int compareTo(Object o) {
        PersonTest o1 = (PersonTest) o;
        return this.getAge() - o1.getAge();
    }
}
class TestP{
    public static void main(String[] args) {
        List<PersonTest> al = new ArrayList<>();
        TreeSet<PersonTest> ts = new TreeSet<PersonTest>();
        al.add(new PersonTest("A","A",23));
        al.add(new PersonTest("B","B",13));
        al.add(new PersonTest("C","C",33));
        al.add(new PersonTest("D","D",17));
        ts.add(al.get(0));
        ts.add(al.get(1));
        ts.add(al.get(2));
        ts.add(al.get(3));


        Iterator<PersonTest> itAl = al.iterator();
        while (itAl.hasNext()){
            System.out.println(itAl.next()+" ");
        }
        System.out.println();
        Iterator<PersonTest> itTs = ts.iterator();
        while (itTs.hasNext()){
            System.out.println(itTs.next()+" ");
        }

    }
}
