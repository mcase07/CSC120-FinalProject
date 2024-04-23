// import java.util.ArrayList;

public class HairSalon extends Salon implements HairSalonContract {

    // ArrayList<String> hairStyles = new ArrayList<String>();
    //add cut dye style to hairStyles options

    public HairSalon(){

        this.menu.add("Wash");
        this.menu.add("Cut");
        //i feel like a player would be confused about the differences between these two:
        this.menu.add("Dry");
        this.menu.add("Blow dry"); //change to style 
        //add style hair 

    }

    public void washHair(Player player){
        if(player.hairWashed = true){
            System.out.println("Your hair is already washed! Try something a different service.");
        }else{
            player.hairWashed = true;
        }
    }

    public void dryHair(Player player){
        if(player.hairDry = true){
            System.out.println("Your hair is already dry! Try a different service.");
        }else{
            player.hairDry = true;
        }
    }

    public void blowDryHair(Player player){//keep this the same but change to style
        if(player.hairDry = true){
            System.out.println("Your hair is already dry! Try a different service.");
        }else{
            player.hairDry = true;
        }
    }

    public void cutHair(Player player){
        //can only run e.g. 3 times before souting "oops, you cut off all your hair! can't cut anymore!"
        player.hairCut = true;
    }

    public static void main(String[] args) {

        HairSalon hairSalon = new HairSalon();

        // System.out.println(hairSalon.menu);

        Player Player1 = new Player("Me");
        System.out.println(Player1.hairWashed);
        hairSalon.washHair(Player1);
        System.out.println(Player1.hairWashed);
        hairSalon.washHair(Player1);

    }
}