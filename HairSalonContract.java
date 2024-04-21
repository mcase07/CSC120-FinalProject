public interface HairSalonContract {

    void washHair(Player player);
    void dryHair(Player player); //dry hair after washing it
    void blowDryHair(Player player);
    void cutHair(Player player);
    //add style (blowout) and take out blowDryHair

}
