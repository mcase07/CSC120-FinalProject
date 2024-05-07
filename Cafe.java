import java.util.Hashtable;
import java.util.ArrayList;

public class Cafe  extends Building{
  public Boolean seat = false;
  public Hashtable <String, Integer > inventory = new Hashtable<String, Integer>(); 
  public ArrayList<String> menu = new ArrayList<String>();

  /**
   * Cafe constructor that sets a name and inherets from Building class
   * @param name name of the cafe
   */
  public Cafe(String name){
    super(name);

    //in caps to work w scanner in main
    this.inventory.put("LATTE", 10);
    this.inventory.put("ICED COFFEE", 10);
    this.inventory.put("ESPRESSO", 10);
    this.inventory.put("HOT CHOCOLATE", 10);
    this.inventory.put("WATER", 10);
    this.inventory.put("CINNAMON ROLL", 10);
    this.inventory.put("CROISSANT", 10);
    this.inventory.put("BROWNIE", 10);

    //this is a work around so we don't sout the inventory in key, value pairs
    this.menu.add("Latte");
    this.menu.add("Iced Coffee");
    this.menu.add("Hot Chocolate");
    this.menu.add("Water");
    this.menu.add("Cinnamon Roll");
    this.menu.add("Croissant");
    this.menu.add("Brownie");
  }

  /**
   * Overriding the showoptions method inhereted from building class
   */
  @Override
  public void showOptions() {
    // TODO Auto-generated method stub
    super.showOptions();
    System.out.println(" + Buy Something\n + Sit Down\n + Get Up\n");
  }

  /**
   * Sells an item from the inventory and subtracts 1 from the number there are
   * If the inventory is low, calls the restock method
   * @param item Item that the person wants to buy
   */
  public void sellItem(String item){
    int n = this.inventory.get(item);
    if (n < 1){

      this.restock(item);
      sellItem(item);

    }else{
      n = -1;
      this.inventory.replace (item, n);
      System.out.println("\nEnjoy your " + item + "!");
    }
  }

  /**
   * Restocks an item passed in 
   * @param item Item that is being restocked 
   */
  private void restock(String item){
    int n = this.inventory.get(item);
    if (n < 1){
      this.inventory.replace(item, 10);
    }
  }

  /**
   * Allows a player to sit down & changes their attribute
   * Checks to see if they're already sitting
   * @param player Player that's sitting
   */
  public void sit(Player player){
    if(player.isSitting == true){
      System.out.println("\nYou are already sitting down.");
    }else if(player.isSitting == false){
        player.isSitting = true;
        System.out.println("\nYou are now sitting down.");
    }
  }

  /**
   * Allows a player to get up & changes their attribute
   * Checks to see if they're already standing
   * @param player Player that's standing
   */
  public void getUp(Player player){
    if(player.isSitting == false){
      System.out.println("\nYou are already standing.");
    }
    else if(player.isSitting == true){
        player.isSitting = false;
        System.out.println("\nYou are now standing up.");}
  }
}

