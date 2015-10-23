package com.UkranianITSchool.HW2.OOP.Task0.Korotkov;

import java.util.Date;

/**
 * Created by Андрей on 22.10.2015.
 */
public class Human {
    private String name;
    private String surname;
    private Date birthday;
    private String address;

    public Human() {
    }
    public Human(String name, String surname, Date birthday, String address) {
        this.name = name;
        this.surname = surname;
        this.birthday = birthday;
        this.address = address;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getSurname() {
        return surname;
    }
    public void setSurname(String surname) {
        this.surname = surname;
    }
    public Date getBirthday() {
        return birthday;
    }
    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", birthday=" + birthday +
                ", address='" + address + '\'' +
                '}';
    }
}
