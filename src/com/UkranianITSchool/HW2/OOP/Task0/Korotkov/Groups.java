package com.UkranianITSchool.HW2.OOP.Task0.Korotkov;

import java.util.Arrays;

/**
 * Created by Андрей on 22.10.2015.
 */
public class Groups {
    private String nameGroup;
    private Student[] pupil;
    private String groupFaculty;

    public Groups() {
    }
    public Groups(String nameGroup, Student[] pupil) {
        this.nameGroup = nameGroup;
        this.pupil = pupil;
    }

    public String getNameGroup() {
        return nameGroup;
    }
    public void setNameGroup(String nameGroup) {
        this.nameGroup = nameGroup;
    }
    public Student[] getPupil() {
        return pupil;
    }
    public void setPupil(Student[] pupil) {
        this.pupil = pupil;
    }
    public String getGroupFaculty() {
        return groupFaculty;
    }
    public void setGroupFaculty(String groupFaculty) {
        this.groupFaculty = groupFaculty;
    }

    @Override
    public String toString() {
        return "Groups{" +
                "nameGroup='" + nameGroup + '\'' +
                ", pupil=" + Arrays.toString(pupil) +
                ", groupFaculty='" + groupFaculty + '\'' +
                '}';
    }

    public void createAListOfGroups(Student[] student){
        int k = 0;
        for (int i = 0; i<student.length; i++){
            if (student[i].getGroup().equals(nameGroup)) {
                pupil[k]=student[i];
                groupFaculty = student[i].getFaculty();
                k++;
            }
        }
    }
}
