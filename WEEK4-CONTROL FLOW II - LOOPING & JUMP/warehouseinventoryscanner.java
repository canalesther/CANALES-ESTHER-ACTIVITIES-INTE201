/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package WEEK4;

import java.util.Scanner;

public class warehouseinventoryscanner {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int[][] warehouse = {
            {20, 15, 30, 25},
            {10, -1, 18, 12},
            {5, 8, 3, 20},
            {25, 30, 22, 18}
        };

        int choice;

        do {
            System.out.println("\n----- WAREHOUSE MENU -----");
            System.out.println("1. Display Inventory");
            System.out.println("2. Calculate Total Inventory");
            System.out.println("3. Find Critically Low Shelf");
            System.out.println("4. Restock Shelf");
            System.out.println("5. Exit");
            System.out.print("Enter choice: ");

            choice = input.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("\nWarehouse Inventory:");

                    for (int row = 0; row < warehouse.length; row++) {
                        for (int column = 0;
                             column < warehouse[row].length;
                             column++) {
                            System.out.print(warehouse[row][column] + "\t");
                        }
                        System.out.println();
                    }
                    break;

                case 2:
                    int totalInventory = 0;

                    for (int row = 0; row < warehouse.length; row++) {
                        for (int column = 0;
                             column < warehouse[row].length;
                             column++) {

                            if (warehouse[row][column] == -1) {
                                continue;
                            }

                            totalInventory += warehouse[row][column];
                        }
                    }

                    System.out.println("Total Inventory: " + totalInventory);
                    break;

                case 3:
                    boolean foundLowShelf = false;
                    int criticalLevel = 5;

                    for (int row = 0;
                         row < warehouse.length && !foundLowShelf;
                         row++) {

                        for (int column = 0;
                             column < warehouse[row].length;
                             column++) {

                            if (warehouse[row][column] == -1) {
                                continue;
                            }

                            if (warehouse[row][column] <= criticalLevel) {
                                System.out.println(
                                    "Critically low shelf found at Row "
                                    + row + ", Column " + column
                                    + " with " + warehouse[row][column]
                                    + " items."
                                );

                                foundLowShelf = true;
                                break;
                            }
                        }
                    }

                    if (!foundLowShelf) {
                        System.out.println("No critically low shelf found.");
                    }
                    break;

                case 4:
                    restockShelf(input, warehouse);
                    break;

                case 5:
                    System.out.println("Exiting warehouse scanner.");
                    break;

                default:
                    System.out.println("Invalid choice. Please select 1-5.");
            }

        } while (choice != 5);

        input.close();
    }

    public static void restockShelf(Scanner input, int[][] warehouse) {
        System.out.println("\n===== RESTOCK SHELF =====");

        int row;
        int column;
        int amount;

        while (true) {
            System.out.print("Enter row (0-" + (warehouse.length - 1) + "): ");
            row = input.nextInt();

            if (row >= 0 && row < warehouse.length) {
                break;
            }

            System.out.println("Invalid row. Try again.");
        }

        while (true) {
            System.out.print(
                "Enter column (0-" + (warehouse[row].length - 1) + "): "
            );
            column = input.nextInt();

            if (column >= 0 && column < warehouse[row].length) {
                break;
            }

            System.out.println("Invalid column. Try again.");
        }

        if (warehouse[row][column] == -1) {
            System.out.println("Cannot restock. This shelf is damaged.");
            return;
        }

        while (true) {
            System.out.print("Enter amount to restock: ");
            amount = input.nextInt();

            if (amount > 0) {
                break;
            }

            System.out.println("Restock amount must be greater than 0.");
        }

        warehouse[row][column] += amount;

        System.out.println("Shelf successfully restocked.");
        System.out.println("New inventory: " + warehouse[row][column]);
    }
}

