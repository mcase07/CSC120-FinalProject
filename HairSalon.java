public class HairSalon extends Building {

    /**
     * HairSalon constructor that sets a name and inherets from Building class
     * @param name name of the hair salon
     */
    public HairSalon(String name){
        super(name);
    }

    /**
     * Overriding the showoptions method inhereted from building class
     */
    @Override
    public void showOptions() {
        // TODO Auto-generated method stub
        super.showOptions();
        System.out.println(" + Wash\n + Dry\n + Style\n + Cut\n");
    }

    /**
     * Washes a player's hair and changes their attribute
     * Checks to see if the player's hair is washed first
     * @param player player whose hair is getting washed
     */
    public void wash(Player player){
        if(player.hairWashed == true){
            System.out.println("Your hair is already washed! Try a different service.");
        }else{
            player.hairWashed = true;
            System.out.println("Nice and clean! What's next?");
        }
    }

    /**
     * Dries a player's hair and changes their attribute
     * Checks to see if the player's hair is dry first
     * @param player player whose hair is getting dried
     */
    public void dry(Player player){
        if(player.hairDry == true){
            System.out.println("Your hair is already dry! Try a different service.");
        }else{
            player.hairDry = true;
            System.out.println("Hair's dry now. Try a style or cut!");
        }
    }

    /**
     * Styles a player's hair and changes their attribute
     * Checks to see if the player's hair is washed first
     * @param player player whose hair is getting styled
     */
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

    /**
     * Cuts a player's hair and adds to their hair cut attribute
     * Checks to see if the player's hair is cut first & stops them after 3 times
     * @param player player whose hair is getting styled
     */
    public void cut(Player player){

        if (player.nHairCuts < 3) {
            System.out.println("Snip snip. Nice cut");
            player.nHairCuts += 1;
        } else {
            System.out.println("Oops! Looks like we can't cut any more hair, we kinda cut it all off...");
            // could e.g. issue a refund in the future
        }
    }
}