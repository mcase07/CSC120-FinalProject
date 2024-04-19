// import java.util.ArrayList;

public class HairSalon extends Salon implements HairSalonContract {

    // ArrayList<String> hairStyles = new ArrayList<String>();
    //add cut dye style to hairStyles options

    public HairSalon(){

        menu.add("Wash");
        menu.add("Cut");
        //i feel like a player would be confused about the differences between these two:
        menu.add("Dry");
        menu.add("Blow dry");

    }

    public void washHair(Player player){
        if(Player.hairWashed = true){
            System.out.println("Your hair is already washed! Try something a different service.");
        }else{
            Player.hairWashed = true;
        }
    }

    public void dryHair(Player player){
        if(Player.hairDry = true){
            System.out.println("Your hair is already dry! Try a different service.");
        }else{
            Player.hairDry = true;
        }
    }

    public void blowDryHair(Player player){
        if(Player.hairDry = true){
            System.out.println("Your hair is already dry! Try a different service.");
        }else{
            Player.hairDry = true;
        }
    }

    public void cutHair(Player player){
        //can only run e.g. 3 times before souting "oops, you cut off all your hair! can't cut anymore!"
        Player.hairCut = true;
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