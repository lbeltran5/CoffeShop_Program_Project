//importing classses
import java.util.*;

public class Cold extends Menu{
    private double funds;
    private Scanner scan;

    //constructor initializing scan and funds
    public Cold(Scanner scan,double funds){
        this.scan = scan;
        this.funds = funds;
    }

    //simple method providing cold drinks menu
    public void coldDrinks(){
        System.out.println("-------------------------------------\n"
                +"Please choose from the cold coffee menu below:\n"
                + "  Drinks:           Price:     \n"
                + "1. Nitro Cold Brew         $3.50\n"
                + "2. Iced Latte              $4.00\n"
                + "3. Frappucino              $4.50\n"
                + "-------------------------------------");
    }

    //1. method getCost, similiar to Hot, Espresso getCost
    // differs on prices and coffee choices selection
    public double getCost(){
        int coffeeSelection = scan.nextInt();
        double price = 0;
        if (coffeeSelection == 1) {
            price = 3.50;
            System.out.println("You selected a Nitro Cold Brew.");
            System.out.println();
        } else if (coffeeSelection == 2) {
            price = 4.00;
            System.out.println("You selected a Iced Latte.");
            System.out.println();
        } else if (coffeeSelection == 3) {
            price = 4.50;
            System.out.println("You selected a Frappucino.");
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