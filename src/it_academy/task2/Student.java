package it_academy.task2;

import java.util.Date;

public class Student {
    private String name;
    private String surname;
    private Date dateOfBirth;

    public Student(String name, String surname, Date dateOfBirth) {
        this.name = name;
        this.surname = surname;
        this.dateOfBirth = dateOfBirth;
    }

    public Date getDateOfBirth(){
        return dateOfBirth;
    }
}