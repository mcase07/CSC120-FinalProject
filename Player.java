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

        // System.out.println("Hello, " + this.name + "! Currently, you are at " + position + ".");
    }

    public void move(String direction){
        if (direction == "NORTH"){
            this.position = "Hair Salon";
        } else if (direction == "SOUTH"){
            this.position = "Nail Salon";
        }else if (direction == "EAST"){
            this.position = "Book Store";
        }else if (direction == "WEST"){
            this.position = "Cafe";
        }
    }

    public void exit(){
        this.position = "Home"; 
    }

    public int buy(int amount){
        this.balance -= amount;
        return this.balance;
    }

    public void setNailsDone(Boolean nailsDone) {
        this.nailsDone = nailsDone;
    }

    public void setToesDone(Boolean toesDone) {
        this.toesDone = toesDone;
    }
    public static void main(String[] args) {
        Player Player1 = new Player("Jo");

        // will do userResponse = userInput.nextLine.toUpperCase();
        // System.out.println(Player1.move("EAST"));
        System.out.println(Player1.position);
    }
}
