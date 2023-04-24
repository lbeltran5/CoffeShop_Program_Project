//This is my superclass or parent class to Hot,Cold,Espresso and Food
public class Menu {

    //Defining names of Menus
    String Hot;
    String Cold;
    String Espresso;

    public void coffeeDrinks(){
        System.out.println("-------------------------------------\n"
                + "Please choose from the menu below:\n"
                + "1. Hot Drinks\n"
                + "2. Cold Drinks\n"
                + "3. Espresso\n"
                +"-------------------------------------");
    }

}