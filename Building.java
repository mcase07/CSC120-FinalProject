public class Building {
    
    protected String name;

    /**
     * Building constructor that sets name
     * @param name name of building
     */
    public Building(String name){
        this.name = name;
    }
    
    /**
     * Changes player position to home
     * @param player player whose position is changing
     */
    //might not need this method
    public void exit(Player player){
        player.position = "Home";
    }

    /**
     * Prints the things that a player can do in a building
     */
    public void showOptions(){
        System.out.println("Avalaible options at " + this.name + ":\n\n + Exit");

    }
}
