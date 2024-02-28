package application;

import entities.StudantGrades;

import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        StudantGrades grades = new StudantGrades();

        System.out.print("Student's name: ");
        grades.Name = sc.nextLine();

        System.out.print("Grade 1: ");
        grades.Grade1 = sc.nextDouble();

        System.out.print("Grade 2: ");
        grades.Grade2 = sc.nextDouble();

        System.out.print("Grade 3: ");
        grades.Grade3 = sc.nextDouble();

        System.out.println();

        System.out.println(grades);
    }
}
