/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package WEEK1;

/**
 *
 * @author Canales Family
 */
public class overflowandreferenceinvestigator {
    
    public static void main(String[] args) {
        
        System.out.println("=================================");
        System.out.println("OVERFLOW & REFERENCE INVESTIGATOR");
        System.out.println("=================================");
        
        System.out.println();
        
        byte number = 127;
        System.out.println("Byte Before Increment: " + number);
        
        number++;
        System.out.println("Byte After Increment: " + number);
        // A byte has a maximum value of 127.
        // Incrementing 127 wraps around to -128.
        
        // Compare String references and contents
        String txt1 = new String("Java");
        String txt2 = new String("Java");
        String txt3 = "Java";
        
        // Compare txt1 and txt2
        System.out.println("txt1 == txt2: " + (txt1 == txt2));
        // false because new String() creates two distinct objects.
        
        System.out.println("txt1.equals(txt2): " + txt1.equals(txt2));
        // true because both Strings contain the same text.
        
        // Compare txt1 and txt3
        System.out.println("txt1 == txt3: " + (txt1 == txt3));
        // false because txt1 is a new object, while txt3
        // refers to the String literal object.
        
        System.out.println("txt1.equals(txt3): " + txt1.equals(txt3));
        // true because both contain the text "Java".
        
        // Compare txt2 and txt3
        System.out.println("txt2 == txt3: " + (txt2 == txt3));
        // false because txt2 is a separate object from txt3.
        
        System.out.println("txt2.equals(txt3): " + txt2.equals(txt3));
        // true because both contain the same text.
        
        // Demonstrate a shared array reference
        int[] array1 = {10, 20, 30};
        int[] array2 = array1;

        System.out.println("Before Modification: " + array2[0]);

        array1[0] = 99;
              
        System.out.println("After Modification through array1: " + array2[0]);
        //Both variables refer to the same array, so changing
        // an element through array1 is visible through array2.
    }
}
