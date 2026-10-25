/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package WEEK2;

import java.util.Scanner;

public class compoundgrowthandincrementtracker {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("===================================");
        System.out.println("COMPOUND GROWTH & INCREMENT TRACKER");
        System.out.println("===================================");
        
        System.out.println();

        double balance = 1000.00;

        System.out.println("Starting Balance: " + balance);

        balance += 200;
        System.out.println("After Adding 200 (+=): " + balance);

        balance += 300;
        System.out.println("After adding 300 (+=): " + balance);

        // Increment tracker
        int count = 5;

        System.out.println("\nIncrement Tracker:");

        System.out.println("count++ result: " + count++);
        System.out.println("count after count++: " + count);

        System.out.println("++count result: " + ++count);
        System.out.println("count after ++count: " + count);

        /* count++ is a post-increment:
         * The current value is printed first, then count increases by 1.
         *
         * ++count is pre-increment:
         * count increases by 1 first, then the new value is printed.
         */
    }
}
