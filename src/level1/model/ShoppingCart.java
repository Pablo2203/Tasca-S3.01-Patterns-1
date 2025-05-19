package level1.model;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ShoppingCart {

    Undo undo = Undo.getInstance();
    Scanner scanner = new Scanner(System.in);
    public void start() {
            int option = -1;
        do {
            try {

                undo.menu();
                option = scanner.nextInt();
                switch (option) {
                    case 1 -> this.undo.getOrders();
                    case 2 -> this.undo.addOrder();
                    case 3 -> this.undo.removeOrder();
                    case 0 -> System.out.println("Leaving the menu...");
                    default -> System.out.println("Invalid option. Try again.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Invalid entry. Please enter a number.");
                scanner.next();
            }

        }  while (option != 0) ;
    }



}
