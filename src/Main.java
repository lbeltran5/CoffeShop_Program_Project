import java.util.*;

class Main{

    static double totalCost = 0;

    public static void main(String[] args){

        //building a scanner for user input
        Scanner scanner = new Scanner(System.in);

        //print out the title of the program
        System.out.println();
        System.out.println("------Welcome to my CoffeeShop!------");

        //creating instance of a class and passing variable as an argument Constr
        double funds = 15;
        double orderCost = 0;

        //Customer Info
        //Customer wallet has been hard coded to have 10 dollars
        Customer customer = new Customer();
        customer.addFunds(10);
        double currentBalance = customer.checkBalance();


        //using polymorphism here by using a variable of the superclass type to refer to an object of a subclass type
        Menu menu = new Menu();
        Hot hotMenu = new Hot(scanner,currentBalance);
        Cold coldMenu = new Cold(scanner, currentBalance);
        Espresso pressoMenu = new Espresso(scanner, currentBalance);
        Food food = new Food(funds, orderCost);

        //printing out the CoffeShop menu
        menu.coffeeDrinks();

        //printing out the customer balance
        System.out.printf("Your Current Balance is: $%.2f", currentBalance);
        System.out.println();

        // try-catch block will catch any InputMismatchExceptions that are thrown by the scanner.nextInt() method, and will print the message "Invalid input. Please enter a valid option." to inform the user of their mistake.
        try {
            int selection = scanner.nextInt();
            switch (selection) {
                case 1 -> {
                    System.out.println("You have chosen the Hot Coffee Menu.\n");
                    hotMenu.hotDrinks();
                    totalCost += hotMenu.getCost();
                }
                case 2 -> {
                    System.out.println("You have chosen the Cold Coffee Menu.\n");
                    coldMenu.coldDrinks();
                    totalCost += coldMenu.getCost();
                }
                case 3 -> {
                    System.out.println("You have chosen the Espresso Menu.\n");
                    pressoMenu.pressoDrinks();
                    totalCost += pressoMenu.getCost();
                }
                default -> System.out.println("Invalid selection. Please enter a valid option.");
            }
        } catch (InputMismatchException e) {
            System.out.println("Invalid input. Please enter a valid option.");
        }
        //This can be useful because it will keep the program running even if the user enters an invalid input, it will keep asking for the input until the user enters a valid option.


        //Asking customer if they would like any food with their coffee
        System.out.println("Would you like to order any food with your coffee? (Yes/No)");

        while (true) {
            String foodChoice = scanner.next();
            if (foodChoice.equalsIgnoreCase("yes")) {
                System.out.println();
                System.out.println("------- Here is our food menu -------");
                System.out.println(" Food:               Price:     ");
                food.foodClass();
                totalCost += food.getFoodCost();
                break;
            } else if (foodChoice.equalsIgnoreCase("no")) {
                break;
            } else {
                System.out.println("Invalid input. Please enter 'yes' or 'no'.");
            }
        }

        //closing the scanner to prevent leakage
        scanner.close();

        //PRINTING out total cost and dismissing the user
        System.out.println("Your total is $" + totalCost +"0.\n" + "Enjoy your purchase, have a great morning!");

    }
}