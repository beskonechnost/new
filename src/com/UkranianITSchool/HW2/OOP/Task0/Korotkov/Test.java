package com.UkranianITSchool.HW2.OOP.Task0.Korotkov;

import java.util.Date;

/**
 * Created by Андрей on 16.10.2015.
 */
public class Test {
    public static void main(String[] args) {
        Student a[] = new Student[5];
        a[0] = new Student("A1", "AA1", new Date(1992, 12, 5), "street SA1 house1", 1, "12334567", "Economic", 3, "EA3");
        a[1] = new Student("A2", "AA2", new Date(1990, 11, 15), "street SA2 house2", 2, "12334567", "Economic", 4, "EA4");
        a[2] = new Student("A3", "AA3", new Date(1990, 2, 6), "street SA3 house3", 3, "12334567", "Physical", 2, "PA2");
        a[3] = new Student("A4", "AA4", new Date(1993, 9, 11), "street SA4 house4", 4, "12334567", "Physical", 2, "PA2");
        a[4] = new Student("A5", "AA5", new Date(1992, 4, 21), "street SA5 house5", 5, "12334567", "Economic", 3, "EA3");

        // d) список учебной группы.
        Student[] ea3 = new Student[5];
        Groups groups1 = new Groups("EA3", ea3);
        groups1.createAListOfGroups(a);
        //System.out.println(groups1.toString());

        Student[] ea4 = new Student[5];
        Groups groups2 = new Groups("EA4", ea4);
        groups2.createAListOfGroups(a);
        //System.out.println(groups2.toString());

        Student[] pa2 = new Student[5];
        Groups groups3 = new Groups("PA2", pa2);
        groups3.createAListOfGroups(a);
        //System.out.println(groups3.toString());

        // b) списки студентов для каждого факультета и курса;
        Groups[] economFac = new Groups[3];
        Faculties economic = new Faculties("Economic", economFac);
        economic.ListGroupsOfFaculty(groups1);
        economic.ListGroupsOfFaculty(groups2);
        //System.out.println(economic.toString());

        Groups[] physicFac = new Groups[3];
        Faculties physical = new Faculties("Physical", physicFac);
        physical.ListGroupsOfFaculty(groups3);
        //System.out.println(physical.toString());


        Student[] stud4course = new Student[3];
        Course fourth = new Course(4, stud4course);
        fourth.listStudentsCourse(a);
        System.out.println(fourth.toString());
    }
}
