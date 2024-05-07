import java.util.Hashtable;

public class Player {
    
    String name;
    String position;

    public Boolean hairWashed;
    public int nHairCuts;
    public Boolean hairDry;
    public Boolean hairStyled;
    public Boolean nailsDone;
    public Boolean toesDone;
    public int balance;
    public Boolean isSitting;
    public Hashtable<String, Boolean> bag;

    /**
     * Player constructor that sets name, attributes, postition, and balance
     * @param name Name of the player
     */
    public Player(String name){

        this.name = name;
        this.position = "Home";
        this.hairWashed = false;
        this.nHairCuts = 0;
        this.hairDry = true;
        this.hairStyled = false;
        this.nailsDone = false;
        this.toesDone = false;
        this.balance = 100;
        this.isSitting = false;
    }

    /**
     * Setter that changes nailsDone attribute to true
     * @param nailsDone Boolean if nails are done or not
     */
    public void setNailsDone(Boolean nailsDone) {
        this.nailsDone = nailsDone;
    }

    /**
     * Setter that changes toesDone attribute to true
     * @param toesDone Boolean if toes are done or not
     */
    public void setToesDone(Boolean toesDone) {
        this.toesDone = toesDone;
    }
}
