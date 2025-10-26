import java.util.HashMap;
import java.util.Map;

public class VendingMachine {

    private Map<String, Item> inventory;
    private double currentBalance;
    private final String ADMIN_PASSWORD = "admin123";

    public VendingMachine() {
        inventory = new HashMap<>();
        initializeInventory();
        currentBalance = 0;
    }

    private void initializeInventory() {
        inventory.put("Coke", new Item("Coke", 1.50, 10));
        inventory.put("Chips", new Item("Chips", 1.00, 15));
        inventory.put("Candy", new Item("Candy", 0.75, 20));
        inventory.put("Water", new Item("Water", 1.25, 12));
        inventory.put("Chocolate", new Item("Chocolate", 1.75, 18));
    }

    public void displayItems() {
        System.out.println("Available Items:");
        for (Map.Entry<String, Item> entry : inventory.entrySet()) {
            Item item = entry.getValue();
            System.out.println(item.getName() + " - $" + item.getPrice() + " - Stock: " + item.getQuantity());
        }
    }

    public boolean insertMoney(double amount) {
        if (amount > 0) {
            currentBalance += amount;
            return true;
        } else {
            System.out.println("Please insert a positive amount.");
            return false;
        }
    }

    public boolean selectItem(String itemName) {
        if (inventory.containsKey(itemName)) {
            Item item = inventory.get(itemName);
            if (item.getQuantity() > 0) {
                if (currentBalance >= item.getPrice()) {
                    item.decreaseQuantity();
                    currentBalance -= item.getPrice();
                    return true;
                } else {
                    System.out.println("Insufficient funds. Please insert more money.");
                }
            } else {
                System.out.println("Sorry, this item is out of stock.");
            }
        } else {
            System.out.println("Invalid item name. Please try again.");
        }
        return false;
    }

    public void returnChange() {
        System.out.println("Returning change: $" + currentBalance);
        currentBalance = 0;
    }

    public void adminAccess(Scanner scanner) {
        System.out.print("Enter admin password: ");
        String password = scanner.nextLine();
        if (password.equals(ADMIN_PASSWORD)) {
            System.out.print("Enter item name to restock: ");
            String itemName = scanner.nextLine();
            if (inventory.containsKey(itemName)) {
                System.out.print("Enter quantity to add: ");
                int quantity = scanner.nextInt();
                scanner.nextLine(); // Consume newline
                inventory.get(itemName).increaseQuantity(quantity);
                System.out.println("Item restocked successfully.");
            } else {
                System.out.print("Item not found. Enter price for the new item: ");
                double price = scanner.nextDouble();
                scanner.nextLine(); // Consume newline
                System.out.print("Enter initial quantity: ");
                int quantity = scanner.nextInt();
                scanner.nextLine(); // Consume newline
                inventory.put(itemName, new Item(itemName, price, quantity));
                System.out.println("New item added successfully.");
            }
        } else {
            System.out.println("Incorrect password. Access denied.");
        }
    }
}