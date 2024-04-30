import java.util.Hashtable;

public class Cafe  extends Building{
    public Boolean seat = false;
    private Hashtable<String, Boolean> seats; 
    public Hashtable <String, Integer > inventory; 

    public Cafe(String name){
        super(name);
        inventory.put("Latte", 10);
        inventory.put("Iced Coffee", 10);
        inventory.put("Espresso", 10);
        inventory.put("Hot Chocoloate", 10);
        inventory.put("Water", 10);
        inventory.put("Cinnamon Roll", 10);
        inventory.put("Croissant", 10);
        inventory.put("Brownie", 10);
        System.out.println( "Hi Welcome to the Cafe! Here is our menu: " + this.inventory);
    }

    @Override
    public void showOptions() {
        // TODO Auto-generated method stub
        super.showOptions();
        System.out.println("\n + sellItem()\n + sit()\n + getUp()\n");
    }

// public void order(String item){

    // moving this all to main:
    // System.out.println("Here is our menu :" + menu + ".\n");
    // Scanner sc = new Scanner(System.in);
    // System.out.println("What would you like to order?");
    // String order = sc.nextLine();
    // System.out.println("You have ordered a " + item + ", coming right up!\n");

    // sc.close();



public void sellItem(String name, int latte, int icedCoffee, int espresso, int hotChocolate, int water, int cinnamonRoll, int croissant, int brownie){
    if(size > this.nCoffeeOunces||nSugarPackets> this.nSugarPackets|| nCreams> this.nCreams|| nCups> nCups){
    }
    // values of Parameter (in this case all ints) decrease
      nCoffeeOunces -= size; 
      nSugarPackets -=  nSugarPackets;
      nCreams -= nCreams;
      nCups -= 1;
  }



  private void restock(String name, int latte, int icedCoffee, int espresso, int hotChocolate, int water, int cinnamonRoll, int croissant, int brownie){
}




public void sit(Player player){
    if(player.isSitting == true){
      System.out.println("You are already sitting down.");}
      else {
        if(player.isSitting == false){
          player.isSitting = true;
          System.out.println("You are now sitting down.");
        }
      }
      }
    
  public void getUp(Player player){
    if(player.isSitting == false){
      System.out.println("You are already standing.");
    }
    else{
      if(player.isSitting == true){
        player.isSitting = false;
        System.out.println("You are now standing up.");}
  }
  }


}

