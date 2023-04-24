//importing classses
import java.util.*;

public class Food extends Menu{
    private double funds;
    private Scanner scanner;
    double foodCost = 0;
    double orderCost;
    static int coffeeSelection;
    static int foodSelection;

    // Anther constructor
    public Food(double funds, double orderCost){
        this.funds = funds; //store the in funds variable
        this.scanner = new Scanner(System.in); //initializ
    }

    // method providing an arraylist that contains the food menu
    public void foodClass() {
        ArrayList<String> foodMenu = new ArrayList<>();
        foodMenu.add("Croissant                 $4.50");
        foodMenu.add("Bagel                     $2.50");
        foodMenu.add("Chocolate donut           $3.00");
        foodMenu.add("Cinnamon Roll             $4.00");

        //this prints out the foodMenu in the ArrayList
        for(int i = 0; i < foodMenu.size(); i++){
            System.out.println((i+1) + "." + foodMenu.get(i));
        }

        System.out.println("-------------------------------------");
        System.out.println("Please enter the number of the food item you would like to order:");

        //scanner for food selection
        foodSelection = scanner.nextInt();

    }

    //2. method getFoodCost() provides the price of the food as well as user food selection
    public double getFoodCost() {
        double price = 0;
        switch(foodSelection) {
            case 1:
                price = 4.50;
                System.out.println("Enjoy your Croissant with your coffee!");
                System.out.println();
                break;
            case 2:
                price = 2.50;
                System.out.println("Enjoy your Bagel with your coffee!");
                System.out.println();
                break;
            case 3:
                price = 3.00;
                System.out.println("Enjoy your Chocolate Donut with your coffee!");
                System.out.println();
                break;
            case 4:
                price = 4.00;
                System.out.println("Enjoy your Cinammon Roll with your coffee!");
                System.out.println();
                break;
            default:
                System.out.println("Invalid selection. Please select a valid option.");
        }
        return price;
    }
    @Override
    public void coffeeDrinks(){
    }
}
