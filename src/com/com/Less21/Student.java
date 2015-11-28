package com.com.Less21;

import java.io.*;

/**
 * Created by uitsc_000 on 28.11.2015.
 */
public class Student implements Serializable{
    protected  static String faculty;
    private String name;
    private int id;
    private transient String password;

    public Student(String name, int id, String password) {
        this.name = name;
        this.id = id;
        this.password = password;
    }
    private static  final long serialVersionUID = 1l;//посмотреть почему тут private static

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", password='" + password + '\'' +
                ", faculty= "+faculty+
                '}';
    }
}

class Main{
    public static void main(String[] args) throws Exception{
        Student.faculty = "SSW";
        Student s1 = new Student("Fodor",1,"1234567");
        System.out.println(s1.toString());
        File fw = new File("D:\\TESTFILE.txt");
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(fw));//сереализация класса студент. передаем в файл.
        oos.writeObject(s1);
        oos.close();
        Student.faculty = "MMA";


        ObjectInputStream istream = new ObjectInputStream(new FileInputStream(fw)); //десеарелизация. только мы получим студента с тем же именем
        Student s2 = (Student)istream.readObject();                                 //и айдишником, только другого факультета и без поля пароль, т.к.
        istream.close();                                                            //являеться transient
        System.out.println(s2);
    }
}
