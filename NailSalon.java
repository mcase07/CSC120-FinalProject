import java.util.ArrayList;

public class NailSalon extends Building {
    
    ArrayList<String> colors = new ArrayList<String>();
    ArrayList<String> lengths =  new ArrayList<String>();
    ArrayList<String> shapes =  new ArrayList<String>();

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

    @Override
    public void showOptions() {
        // TODO Auto-generated method stub
        super.showOptions();
        System.out.println(" + Manicure\n + Pedicure\n + Both\n");
    }

    // choose color, legth, and style and change player's attribute
    public void manicure(Player player){
        
        player.setNailsDone(true);
    }

    // choose color and change player's attribute
    public void pedicure(Player player){

        player.setToesDone(true);
    }

    // run both mani and pedi and change player's attribute
    public void both(Player player){ 

        manicure (player);
        pedicure(player); 
    }

    // public static void main(String[] args) {

    //     Player mack = new Player("Mack");
    //     NailSalon nails = new NailSalon("Nail Salon");
    //     System.out.println(mack.nailsDone);
    //     // nails.manicure(mack);
    //     // nails.pedicure(mack);
    //     // nails.both(mack);
    //     // nails.manicure(mack);
    //     // nails.pedicure(mack);
        
    // }
}
