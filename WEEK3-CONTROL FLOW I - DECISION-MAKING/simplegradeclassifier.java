/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package WEEK3;

/**
 *
 * @author Canales Family
 */
public class simplegradeclassifier {
    
    public static void main(String[] args) {
        
        System.out.println("=======================");
        System.out.println("SIMPLE GRADE CLASSIFIER");
        System.out.println("=======================");
        
        System.out.println();
        
        int score = 75;
        
        if (score >= 60) {
            System.out.println("Score: " + score);
            System.out.println("PASSED");
        } else {
            System.out.println("Score: " + score);
            System.out.println("FAILED");
        }
        
        // Test 2: Change score to 50
        score = 50;
        
        if (score >= 60) {
            System.out.println("Score: " + score);
            System.out.println("PASSED");
        } else {
            System.out.println("Score: " + score);
            System.out.println("FAILED");
        }
    }
}
