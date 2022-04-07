import java.util.ArrayList;

public class CafeUtil {



    public int getStreakGoal(){
        int sum = 0;

        for (int i = 0; i < 11; i++){
            sum += i;
        }
        return sum;
    }


    public double getOrderTotal(double[] prices){

        double total = 0;

        for (int i = 0; i < prices.length; i++){
            total += prices[i];
        }
        return total;
    }
    

    public void displayMenu(ArrayList<String> menuItems){
        for (int i = 0; i < menuItems.size(); i++){
            System.out.println(i + " " + menuItems.get(i));
            // System.out.printf("%s %s", i, menuItems.get(i));
        }
    }

    public void addCustomer(ArrayList<String> customers){
        System.out.println("Please enter your name:");
        String userName = System.console().readLine();
        System.out.println("Hello " + userName + " There are " + customers.size() + " people in front of you");
        customers.add(userName);
        System.out.println(customers);
    }


    public boolean displayMenu(ArrayList<String> menuItems, double[] prices){

        if (menuItems.size() != prices.length){
            return false;
        }
        else{
            for (int i = 0; i < menuItems.size(); i++){
                System.out.println(i + " " + menuItems.get(i) + " --- " + prices[i]);
            }
            return true;
        }
    }

    public void printPriceChart(String product, double price, int maxQuantity){
        System.out.println(product);

        double sum = price;
        

        for (int i = 0; i < maxQuantity; i++){
            // System.out.println((i+1) + " - $" + sum);
            System.out.printf(" %s - $%.2f \n", i+1, sum);
            sum = sum + price - .50;
        }
    }
}