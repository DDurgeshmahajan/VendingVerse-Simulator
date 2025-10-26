/*
 * Author: Durgesh Mahajan
 * Date: 2023-10-05
 * Project: Vending Machine Simulator
 */

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        VendingMachine vendingMachine = new VendingMachine();
        Scanner scanner = new Scanner(System.in);
        int choice;

        while (true) {
            System.out.println("Vending Machine Menu:");
            System.out.println("1. Display Items");
            System.out.println("2. Insert Money");
            System.out.println("3. Select Item");
            System.out.println("4. Return Change");
            System.out.println("5. Admin Access");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");

            choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    vendingMachine.displayItems();
                    break;
                case 2:
                    System.out.print("Enter amount to insert: ");
                    double amount = scanner.nextDouble();
                    if (vendingMachine.insertMoney(amount)) {
                        System.out.println("Amount inserted successfully.");
                    }
                    break;
                case 3:
                    System.out.print("Enter the item name: ");
                    String itemName = scanner.nextLine();
                    if (vendingMachine.selectItem(itemName)) {
                        System.out.println("Enjoy your " + itemName + "!");
                    }
                    break;
                case 4:
                    vendingMachine.returnChange();
                    break;
                case 5:
                    vendingMachine.adminAccess(scanner);
                    break;
                case 6:
                    System.out.println("Thank you for using the Vending Machine. Goodbye!");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}