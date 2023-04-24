//importing classses
import java.util.*;

public class Espresso extends Menu {
    private double funds;
    private Scanner scanner;

    //Constructor to create a new object espresso
    public Espresso(Scanner scanner,double funds){
        this.scanner = scanner;
        this.funds = funds;
    }

    //simple method providing the espresso drinks menu
    public void pressoDrinks(){
        System.out.println("-------------------------------------\n"
                +"Please choose from the Espresso menu below:\n"
                + "  Drinks:            Price:     \n"
                + "1. Cafe Americano          $2.50\n"
                + "2. Cafe Latte              $3.00\n"
                + "3. Capuccino               $3.50\n"
                + "-------------------------------------");
    }

    //1. method getCost(), still considering it as same method for
    // Hot, Cold, and Espresso classes.
    // if an else statement that has price of each coffee
    public double getCost(){
        int coffeeSelection = scanner.nextInt();
        double price = 0;
        if (coffeeSelection == 1) {
            price = 2.50;
            System.out.println("You selected a Cafe Americano.");
            System.out.println();
        } else if (coffeeSelection == 2) {
            price = 3.00;
            System.out.println("You selected a Cafe Latte.");
            System.out.println();
        } else if (coffeeSelection == 3) {
            price = 3.50;
            System.out.println("You selected a Cappucino.");
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