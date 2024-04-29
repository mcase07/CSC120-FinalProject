import java.util.ArrayList;
import java.util.Hashtable;

public class Cafe {
    ArrayList<String> menu = new ArrayList<String>();
    private int latte; // The number of latte remaining in inventory
    private int icedCoffee; // The number of icedCoffee remaining in inventory
    private int espresso; // The number of espresso remaining in inventory
    private int hotChocolate; // The number of hotChocolate remaining in inventory
    private int water; // The number of water remaining in inventory
    private int cinnamonRoll; // The number of cinnamonRoll remaining in inventory
    private int croissant; // The number of croissant remaining in inventory
    private int brownie; // The number of brownie remaining in inventory
    public Boolean seat = false;
    private Hashtable<String, Boolean> seats; 
    public Hashtable <String, Integer > inventory; 

public Cafe(int latte, int icedCoffee, int espresso, int hotChocolate, int water, int cinnamonRoll, int croissant, int brownie){
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

//public void order(String item){

    // moving this all to main:
    // System.out.println("Here is our menu :" + menu + ".\n");
    // Scanner sc = new Scanner(System.in);
    // System.out.println("What would you like to order?");
    // String order = sc.nextLine();
   // System.out.println("You have ordered a " + item + ", coming right up!\n");

   // sc.close();

//}

public void sellItem(int latte, int icedCoffee, int espresso, int hotChocolate, int water, int cinnamonRoll, int croissant, int brownie){
    if(size > this.nCoffeeOunces||nSugarPackets> this.nSugarPackets|| nCreams> this.nCreams|| nCups> nCups){
    }
    // values of Parameter (in this case all ints) decrease
      nCoffeeOunces -= size; 
      nSugarPackets -=  nSugarPackets;
      nCreams -= nCreams;
      nCups -= 1;
  }

  private void restock(int latte, int icedCoffee, int espresso, int hotChocolate, int water, int cinnamonRoll, int croissant, int brownie){
}


public void sit(Player player){
    if(this.seat == true){
      System.out.println("You are now sitting down");}
      }
    
  public void getUp(Player player){
    if(this.seat == false){
      System.out.println("You are standing right now.");
    }
  }

}
