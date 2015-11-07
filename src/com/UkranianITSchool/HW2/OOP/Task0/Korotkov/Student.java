package com.UkranianITSchool.HW2.OOP.Task0.Korotkov;

import javax.xml.crypto.Data;
import java.util.Date;

/**
 * Created by Андрей on 16.10.2015.
 */
public class Student extends Human{
    private int id;
    private String telephone;
    private String faculty;
    private int course;
    private String group;

    public Student() {
    }
    public Student(String name, String surname, Date birthday, String address, int id, String telephone, String faculty, int course, String group) {
        super(name, surname, birthday, address);
        this.id = id;
        this.telephone = telephone;
        this.faculty = faculty;
        this.course = course;
        this.group = group;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getTelephone() {
        return telephone;
    }
    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }
    public String getFaculty() {
        return faculty;
    }
    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }
    public int getCourse() {
        return course;
    }
    public void setCourse(int course) {
        this.course = course;
    }
    public String getGroup() {
        return group;
    }
    public void setGroup(String group) {
        this.group = group;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", telephone='" + telephone + '\'' +
                ", faculty='" + faculty + '\'' +
                ", course='" + course + '\'' +
                ", group='" + group + '\'' +
                '}';
    }

    public void studentsBornAfter(Date date){
            if (this.getBirthday().after(date)){
                System.out.println(this.toString());
            }
    }
}
