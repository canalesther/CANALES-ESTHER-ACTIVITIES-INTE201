/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package WEEK3;

/**
 *
 * @author Canales Family
 */
public class nestedloginvalidator {
    
    public static void main(String[] args) {
        
        System.out.println("======================");
        System.out.println("NESTED LOGIN VALIDATOR");
        System.out.println("======================");
        
        System.out.println();
        
        String correctUname = "admin";
        String correctPass = "1234";
        boolean accLocked = false;
        
        // Test 1: Correct username, wrong password
        String username = "admin";
        String pass = "wrong";
        
        System.out.println("\nTest 1: Wrong Password");
        
        if (username.equals(correctUname)) {
            
            if (pass.equals(correctPass)) {
                
                if (!accLocked) {
                    System.out.println("LOGIN SUCCESSFUL");
                } else {
                    System.out.println("LOGIN FAILED: Account is Locked.");
                }
            } else {
                System.out.println("LOGIN FAILED: Incorrect Password.");
            }
            
        } else {
            System.out.println("LOGIN FAILED: Incorrect Username.");
        }
        
        // Test 2: Wrong username
        username = "student";
        pass = "1234";
        
        System.out.println("\nTest 2: Wrong Username");
        
        if (username.equals(correctUname)) {
            
            if (pass.equals(correctPass)) {
                
                if(!accLocked) {
                    System.out.println("LOGIN SUCCESSFUL");
                } else {
                    System.out.println("LOGIN FAILED: Account is Locked");
                }
                
            } else {
                System.out.println("LOGIN FAILED: Incorrect Password");
            }
            
        } else {
            System.out.println("LOGIN FAILED: Incorrect Username");
        }
        
        // Test 3: Correct username and password, but account is locked
        username = "admin";
        pass = "1234";
        accLocked = true;
        
        System.out.println("\nTest 3: Locked Account");
        
        if (username.equals(correctUname)) {
            
            if (pass.equals(correctPass)) {
                
                if (!accLocked) {
                    System.out.println("LOGIN SUCCESSFUL");
                } else {
                    System.out.println("LOGIN FAILED: Account is Locked.");
                }
                
            } else {
                System.out.println("LOGIN FAILED: Incorrect Password.");
            }
            
        } else {
            System.out.println("LOGIN FAILED: Incorrect Username.");
        }
    }
    
}
