/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package WEEK5;

import java.util.Arrays;

public class searchandsortminitool {
    
    public static void main(String[] args) {
        
        System.out.println("=======================");
        System.out.println("SEARCH & SORT MINI-TOOL");
        System.out.println("=======================");
        
        System.out.println();
        
        int[] scores = {85, 70, 95, 90, 80, 75};

        int target = 90;
        int foundIndex = -1;

        // Linear search
        for (int i = 0; i < scores.length; i++) {

            if (scores[i] == target) {
                foundIndex = i;
                break;
            }
        }

        if (foundIndex != -1) {
            System.out.println("Target " + target
                    + " found at index " + foundIndex);
        } else {
            System.out.println("Target " + target + " was not found.");
        }

        // Create a copy so the original scores remain unchanged.
        int[] sortedScores = scores.clone();

        // Sort the copied array.
        Arrays.sort(sortedScores);

        System.out.println("Original Array: "
                + Arrays.toString(scores));

        System.out.println("Sorted Copy: "
                + Arrays.toString(sortedScores));

        /*
         * Sorting a copy preserves the original order of scores.
         * This matters when the original order represents student
         * records or when we still need the unsorted data later.
         */
    }
}