package level1.model;

import java.util.*;

public class Undo {
    private static Undo instance;
    private Deque<String> orders  = new ArrayDeque<>();// Romina al ser privado el constructor
    private List<String> allOrders = new ArrayList<>();// no puedo inicializar
    private Scanner scanner = new Scanner(System.in);// en otra parte


    private Undo() {}

    public static Undo getInstance() {
        if (instance == null) {
            instance = new Undo();
        }
        return instance;
    }

    public void getOrders(){
        System.out.println(allOrders);
    }

    public void addOrder () {
        System.out.println("Enter the order: ");
        String order = scanner.nextLine().trim();
        orders.push(order);
        allOrders.add(order);
        System.out.println("Order added: " + order);


    }

    public void undoOrder() {
        if (orders.isEmpty()) {
            System.out.println("No orders to undo.");
        } else {
            String lastOrder = orders.pop();
            System.out.println("Undid order: " + lastOrder);
        }

    }

}

