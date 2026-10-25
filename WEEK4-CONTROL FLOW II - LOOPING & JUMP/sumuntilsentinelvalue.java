/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package WEEK4;

import java.util.Scanner;

public class sumuntilsentinelvalue {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("========================");
        System.out.println("SUM UNTIL SENTINEL VALUE");
        System.out.println("========================");
            
        int total = 0;
        int number;
            
        System.out.println("Enter Integers to Add.");
        System.out.println("Enter -1 to Stop.");
            
        while (true) {  
            System.out.println("Enter Number: ");
            number = input.nextInt();
                
            // Stop immediately when -1 is entered.
            // -1 is NOT added to the total.
            if (number == -1) {
                break;
            }
            total += number;
            }
            
        System.out.println("Final Total: " + total);
        System.out.println();
    }
    
}    
