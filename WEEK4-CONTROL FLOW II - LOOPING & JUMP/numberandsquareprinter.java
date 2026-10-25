/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package WEEK4;

import java.util.Scanner;

public class numberandsquareprinter {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("=======================");
        System.out.println("NUMBER & SQUARE PRINTER");
        System.out.println("=======================");
        
        System.out.println();
        
        // loop bound is 20, so it prints from 1 to 20.
        // Change 20 back to 10 if you want the original requirement.
        for (int i = 1; i <= 20; i++) {
            System.out.println("Number: " + i + " | Square: " + (i * i));
        }
        
        System.out.println("Loop Successfully Updated to 20.\n");
    }
}
