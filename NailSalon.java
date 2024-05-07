import java.util.ArrayList;

public class NailSalon extends Building {
    
    ArrayList<String> colors = new ArrayList<String>();
    ArrayList<String> lengths =  new ArrayList<String>();
    ArrayList<String> shapes =  new ArrayList<String>();

    /**
     * NailSalon constructor that sets a name and inherets from Building class
     * @param name name of the nail salon
     */
    public NailSalon(String name){
        
        super(name);
        //surely there has to be a better way to do this
        //there is! read files in 
        colors.add("Red");
        colors.add("Orange");
        colors.add("Yellow");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Pink");
        colors.add("Purple");
        colors.add("White");
        colors.add("Black");
        colors.add("Nude");
        colors.add("Grey");

        lengths.add("Short");
        lengths.add("Medium");
        lengths.add("Long");
        lengths.add("XLong");
        lengths.add("XXLong");

        shapes.add("Almond");
        shapes.add("Stiletto");
        shapes.add("Square");
        shapes.add("Coffin");
        shapes.add("Flare");
        shapes.add("Oval");
    }

    /**
     * Overriding the showoptions method inhereted from building class
     */
    @Override
    public void showOptions() {
        // TODO Auto-generated method stub
        super.showOptions();
        System.out.println(" + Manicure\n + Pedicure\n + Both\n");
    }

    /**
     * Gives a player a manicure and changes their attribute
     * @param player player whose nails are getting done
     */
    public void manicure(Player player){
        
        player.setNailsDone(true);
    }

    /**
     * Gives a player a pedicure and changes their attribute
     * @param player player whose toes are getting done
     */
    public void pedicure(Player player){

        player.setToesDone(true);
    }

    /**
     * Gives a player a manicure and a pedicure and changes their attributes
     * @param player player whose nails and toes are getting done
     */
    public void both(Player player){ 

        manicure (player);
        player.setNailsDone(true);
        pedicure(player); 
        player.setToesDone(true);
    }
}
