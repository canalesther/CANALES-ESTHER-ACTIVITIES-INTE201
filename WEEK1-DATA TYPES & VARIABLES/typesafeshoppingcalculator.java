/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package WEEK1;

/**
 *
 * @author Canales Family
 */
public class typesafeshoppingcalculator {
    
    public static void main(String[] args) {
        
        System.out.println("==============================");
        System.out.println("TYPE-SAFE SHOPPING CALCULATOR");
        System.out.println("==============================");
        
        System.out.println();
        
        int quantity = 5;
        double unitPrice = 14.50;
        String storeName = "Flora's Boutique Essentials";
        
        // totalCost should be double because the price
        // may contain decimal values (centavos).
        double totalCost = quantity * unitPrice;
        
        System.out.println("Store Name: " + storeName);
        System.out.println("Quantity: " + quantity);
        System.out.println("Unit Price: " + unitPrice);
        System.out.println("Total Cost: " + totalCost);
        
    }  
}
