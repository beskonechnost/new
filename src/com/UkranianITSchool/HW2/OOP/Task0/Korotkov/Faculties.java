package com.UkranianITSchool.HW2.OOP.Task0.Korotkov;

import java.util.Arrays;

import static com.UkranianITSchool.HW2.OOP.Task0.Korotkov.Student.*;

/**
 * Created by Андрей on 22.10.2015.
 */
public class Faculties {
    private String nameFaculty;
    private Groups[] groupFaculty;


    public Faculties() {
    }
    public Faculties(String nameFaculty, Groups[] groupFaculty) {
        this.nameFaculty = nameFaculty;
        this.groupFaculty = groupFaculty;
    }

    public String getNameFaculty() {
        return nameFaculty;
    }
    public void setNameFaculty(String nameFaculty) {
        this.nameFaculty = nameFaculty;
    }
    public Groups[] getGroupFaculty() {
        return groupFaculty;
    }
    public void setGroupFaculty(Groups[] groupFaculty) {
        this.groupFaculty = groupFaculty;
    }

    @Override
    public String toString() {
        return "Faculties{" +
                "nameFaculty='" + nameFaculty + '\'' +
                ", groupFaculty=" + Arrays.toString(groupFaculty) +
                '}';
    }

    int count = 0;
    public void ListGroupsOfFaculty (Groups groups) {
        if (groups.getGroupFaculty().equals(nameFaculty)) {
            groupFaculty[count]=groups;
            count++;
        }
    }

    public void StudentsOfTheFaculty (String TheNameOfTheFaculty) {
        if (TheNameOfTheFaculty.equals(nameFaculty)) System.out.println(toString());
    }
}
