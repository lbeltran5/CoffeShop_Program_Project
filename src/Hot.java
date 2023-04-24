
//importing classses
import java.util.*;

//Here we are using extends to our parent class
public class Hot extends Menu{
    private double funds;
    private Scanner scanner;

    //constructor used to initialize scanner and funds
    // WHEN A NEW OBJECT 'hot' IS CREATED
    public Hot(Scanner scanner, double funds){
        this.scanner = scanner;
        this.funds = funds;
    }

    //simple method providing hot drinks menu
    public void hotDrinks(){
        System.out.println("-------------------------------------\n"
                +"Please choose from the hot coffee below:\n"
                + "Drinks:             Price:     \n"
                + "1. Hot Coffee             $3.00\n"
                + "2. Caramel Macchiato      $3.50\n"
                + "3. Hot Chocolate          $2.50\n"
                + "-------------------------------------");
    }

    // 1.this getCost() method is used to get the cost of the coffee
    // it provides the price and provides a print statmnt of user
    // coffee selection
    // if an else statement that has price of each coffee
    public double getCost() {
        int coffeeSelection = scanner.nextInt();
        double price = 0;
        if (coffeeSelection == 1) {
            price = 3.00;
            System.out.println("You selected Hot Coffee.");
            System.out.println();
        } else if (coffeeSelection == 2) {
            price = 3.50;
            System.out.println("You selected a Caramel Macchiato.");
            System.out.println();
        } else if (coffeeSelection == 3) {
            price = 2.50;
            System.out.println("You selected Hot Chocolate.");
            System.out.println();
        } else {
            System.out.println("Invalid option selected.");
        }
        if (funds >= price) {
            System.out.println("Enjoy your coffee! Remaining funds is: $ " + (funds - price)+"0");
        } else {
            System.out.println("Insufficient funds. Please add more money.");
        }
        return price;
    }
    @Override
    public void coffeeDrinks(){
    }
}