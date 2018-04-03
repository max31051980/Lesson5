package it_academy.task2;

import java.text.ParseException;

public class Main {
    public static void main(String[] args) throws ParseException {
      ListStudents ls = new ListStudents();
      ls.inputStudentInfo();
      ls.setAverageAge();
    }
}