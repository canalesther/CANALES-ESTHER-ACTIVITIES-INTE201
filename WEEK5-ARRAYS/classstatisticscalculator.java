/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package WEEK5;

public class classstatisticscalculator {
    
    public static void main(String[] args) {
        
        System.out.println("===========================");
        System.out.println("CLASS STATISTICS CALCULATOR");
        System.out.println("===========================");
        
        System.out.println();
        
        int[] scores = {85, 92, 78, 90, 88, 76, 95, 84};
        
        int sum = 0;
        int highest = scores[0];
        int lowest = scores[0];

        for (int i = 0; i < scores.length; i++) {

            sum += scores[i];

            if (scores[i] > highest) {
                highest = scores[i];
            }

            if (scores[i] < lowest) {
                lowest = scores[i];
            }
        }

        double average = (double) sum / scores.length;

        System.out.println("Sum of Scores: " + sum);
        System.out.println("Average Score: " + average);
        System.out.println("Highest Score: " + highest);
        System.out.println("Lowest Score: " + lowest);
    }  
}
