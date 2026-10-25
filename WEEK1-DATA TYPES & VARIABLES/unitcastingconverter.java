/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package WEEK1;

/**
 *
 * @author Canales Family
 */
public class unitcastingconverter {
    
    public static void main(String[] args) {
        
        System.out.println("=======================");
        System.out.println("UNIT CASTING CONVERTER");
        System.out.println("=======================");
        
        System.out.println();
        
        double centimeters = 256.75;
        int wholeMeters = (int) centimeters / 100;
        double remainCent = centimeters - (wholeMeters * 100);
        
        System.out.println("Centimeters: " + centimeters);
        System.out.println("Whole Meters: " + wholeMeters);
        System.out.println("Remaining Centimeters: " + remainCent);
        
        // Implicit widening: int to double.
        // No cast is needed because Java automatically converts
        // an int to a double when assigning it.
        int wholeNumber = 25;
        double decimal = wholeNumber;
        
        System.out.println("Implicit Widening: " + decimal);

        double decimalValue = 15.89;
        
        // Explicit narrowing: double to int.
        // The decimal portion (.89) is lost because casting
        // truncates the fractional part instead of rounding.
        int narrowedValue = (int) decimalValue;
        
        System.out.println("Original Double: " + decimalValue);
        System.out.println("Narrowed Int: " + narrowedValue);
        
    }
}
