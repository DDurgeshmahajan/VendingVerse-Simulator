```markdown
# Vending Machine Simulator

## Short Description
Welcome to the Vending Machine Simulator! This project simulates a vending machine where users can browse items, insert money, select items, and get change. It also includes an admin mode for managing inventory. This project is useful for learning basic Java programming concepts and for testing vending machine functionalities.

## Features
- **Display Items:** Show the available items, their prices, and stock quantities.
- **Insert Money:** Allow users to insert money into the vending machine.
- **Select Item:** Let users select and purchase items if they have sufficient funds and the item is in stock.
- **Return Change:** Provide change to users after they make a purchase.
- **Admin Access:** Allow admins to restock items and add new items to the inventory.
- **User-Friendly Interface:** Easy-to-navigate menu and clear feedback messages.

## Usage Instructions
1. **Clone the Repository:**
   ```bash
   git clone https://github.com/DDurgeshmahajan/VendingMachineSimulator.git
   ```

2. **Compile the Code:**
   Navigate to the project directory and compile the Java files:
   ```bash
   cd VendingMachineSimulator
   javac Main.java VendingMachine.java Item.java Utils.java
   ```

3. **Run the Simulator:**
   Start the vending machine simulator:
   ```bash
   java Main
   ```

4. **Navigate the Menu:**
   - **Display Items:** Choose option 1 to see the list of available items.
   - **Insert Money:** Choose option 2 to add money to the machine.
   - **Select Item:** Choose option 3 to purchase an item.
   - **Return Change:** Choose option 4 to get any remaining balance back.
   - **Admin Access:** Choose option 5 and enter the admin password to manage inventory.
   - **Exit:** Choose option 6 to exit the program.

## Example/Preview
Here's a sample interaction with the vending machine:

```
Vending Machine Menu:
1. Display Items
2. Insert Money
3. Select Item
4. Return Change
5. Admin Access
6. Exit
Enter your choice: 1

Available Items:
Coke - $1.50 - Stock: 10
Chips - $1.00 - Stock: 15
Candy - $0.75 - Stock: 20
Water - $1.25 - Stock: 12
Chocolate - $1.75 - Stock: 18
```

## Dependencies
- **Java Version:** Java 8 or later

## Contact / Author
- **Name:** Durgesh Mahajan
- **Email:** ashamahajan955@gmail.com

Feel free to reach out if you have any questions or need further assistance!
```

### Notes
- The `Utils` class provides helper methods for clearing the screen and displaying formatted messages, enhancing the user experience.
- The `VendingMachine` class manages the inventory, user interactions, and admin functionalities.
- The `Item` class represents an item in the vending machine, storing its name, price, and quantity.
- The `Main` class contains the main method and the menu-driven interface.

Enjoy using the Vending Machine Simulator! 🍭 🍻
```