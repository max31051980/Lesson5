package it_academy.task2;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class ListStudents implements AverageAge{
    Student[] students = new Student[2];

    public void inputStudentInfo() throws ParseException{
        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < students.length; i++) {
            System.out.print("Enter student's name: ");
            String name = scan.nextLine();
            System.out.print("Enter student's surname: ");
            String surname = scan.nextLine();
            System.out.print("Enter student's Date of Birth: (dd.MM.YYYY) ");
            SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.YYYY");
            String stringDate = scan.nextLine();
            Date dateOfBirth = null;
            dateOfBirth = sdf.parse(stringDate);
            students[i] = new Student(name, surname, dateOfBirth);
        }
    }

    @Override
    public void setAverageAge() {
        Date nowDate = new Date();
        long sumAge = 0;
        long currentAge = 0;
        for (int i = 0; i < students.length; i++) sumAge += students[i].getDateOfBirth().getTime();
            long averageAge = sumAge / students.length;
            currentAge = nowDate.getTime() - averageAge;
            int temp = (int)(currentAge / 1000 / 60);
            int minutes = temp % 60;
            temp = temp / 60;
            int hours = temp % 24;
            temp = temp / 24;
            int days = temp % 30;
            temp = temp / 30;
            int months = temp % 12;
            int years = temp / 12;
            System.out.println("Average age of students: " + years + " Years " + months + " Months " + days + " Days " + hours + " Hours " + minutes + " Minutes ");
    }
}