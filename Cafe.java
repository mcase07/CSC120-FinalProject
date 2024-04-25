import java.util.ArrayList;
import java.util.Hashtable;

public class Cafe {
    ArrayList<String> menu = new ArrayList<String>();
    private Hashtable<String, Boolean> seats; 
    private int nCoffeeOunces; // The number of ounces of coffee remaining in inventory
    private int nSugarPackets; // The number of sugar packets remaining in inventory
    private int nCreams; // The number of "splashes" of cream remaining in inventory
    private int nCups; // The number of cups remaining in inventory

public Cafe(int coffee, int sugar, int cream, int cups){
    menu.add("Latte");
    menu.add("Iced Coffee");
    menu.add("Espresso");
    menu.add("Hot Chocoloate");
    menu.add("Water");
    menu.add("Cinnamon Roll");
    menu.add("Croissant");
    menu.add("Brownie");
    System.out.println( "Hi Welcome to the Cafe! Here is our menu: " + this.menu);
}

public void order(String item){

    // moving this all to main:
    // System.out.println("Here is our menu :" + menu + ".\n");
    // Scanner sc = new Scanner(System.in);
    // System.out.println("What would you like to order?");
    // String order = sc.nextLine();
    System.out.println("You have ordered a " + item + ", coming right up!\n");

   // sc.close();

}

public void sellCoffee(int size, int nSugarPackets, int nCreams, int nCups){
    if(size > this.nCoffeeOunces||nSugarPackets> this.nSugarPackets|| nCreams> this.nCreams|| nCups> nCups){
    }
    // values of Parameter (in this case all ints) decrease
      nCoffeeOunces -= size; 
      nSugarPackets -=  nSugarPackets;
      nCreams -= nCreams;
      nCups -= 1;
  }

  private void restock(int nCoffeeOunces, int nSugarPackets, int nCreams, int nCups){
}


}
