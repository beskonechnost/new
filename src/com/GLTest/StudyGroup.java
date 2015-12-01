package com.GLTest;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by Андрей on 30.11.2015.
 */
public class StudyGroup extends Collective{
    private String nameGroup;
    private LinkedList<Students> studentsesOfGroup = new LinkedList<>();

    public StudyGroup(String appointment, int numberOfParticipants, LinkedList<Students> studentsList, String nameGroup) {
        super( appointment, numberOfParticipants);
        this.nameGroup = nameGroup;
        this.studentsesOfGroup = studentsList;
    }



    public class Students extends Human{
        public int numberCourse;

        public Students(int numberCourse, String name, String lastName, int age, boolean sex) {
            super(name, lastName, age, sex);
            this.numberCourse = numberCourse;
        }


        /*public int getNumberCourse() {
            return numberCourse;
        }
        public void setNumberCourse(int numberCourse) {
            this.numberCourse = numberCourse;
        }*/

        @Override
        public String toString() {
            return "Students{" +
                    "numberCourse=" + numberCourse +
                    "} " + super.toString();
        }
    }

    public String getNameGroup() {
        return nameGroup;
    }
    public void setNameGroup(String nameGroup) {
        this.nameGroup = nameGroup;
    }


    public void addStudInListOfParticipants(Students students) {
        studentsesOfGroup.add(students);
    }

    public void removeStudOfListOfParticipants(Students students) {
        studentsesOfGroup.remove(students);
    }

    @Override
    public String toString() {
        return "StudyGroup{" +
                "nameGroup='" + nameGroup + '\'' +
                "} " + super.toString();
    }
}
