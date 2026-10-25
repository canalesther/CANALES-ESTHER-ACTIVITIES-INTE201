/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package WEEK3;

/**
 *
 * @author Canales Family
 */
public class multitierdiscountsystem {
    
    public static void main(String[] args) {
        
        System.out.println("==========================");
        System.out.println("MULTI-TIER DISCOUNT SYSTEM");
        System.out.println("==========================");
        
        System.out.println();
        
        double purchaseAmount = 6000.00;
        double discount;
        String discountTier;
        
        if (purchaseAmount < 1000) {
            discount = 0.00;
            discountTier = "0% Discount";
        } else if (purchaseAmount < 3000) {
            discount = 0.05;
            discountTier = "5% Discount";
        } else if (purchaseAmount < 5000) {
            discount = 0.10;
            discountTier = "10% Discount";
        } else {
            discount = 0.15;
            discountTier = "15% Discount";
        }
        
        double discountPrice = purchaseAmount - (purchaseAmount * discount);
        
        System.out.println("Purchase Amount: " + purchaseAmount);
        System.out.println("Discount Tier: " + discountTier);
        System.out.println("Final Discounted Price: " + discountPrice);
    }
    
}
