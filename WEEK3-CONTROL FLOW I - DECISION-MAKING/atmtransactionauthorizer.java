/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package WEEK3;

/**
 *
 * @author Canales Family
 */
public class atmtransactionauthorizer {
    
    public static void main(String[] args) {
        
        System.out.println("==========================");
        System.out.println("ATM TRANSACTION AUTHORIZER");
        System.out.println("==========================");
        
        System.out.println();
        
        String atmUname = "user123";
        int correctPin = 1234;
        
        String enterUname = "user123";
        int enterPin = 1234;
        
        double balance = 7500.00;
        double withdrawAmount = 10000.00;
        
        String tier;
        double dailyLimit;
        
        /* Check username and pin first
        */
        
        if (enterUname.equals(atmUname)) {
            
            if (enterPin == correctPin) {
                
                System.out.println("USERNAME and PIN are Correct.");
                
                /* Determine account tier
                */
                
                if (balance < 10000) {
                    tier = "Bronze";
                    dailyLimit = 5000;
                } else if (balance < 30000) {
                    tier = "Silver";
                    dailyLimit = 10000;
                } else if (balance < 50000) {
                    tier = "Gold";
                    dailyLimit = 20000;
                } else {
                    tier = "Platinum";
                    dailyLimit = 50000;
                }
                
                System.out.println("Account Tier: " + tier);
                System.out.println("Daily Withdrawal Limit: " + dailyLimit);
                
                /* Determine transaction fee using switch
                */
                
                double feePercent;
                
                switch (tier) {
                    case "Bronze":
                        feePercent = 0.02;
                        break;
                        
                    case "Silver":
                        feePercent = 0.015;
                        break;
                    
                    case "Gold":
                        feePercent = 0.01;
                        break;
                    
                    case "Platinum":
                        feePercent = 0.005;
                        break;
                        
                    default:
                        feePercent = 0.03;
                }
                
                double transFee = withdrawAmount * feePercent;
                double totalDeduct = withdrawAmount + transFee;
                
                /* Withdrawal Authorization
                */
                
                if (balance >= withdrawAmount) {
                    
                    if (withdrawAmount <= dailyLimit) {
                        
                        System.out.println("WITHDRAWAL APPROVED");
                        System.out.println("Withdrawal Amount: " + withdrawAmount);
                        System.out.println("Transaction Fee: " + transFee);
                        System.out.println("Total Deduction: " + totalDeduct);
                        System.out.println("Remaining Balance: " + (balance - totalDeduct));
                        
                    } else {
                        System.out.println("WITHDRAWAL DENIED");
                        System.out.println("Reason: Withdrawal exceed the " + tier + " Daily Limit of " + dailyLimit);
                    }
                    
                } else {
                    System.out.println("WITHDRAWAL DENIED");
                    System.out.println("Reason: Insufficient Balance.");
                }
                
            } else {
                System.out.println("ATM ACCESS DENIED");
                System.out.println("Reason: Incorrect 4-digit PIN.");
            }
            
        } else {
            System.out.println("ATM ACCESS DENIED");
            System.out.println("Reason: Incorrect Username");
        }  
    } 
}

