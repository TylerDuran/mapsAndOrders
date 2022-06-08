import java.util.ArrayList;
public class TestOrders {
    public static void main(String[] args) {
    
        // Menu items // Coppied same items and prices from CafeBusinessLogic Assignment
        // previous Assignment ///////////////////////////////
        // Item item1 = new Item();
        // item1.name = "drip coffee";
        // item1.price = 3.50;

        // Item item2 = new Item();
        // item2.name = "cappuccino";
        // item2.price = 1.50;

        // Item item3 = new Item();
        // item3.name = "latte";
        // item3.price = 4.00;

        // Item item4 = new Item();
        // item4.name = "mocha";
        // item4.price = 4.50;

        // Barista Challenge
        // Menu Items 
        Item item1 = new Item("drip coffee", 3.50);
        Item item2 = new Item("cappuccino", 1.50);
        Item item3 = new Item("latte", 4.00);
        Item item4 = new Item("mocha", 4.50);

///////////////////////////////////////////////////////////////////////////////////////////////////

        // Order variables -- order1, order2 etc.
        // previous Assignment ///////////////////////////////
        // Order order1 = new Order();
        // order1.name = "Cindhuri";

        // Order order2 = new Order();
        // order2.name = "Jimmy";

        // Order order3 = new Order();
        // order3.name = "Noah";

        // Order order4 = new Order();
        // order4.name = "Sam";

        // Barista Challenge
        // Orders
        // 2 unspecified 
        Order order1 = new Order();
        Order order2 = new Order();
        // 3 Overidden
        Order order3 = new Order("Jimmy");
        Order order4 = new Order("Noah");
        Order order5 = new Order("Sam");



        // Application Simulations 
        // previous Assignment ///////////////////////////////
        // Add item1 to order2's item list and increment the order's total.
        // order2.itemsOrdered.add(item1);
        // order2.total = item1.price;

        // // order 3 Noah ordered a cappucino. Add the cappuccino to their order list and to their tab.
        // order3.itemsOrdered.add(item2);
        // order3.total = item2.price;

        // // order 4 Sam added a latte. Update accordingly.
        // order4.itemsOrdered.add(item3);
        // order4.total = item3.price;

        // // Cindhuri’s order is now ready. Update her status.
        // // This makes no sense because she never placed an order yet 
        // order1.ready = true;
        // // Jimmy’s order is now ready. Update his status.
        // order2.ready = true;
        
        // // Extra order 1 Cindhuri ordered everything 
        // order1.itemsOrdered.add(item1);
        // order1.itemsOrdered.add(item2);
        // order1.itemsOrdered.add(item3);
        // order1.itemsOrdered.add(item4);
        // order1.total = item1.price + item2.price + item3.price + item4.price;

        // // Sam ordered more drinks - 2 lattes. Update their order as well.
        // order4.itemsOrdered.add(item3);
        // order4.itemsOrdered.add(item3);
        // order4.total = 2 * item3.price;

        // Barista Challenge
        // Application Simulations 
        order3.addItem(item1);
        order2.addItem(item3);

        // Implement the getStatusMessage method within the Order class
        // Test your getStatusMessage functionality by setting some orders to ready and printing the messages for each order. 
        // For example: order2.setReady(true); System.out.println(order2.getStatusMessage());
        // Implement the getOrderTotal method within the Order class
        // Test the total by printing the return value like so: System.out.println(order1.getOrderTotal());
        // Implement the display method within the Order class
        // Finally, call the display method on all of your orders, like so: order3.display();
        System.out.println(order3.getStatusMessage());

        order3.setReady(true);

        System.out.println(order3.getStatusMessage());

        System.out.println(order3.getOrderTotal());

        order3.addItem(item1);
        order3.addItem(item4);
        order3.addItem(item2);
        order3.display();

        // order1.addItem(item1);
        // order1.addItem(item4);
        // order1.addItem(item2);
        // order1.display();

        // order2.addItem(item1);
        // order2.addItem(item4);
        // order2.addItem(item2);
        // order2.display();

        // order4.addItem(item1);
        // order4.addItem(item4);
        // order4.addItem(item2);
        // order4.display();

        // order5.addItem(item1);
        // order5.addItem(item4);
        // order5.addItem(item2);
        // order5.display();

///////////////////////////////////////////////////////////////////////////////////////////////////

        // Use this example code to test various orders' updates
        // Previous Assignment //////////////////////
        
        // order 1 Cindhuri
        // System.out.printf("Name: %s\n", order1.name);
        // System.out.printf("Total: %s\n", order1.total);
        // System.out.printf("Ready: %s\n", order1.ready);

        // // order 2 Jimmy
        // System.out.printf("Name: %s\n", order2.name);
        // System.out.printf("Total: %s\n", order2.total);
        // System.out.printf("Ready: %s\n", order2.ready);

        // // order3 Noah
        // System.out.printf("Name: %s\n", order3.name);
        // System.out.printf("Total: %s\n", order3.total);
        // System.out.printf("Ready: %s\n", order3.ready);

        // // order4 Sam
        // System.out.printf("Name: %s\n", order4.name);
        // System.out.printf("Total: %s\n", order4.total);
        // System.out.printf("Ready: %s\n", order4.ready);
    }
}