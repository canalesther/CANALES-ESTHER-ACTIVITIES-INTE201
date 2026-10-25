/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package WEEK2;

import java.util.Scanner;

public class precedencepuzzlesolver {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("========================");
        System.out.println("PRECEDENCE PUZZLE SOLVER");
        System.out.println("========================");
        
        System.out.println();

        int a = 5;
        int b = 10;

        // PREDICTED RESULT: true
        boolean result1 = a + 5 == b && b > a;
        System.out.println("Expression 1 Actual Result: " + result1);

        /* Arithmetic (+) is evaluated before the relational operators (==, >),
         * and the logical AND (&&) is evaluated after the relational operations.
         */

        int x = 4;
        int y = 7;

        // PREDICTED RESULT: 12
        int result2 = x++ + ++y;
        System.out.println("Expression 2 Actual Result: " + result2);

        /* x++ uses the old value of x (4), then increases x.
         * ++y increases y first, so y becomes 8.
         * Therefore: 4 + 8 = 12.
         */

        int p = 3;
        int q = 5;

        // PREDICTED RESULT: true
        boolean result3 = p * 2 < q + 2 || p == 3 && q > 4;
        System.out.println("Expression 3 Actual Result: " + result3);

        /* Arithmetic operations are evaluated first.
         * Relational operations (< and ==) come next.
         * && has higher precedence than ||.
         * Therefore: (6 < 7) || ((3 == 3) && (5 > 4))
         * true || (true && true)
         * true
         */
    }
}
    
