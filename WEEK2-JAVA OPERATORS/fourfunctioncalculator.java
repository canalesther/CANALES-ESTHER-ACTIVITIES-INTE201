/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package WEEK2;

import java.util.Scanner;

public class fourfunctioncalculator {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("========================");
        System.out.println("FOUR-FUNCTION CALCULATOR");
        System.out.println("========================");
        
        System.out.println();
        
        System.out.println("Enter First Integer: ");
        int num1 = input.nextInt();
        
        System.out.println("Enter Second Integer: ");
        int num2 = input.nextInt();
        
        System.out.println("\nResults:");
        System.out.println("Addition: " + (num1 + num2));
        System.out.println("Subtraction: " + (num1 - num2));
        System.out.println("Multiplication: " + (num1 * num2)); 
        System.out.println("Division: " + (num1 / num2));
        System.out.println("Modulo: " + (num1 % num2));
        
        /* With negative operands, division and modulo behave differently
         * from mathematical floor division. Java integer division truncates
         * toward zero, and the remainder (%) keeps the sign of the dividend.
        */
        
    }
}

