import java.util.ArrayList;

public class Order{

    private String name;
    // private double total;
    private boolean ready;
    private ArrayList<Item> items;


    public Order(){
        this.name = "Guest";
        // this.total= 0;
        this.ready = false;
        this.items = new ArrayList<Item>();
    }

    public Order(String name){
        this.name = name;
        // this.total= 0;
        this.ready = false;
        this.items = new ArrayList<Item>();
    }


    // public void addItem(Item item){
    //     this.item.add(item);
    //     this.total = this.total + item.getPrice();
    // }



    //getters and setters

    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }


    // public double getTotal(){
    //     return this.total;
    // }

    // public void setTotal(double value){
    //     this.total = value;
    // }

    public boolean getReady(){
            System.out.println(this.ready);
            return this.ready;
    }

    public void setReady(){
        this.ready = true;
    }

    public ArrayList<Item> getItems(){
        // for (int i = 0; i < this.item.size(); i++){
        //     System.out.println(this.item.get(i).getName());
        // }
        return this.items;
    }

    public void addItem(Item newItem){
        this.items.add(newItem);
    }


    public void getStatusMessage(){
        if (this.getReady()){
            System.out.println("Your order is Ready");
        }
        else {
            System.out.println("Thank you for waiting. your order will be ready soon");
        }
    }


    public double getOrderTotal(){
        double sum = 0.0;

        for (int i = 0; i < this.items.size(); i++){
            sum += this.items.get(i).getPrice();
        }

        // System.out.println("Total Price: $" + sum);

        return sum;
    }

    public void display(){
        System.out.println(this.getName());
        
        for (int i = 0; i < this.items.size(); i++){
            System.out.println(this.items.get(i).getName() + " - $" + this.items.get(i).getPrice());
        }
        
        System.out.println("Total Price: $" + this.getOrderTotal());
    }

}
