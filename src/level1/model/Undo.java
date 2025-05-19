package level1.model;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.HashMap;

public class Undo {
    private static Undo instance;
    private HashMap<String, Integer> orders;


    private Undo(){
     orders = new HashMap<>();

    }

    Scanner scanner = new Scanner(System.in);

    public void addOrder() {
        String product;
        int quantity;
        boolean validFormat = false;

        while (!validFormat) {
            try {
                System.out.println("Enter the product name: ");
                product = scanner.nextLine().trim();
                if (product.isEmpty()) {
                    System.out.println("Product name cannot be empty. Try again.");
                    continue;
                }

                System.out.println("Enter the quantity: ");
                if (!scanner.hasNextInt()) {
                    System.out.println("Invalid input. Please enter a valid number.");
                    scanner.nextLine();
                    continue;
                }

                quantity = scanner.nextInt();
                scanner.nextLine();

                if (quantity <= 0) {
                    System.out.println("The quantity must be greater than 0. Try again.");
                    continue;
                }

                if (quantity > 0 && !product.isEmpty()) {
                    orders.put(product, orders.getOrDefault(product, 0) + quantity);
                    System.out.println("Adding product: " + product);
                    validFormat = true;
                }

            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a valid number.");
                scanner.nextLine();
            } catch (Exception e) {
                System.out.println("An unexpected error occurred: " + e.getMessage());
                scanner.nextLine();
            }
        }
    }

    public void removeOrder() {
        String product;
        int quantity;
        boolean validFormat = false;

        while (!validFormat) {
            try {
                System.out.println("Enter the product name: ");
                product = scanner.nextLine().trim();
                if (product.isEmpty()) {
                    System.out.println("Product name cannot be empty. Try again.");
                    continue;
                }

                System.out.println("Enter the quantity to remove: ");
                quantity = scanner.nextInt();
                if (quantity <= 0) {
                    System.out.println("The quantity must be greater than 0. Try again.");
                    continue;
                }

                if (!orders.containsKey(product)) {
                    System.out.println("The product '" + product + "' does not exist in the cart. Try again.");
                    continue;
                }

                int currentQuantity = orders.get(product);
                if (quantity > currentQuantity) {
                    System.out.println("The specified quantity exceeds the current quantity (" + currentQuantity + "). Try again.");
                    continue;
                } else if (quantity == currentQuantity) {
                    orders.remove(product);
                    System.out.println("The product '" + product + "' has been removed from the cart.");
                } else {

                    orders.put(product, currentQuantity - quantity);
                    System.out.println("The quantity of '" + product + "' has been reduced by " + quantity +
                            ". Remaining quantity: " + (currentQuantity - quantity));
                }

                validFormat = true;
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a valid number.");
            }
        }
    }
    public HashMap<String, Integer> getOrders(){
        if(orders.isEmpty()){
            System.out.println("No orders have been added yet.");
        }
        System.out.println("Showing orders: " + orders);
        return orders;
    }

    public static Undo getInstance(){
        if(instance == null){
            instance = new Undo();
        }
        return instance;
    }

    public void menu() {
        System.out.println("Welcome to shopping cart! Please select an option with the number:");
        System.out.println("\nMENU:");
        System.out.println("1.- Show shopping cart.");
        System.out.println("2.- Add product to shopping cart.");
        System.out.println("3.- Remove product from shopping cart.");
        System.out.println("0.- Salir");
    }
}



