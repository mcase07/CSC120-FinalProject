public class Building {
    
    protected String name;

    public Building(String name){
        this.name = name;
    }
    
    public void exit(Player player){
        player.position = "Home";
    }

    public void showOptions(){
        System.out.println("Avalaible options at " + this.name + ":\n\n + Exit");

    }
}
