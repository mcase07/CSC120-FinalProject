public class Player {
    
    String name;
    String position;

    public Player(String name){

        this.name = name;
        this.position = "Home";

        System.out.println("Hello, " + this.name + "! Currently, you are at " + position + ".");

    }
    
    String move(String direction){

        if (direction == "NORTH"){
            this.position = "the Hair Salon";
            return "You are at " + position;
        } else if (direction == "SOUTH"){
            this.position = "the Nail Salon";
            return "You are at " + position;
        }else if (direction == "EAST"){
            this.position = "the Book Store";
            return "You are at " + position;
        }else if (direction == "WEST"){
            this.position = "the Cafe";
            return "You are at " + position;
        }else{
            return "That's not a valid direction, choose again!";
        }
    }

    public static void main(String[] args) {
        Player Player1 = new Player("Jo");

        // will do userResponse = userInput.nextLine.toUpperCase();
        System.out.println(Player1.move("EAST"));
    }
}
