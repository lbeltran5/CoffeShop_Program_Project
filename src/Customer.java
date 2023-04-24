//We can consider this class "Customer.java" as an Encapsulation
class Customer {

    //defining the funds field as private, which means that it can only be accessed within a class
    private double funds;

    //Customer class provides public methods addFunds(), checkBalance() and purchase() which can be used to interact
    //with the object without giving direct access to the funds field.

    //Constructor that it initialize the "funds" field to have a value of 0 when a new object of the "Customer" class is created
    public Customer() {
        this.funds = 0;
    }

    //This method provides a way to increase the funds of the customer
    public void addFunds(double funds) {
        this.funds += funds;
    }

    //This method provides a way to check the curent funds of the customer
    public double checkBalance() {
        return this.funds;
    }

    //This method provides a way to make a purchase and check whether the customer has enough funds to make the purchase
    //OR not
    public boolean purchase(double cost) {
        if (this.funds >= cost) {
            this.funds -= cost;
            return true;
        } else {
            return false;
        }
    }

}
