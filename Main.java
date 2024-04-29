import java.util.Scanner;

public class Main {

    
    public static void main(String[] args) {

        Bookstore bookStore = new Bookstore();
        

        // This is a "flag" to let us know when the loop should end
        boolean stillPlaying = true;

        // We'll use this to get input from the user.
        Scanner userInput = new Scanner(System.in);

        // Storage for user's responses
        String userResponse = "";
        
        //welcome message
        System.out.println("\nWelcome to Wellness World. This is a shopping center that you can explore! Make purchases, get services done, and enjoy!\n");
        
        System.out.println("\nFirst, enter your name to begin");
        userResponse = userInput.nextLine();
        Player player = new Player(userResponse);
        
        //directions to play the game
        System.out.println("\nHi, " + player.name + "!");
        System.out.println("The Hair Salon is to the north.");
        System.out.println("The Nail Salon is to the south.");
        System.out.println("The Book Store is to the east.");
        System.out.println("The Cafe is to the west.");
        System.out.println("\nIf you would like to end the game, enter END");
        System.out.println("\nEnter a direction to move and start exploring!");

     // The do...while structure means we execute the body of the loop once before checking the stopping condition
        do {
            // ************************************************
            // The stuff that happens in your game will go here
            //  ↓  ↓  ↓  ↓  ↓  ↓  ↓  ↓  ↓  ↓  ↓  ↓  ↓  ↓  ↓  ↓
            userResponse = userInput.nextLine().toUpperCase();

            if (player.position == "Home"){ //do i need this if statement?
                if (userResponse.equals("EAST")){
                    player.position = "Book Store";
                    System.out.println("Welcome to the " + player.position);
                    //switch case...?
                }else if (userResponse.equals("WEST")){
                    player.position = "Cafe";
                    System.out.println("Welcome to the " + player.position);
                    Cafe cafe = new Cafe();
                    //switch case...?
                }else if (userResponse.equals("NORTH")){
                    player.position = "Hair Salon";
                    System.out.println("Welcome to the " + player.position);
                    //switch case...?
                }else if (userResponse.equals("SOUTH")){
                    player.position = "Nail Salon";
                    System.out.println("Welcome to the " + player.position);
                    //switch case...?
                }else{
                    //runtime exception...?
                    System.out.println("Sorry, I don't recognize that response, try something else");
                }

                switch(player.position){

                    case "Book Store":
                    bookStore.showOptions();
                }
            }

            


            // System.out.println("You are still playing. Follow the instructions if you want to win/lose...");
            // userResponse = userInput.nextLine().toUpperCase();

            // ***********************************************************************
            // And as the player interacts, you'll check to see if the game should end
            //  ↓  ↓  ↓  ↓  ↓  ↓  ↓  ↓  ↓  ↓  ↓  ↓  ↓  ↓  ↓  ↓  ↓  ↓  ↓  ↓  ↓  ↓  ↓  ↓
            if (userResponse.equals("END")) {
                stillPlaying = false;
            }
        } while (stillPlaying);

        // Tidy up
        userInput.close();
        System.out.println("Thanks for visiting Wellness World, come back soon!");

        // Player mack = new Player("Mack");
        // mack.move("EAST");
        // System.out.println(mack.move("EAST"));
        // //call move when they choose 

    }
    
}
