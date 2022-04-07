import java.util.ArrayList;
public class TestOrders {
    public static void main(String[] args) {
    
        // Menu items
        Item item1 = new Item("Mocha", 3.5);
        Item item2 = new Item("Latte", 2.5);
        Item item3 = new Item("Drip Coffee", 4.0);
        Item item4 = new Item("Capuccino", 3.0);

    
        // Order variables -- order1, order2 etc.
        Order order1 = new Order("Cindhuri");
        Order order2 = new Order("Jimmy");
        Order order3 = new Order("Noah");
        Order order4 = new Order("Sam");
        Order order5 = new Order();
        Order order6 = new Order();


        order1.addItem(item1);
        order1.addItem(item3);

        order2.addItem(item3);
        order2.addItem(item4);
    
        order3.addItem(item2);
        order3.addItem(item1);

        order4.addItem(item1);
        order4.addItem(item4);

        order5.addItem(item2);
        order5.addItem(item3);
        
        order6.addItem(item3);
        order6.addItem(item2);

        order5.setReady();

        // order5.getStatusMessage();

        // order5.getOrderTotal();

        // order5.display();

        CoffeeKiosk kiosk = new CoffeeKiosk();

        kiosk.addMenuItem(item1);
        kiosk.addMenuItem(item2);
        kiosk.addMenuItem(item3);
        kiosk.addMenuItem(item4);

        // kiosk.displayMenu();
        kiosk.newOrder();


        // Application Simulations
        // Use this example code to test various orders' updates
        // System.out.printf("Name: %s\n", order1.name);
        // System.out.printf("Total: %s\n", order1.total);
        // System.out.printf("Ready: %s\n", order1.ready);
    }
}
