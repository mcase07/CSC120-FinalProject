import java.util.ArrayList;

public class HairSalon {

    ArrayList<String> menu = new ArrayList<String>();

    public HairSalon(){

        this.menu.add("Wash");
        this.menu.add("Cut");
        this.menu.add("Dry");
        this.menu.add("Style"); 

        System.out.println("\nHello! Welcome to our hair salon! Please choose one of the services from our menu:");
        System.out.println(menu + "\n");
    }

    // wash hair and change player's attribute 
    // check first if hair's already washed
    public void wash(Player player){
        if(player.hairWashed == true){
            System.out.println("Your hair is already washed! Try a different service.");
        }else{
            player.hairWashed = true;
        }
    }

    // dry hair and change player's attribute 
    // check first if hair's already dried
    public void dry(Player player){
        if(player.hairDry == true){
            System.out.println("Your hair is already dry! Try a different service.");
        }else{
            player.hairDry = true;
            System.out.println("Hair's dry now. Try a style or cut!");
        }
    }

    // style hair and change player's styled and dry attributes
    // check first if hair's already washed
    public void style(Player player){

        if(player.hairWashed == true){

            player.hairStyled = true;
            player.hairDry = true;

            System.out.println("Cute blowout! Lookin' good!\n");

        }else if (player.hairWashed == false){
            
            System.out.println("Your hair needs to be washed before we can style it! Let's go ahead and do that.\n");
            player.hairWashed = true;
            System.out.println("Hair's washed, time to style!");
            player.hairStyled = true;

            System.out.println("Cute blowout! Lookin' good!\n");
        }
    }

    // cut hair and change player's attribute 
    // check first if hair's already cut less than 3 times
    public void cut(Player player){

        if (player.nHairCuts < 3) {
            System.out.println("Snip snip. Nice cut");
            player.nHairCuts += 1;
        } else {
            System.out.println("Oops! Looks like we can't cut any more hair, we kinda cut it all off...");
            // could e.g. issue a refund in the future
        }
    }

    public static void main(String[] args) {

        HairSalon hairSalon = new HairSalon();

        // System.out.println(hairSalon.menu);

        Player me = new Player("mack");
        // System.out.println(me.hairWashed);
        // me.hairWashed = true;
        // hairSalon.style(me);
        System.out.println(me.nHairCuts);
        hairSalon.cut(me);
        hairSalon.cut(me);
        hairSalon.cut(me);
        System.out.println(me.nHairCuts);
        hairSalon.cut(me);
        // hairSalon.wash(Player1);
        // System.out.println(Player1.hairWashed);
        // hairSalon.wash(Player1);

    }
}