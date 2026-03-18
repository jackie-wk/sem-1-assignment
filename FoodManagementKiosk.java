// Food Management Kiosk System
//1. Food class to represent food items
 class Food {
    private String name;
    private double price;
    private int quantity;
public Food(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    
    }
    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
    public int getQuantity() {
        return quantity;
    }
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    
    }
  
   public void displayFoodDetails(){
        System.out.println(name + " - Ksh " + price + " - Quantity: " + quantity);
    }
}

//2. Customer class to represent customer orders
class Customer {
    private String name;
    private String phoneNo;

    public Customer(String name, String phoneNo) {
        this.name = name;
        this.phoneNo = phoneNo;
    }
    public String getName() {
        return name;
     }

    public String getPhoneNo() {
        return phoneNo;
    }
}

//3 Transaction class to manage the transaction Process
class Transaction {
    private String transactionId;
    private Customer customer;
    private Food food;
    private int quantity;
    private double totalAmount;

    public Transaction(Customer customer, Food food, int quantity) {
        this.transactionId = generateTransactionId();
        this.customer = customer;
        this.food = food;
        this.quantity = quantity;
        this.totalAmount = food.getPrice() * quantity;
    }

    private String generateTransactionId() {
        return "TXN" + System.currentTimeMillis();
    }
    public String getTransactionId() {
        return transactionId;
    }
    public Customer getCustomer() {
        return customer;
    }
    public Food getFood() {
        return food;
    }
    public int getQuantity() {
        return quantity;
    }
    public double getTotalAmount() {
        return totalAmount;
    }
    public void displayTransactionDetails() {
        System.out.println("Transaction ID: " + transactionId);
        System.out.println("Customer Name: " + customer.getName());
        System.out.println("Food Item: " + food.getName());
        System.out.println("Quantity: " + quantity);
        System.out.println("Total Amount: Ksh " + totalAmount);

    }
}

//Main class to run the system
public class FoodManagementKiosk {
    public static void main(String[] args) {
        // Create some food items
        Food burger = new Food("Burger", 150.0, 10);
        Food pizza = new Food("Pizza", 300.0, 5);
        Food fries = new Food("Fries", 100.0, 20);

        // Display the menu
        System.out.println("Menu:");
        burger.displayFoodDetails();
        pizza.displayFoodDetails();
        fries.displayFoodDetails();

        // Create a customer
        Customer customer = new Customer("Jackie Kingori", "+123456789");

        // Place an order
        Transaction transaction = new Transaction(customer, pizza, 2);
        
        // Display transaction details
        transaction.displayTransactionDetails();
    }
}
