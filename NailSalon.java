import java.util.ArrayList;

public class NailSalon extends Building {
    
    ArrayList<String> colors = new ArrayList<String>();
    ArrayList<String> lengths =  new ArrayList<String>();
    ArrayList<String> shapes =  new ArrayList<String>();

    public NailSalon(String name){
        
        super(name);
        //surely there has to be a better way to do this
        // read files in 
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
        System.out.println("\n + manicure()\n + pedicure()\n + both()\n");
    }

    // choose color, legth, and style and change player's attribute
    // check first if nails are already done - move this to be in main so that we check when the player enters the salon
    public void manicure(Player player){
        
        player.setNailsDone(true);
    }

    // choose color and change player's attribute
    // check first if toes are already done
    public void pedicure(Player player){

        player.setToesDone(true);
    }

    // run both mani and pedi and change player's attribute
    // check first the status of nails/toes being done
    public void both(Player player, String color, String length, String shape){ // call manicure() or pedicure() instead of having the full code out 

        if (player.nailsDone == false && player.toesDone == false){

            manicure (player);
            pedicure(player); //this actually might not work bc of the scanners            

            player.setNailsDone(true);
            player.setToesDone(true);

        }else if(player.nailsDone == false && player.toesDone == true){

            System.out.println("Looks like you already have your toes painted. How about trying a manicure?");

        }else if(player.nailsDone == true && player.toesDone == false){

            System.out.println("Looks like you already have your nails painted. How about trying a pedicure?");

        }else if(player.nailsDone == true && player.toesDone == true){

            System.out.println("Looks like you already have your nails and toes painted. How about trying a different shop?");
        }
    }

    public static void main(String[] args) {

        Player mack = new Player("Mack");
        NailSalon nails = new NailSalon("Nail Salon");
        System.out.println(mack.nailsDone);
        // nails.manicure(mack);
        // nails.pedicure(mack);
        // nails.both(mack);
        // nails.manicure(mack);
        // nails.pedicure(mack);
        
    }
}
