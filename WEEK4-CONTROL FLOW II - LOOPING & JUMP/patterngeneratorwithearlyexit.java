/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package WEEK4;

import java.util.Scanner;

public class patterngeneratorwithearlyexit {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("=======================");
        System.out.println("GRADE THRESHOLD CHECKER");
        System.out.println("=======================");
        
        System.out.println();
        
        int size = 5;
        
        for (int row = 1; row <= size; row++) {
            
            // CONTINUE
            // Skip row 3 completely.
            if (row == 3) {
                System.out.println("Row 3 Skipped.");
                
            // CONTINUE: skips the rest of the current iteration
                // and moves to the next row.
                continue;
            }

            for (int column = 1; column <= size; column++) {

                // -------------------------------------------------
                // BREAK
                // -------------------------------------------------
                // Stop the INNER loop when column reaches 4.
                if (column == 4) {

                    // BREAK: immediately stops the INNER loop.
                    break;
                }

                System.out.print("* ");
            }

            System.out.println();
        }

        System.out.println();
    } 
}
