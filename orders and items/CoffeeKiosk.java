import java.util.ArrayList;

public class CoffeeKiosk{


    private ArrayList<Item> menu;
    private ArrayList<Order> orders;


    public CoffeeKiosk(){
        menu = new ArrayList<Item>(); //[]
        orders = new ArrayList<Order>(); //[]
    }


    public void addMenuItem(Item item) {

    menu.add(item);      // adding the the Item to the arraylist
    int index = menu.indexOf(item);      // creating an int and setting it to the index of the newItem
    item.setIndex(index);    // setting the index of the newItem to be what the index is from the menu
    }



public void displayMenu(){
    for (int i = 0; i < this.menu.size(); i++){
        System.out.println(this.menu.get(i).getIndex() + " " + this.menu.get(i).getName() + " -- $" + this.menu.get(i).getPrice());
    }
}




    public void newOrder() {
        
    	// Shows the user a message prompt and then sets their input to a variable, name
        System.out.println("Please enter customer name for new order:");
        String name = System.console().readLine();
    
    	// Your code:
        // Create a new order with the given input string
        // Show the user the menu, so they can choose items to add.
        Order newOrder = new Order(name);
        displayMenu();
        
    	// // Prompts the user to enter an item number
        System.out.println("Please enter a menu item index or q to quit:");
        String itemNumber = System.console().readLine();
        
        // // Write a while loop to collect all user's order items
        while(!itemNumber.equals("q")) {
            if (Integer.parseInt(itemNumber) >= this.menu.size()){
                System.out.println("Coffee not found");
            }
            else{
            newOrder.addItem(menu.get(Integer.parseInt(itemNumber)));
            }




        System.out.println("Please enter a menu item index or q to quit:");
        itemNumber = System.console().readLine();
            
        //     // Get the item object from the menu, and add the item to the order
        //     // Ask them to enter a new item index or q again, and take their input
        // }
        // After you have collected their order, print the order details 
    	// as the example below. You may use the order's display method.
        
        
    }

    for (Item i : newOrder.getItems()){
        System.out.println(i.getIndex() + " " + i.getName() + " -- $" + i.getPrice());
    }

    
    }
}