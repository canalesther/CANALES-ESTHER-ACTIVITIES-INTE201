/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package WEEK5;

public class favoritethingsarray {
    
    public static void main(String[] args) {
    
        System.out.println("=====================");
        System.out.println("FAVORITE THINGS ARRAY");
        System.out.println("=====================");
        
        System.out.println();
        
        String[] favorites = {
            "Music",
            "Arts",
            "Photography",
            "Graphic Design",
            "Travel"
        };

        for (int i = 0; i < favorites.length; i++) {
            System.out.println((i + 1) + ". " + favorites[i]);
        }

        System.out.println("Total Number of Favorite Things: "
                + favorites.length);
    }
}
