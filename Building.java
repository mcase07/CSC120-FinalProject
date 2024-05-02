public class Building {
    
    protected String name;
    public int balance;


    public Building(String name){
        this.name = name;
    }
    
    public void exit(Player player){
        player.position = "Home";
    }

    public int buy(int amount){
        this.balance -= amount;
        return this.balance;
    }


    public void showOptions(){
        System.out.println("Avalaible options at " + this.name + ":\n\n + Exit");

    }
}
