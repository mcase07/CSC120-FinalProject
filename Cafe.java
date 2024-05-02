import java.util.Hashtable;
import java.util.ArrayList;

public class Cafe  extends Building{
    public Boolean seat = false;
    private Hashtable<String, Boolean> seats; 
    public Hashtable <String, Integer > inventory = new Hashtable<String, Integer>(); 
    public ArrayList<String> menu = new ArrayList<String>();

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

        //this is a work around so we don't sout the inventory in key, value pairs. will redo later to take out & just use key pair 
        //time crunch fix!!
        this.menu.add("Latte");
        this.menu.add("Iced Coffee");
        this.menu.add("Hot Chocolate");
        this.menu.add("Water");
        this.menu.add("Cinnamon Roll");
        this.menu.add("Croissant");
        this.menu.add("Brownie");


        //don't need below line anymore, it goes in main
        // System.out.println( "Hi Welcome to the Cafe! Here is our menu: " + this.inventory);
    }

    @Override
    public void showOptions() {
        // TODO Auto-generated method stub
        super.showOptions();
        System.out.println(" + Buy Something\n + Sit Down\n + Get Up\n");
    }

// public void order(String item){

    // moving this all to main:
    // System.out.println("Here is our menu :" + menu + ".\n");
    // Scanner sc = new Scanner(System.in);
    // System.out.println("What would you like to order?");
    // String order = sc.nextLine();
    // System.out.println("You have ordered a " + item + ", coming right up!\n");

    // sc.close();

public void sellItem(String item){
   int n = this.inventory.get(item);
   if (n < 1){
    this.restock(item);
    sellItem(item);
   }else{
    n = -1;
    this.inventory.replace (item, n);
    System.out.println("Enjoy your " + item + "!");
    }
}

  private void restock(String item){
    int n = this.inventory.get(item);
    if (n < 1){
        this.inventory.replace(item, 10);
    }
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

  // public static void main(String[] args) {
  //   Cafe cafe = new Cafe("Cafe");
  //   cafe.showOptions();
  //   cafe.sellItem("Cinnamon Roll");
  // }

}

