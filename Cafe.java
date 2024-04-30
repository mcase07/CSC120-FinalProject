import java.util.Hashtable;

public class Cafe  extends Building{
    public Boolean seat = false;
    private Hashtable<String, Boolean> seats; 
    public Hashtable <String, Integer > inventory = new Hashtable<String, Integer>(); 

    public Cafe(String name){
        super(name);
        this.inventory.put("Latte", 10);
        this.inventory.put("Iced Coffee", 10);
        this.inventory.put("Espresso", 10);
        this.inventory.put("Hot Chocoloate", 10);
        this.inventory.put("Water", 10);
        this.inventory.put("Cinnamon Roll", 10);
        this.inventory.put("Croissant", 10);
        this.inventory.put("Brownie", 10);

        //don't need below line anymore, it goes in main
        // System.out.println( "Hi Welcome to the Cafe! Here is our menu: " + this.inventory);
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

public void sellItem(String item){
   int n = this.inventory.get(item);
   if (n < 1){
    this.restock(item);}
    else{
    n = -1;
    this.inventory.replace (item, n);
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


}

