public class Player {
    
    String name;
    String position;

    public Boolean hairWashed;
    public int nHairCuts;
    public Boolean hairDry;
    public Boolean hairStyled;
    public Boolean nailsDone;
    public Boolean toesDone;

    public Player(String name){

        this.name = name;
        this.position = "Home";
        this.hairWashed = false;
        this.nHairCuts = 0;
        this.hairDry = true;
        this.hairStyled = false;
        this.nailsDone = false;
        this.toesDone = false;

        // System.out.println("Hello, " + this.name + "! Currently, you are at " + position + ".");

    }

    String move(String direction){

        if (direction == "NORTH"){
            this.position = "Hair Salon";
            return "You are at the " + this.position + ".";
        } else if (direction == "SOUTH"){
            this.position = "Nail Salon";
            return "You are at the " + this.position + ".";
        }else if (direction == "EAST"){
            this.position = "Book Store";
            return "You are at the " + this.position + ".";
        }else if (direction == "WEST"){
            this.position = "Cafe";
            return "You are at the " + this.position + ".";
        }else{
            return "That's not a valid direction, choose again!";
        }
    }

    public static void main(String[] args) {
        Player Player1 = new Player("Jo");

        // will do userResponse = userInput.nextLine.toUpperCase();
        System.out.println(Player1.move("EAST"));
        System.out.println(Player1.position);
    }
}
