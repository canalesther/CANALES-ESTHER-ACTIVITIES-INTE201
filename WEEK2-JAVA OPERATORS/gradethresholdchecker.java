/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package WEEK2;

import java.util.Scanner;

public class gradethresholdchecker {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("=======================");
        System.out.println("GRADE THRESHOLD CHECKER");
        System.out.println("=======================");
        
        System.out.println();

        double aveGrade = 85.0;
        int absences = 2;

        boolean passes = (aveGrade >= 75 && absences <= 3)
                      || (aveGrade >= 90);

        if (passes) {
            System.out.println("PASS");
            System.out.println("Average Grade: " + aveGrade);
            System.out.println("Absences: " + absences);
            System.out.println("Reason: The student meets the grade and absence requirements.");
        } else {
            System.out.println("FAIL");
            System.out.println("Average Grade: " + aveGrade);
            System.out.println("Absences: " + absences);
            System.out.println("Reason: The student does not meet the required conditions.");
        }    
    }
}
