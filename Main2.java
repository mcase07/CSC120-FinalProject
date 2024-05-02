import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {

        //creating all of our buildings
        //need this for the eventual refill wallet
        Home home = new Home();
        Bookstore bookStore = new Bookstore("The Book Store");
        Cafe cafe = new Cafe("The Cafe");
        HairSalon hairSalon = new HairSalon("The Hair Salon");
        NailSalon nailSalon = new NailSalon("The Nail Salon");

        // This is a "flag" to let us know when the loop should end
        boolean stillPlaying = true;

        // We'll use this to get input from the user.
        Scanner userInput = new Scanner(System.in);

        // Storage for user's responses
        String userResponse = "";
        
        //welcome message
        System.out.println("\nWelcome to Wellness World. This is a shopping center that you can explore! Make purchases, get services done, and enjoy!\n");
        
        System.out.println("\nEnter your name to begin");
        userResponse = userInput.nextLine();
        Player player = new Player(userResponse);
        
        //directions to play the game
        System.out.println("\nHi, " + player.name + "!");

     // The do...while structure means we execute the body of the loop once before checking the stopping condition
        do {
            // ************************************************
            // The stuff that happens in your game will go here
            //  ↓  ↓  ↓  ↓  ↓  ↓  ↓  ↓  ↓  ↓  ↓  ↓  ↓  ↓  ↓  ↓
            

            //player's position is home at this point!
            //say: you're back home! choose a direction 
            System.out.println("\nYou're at home!\n");
            System.out.println("The Hair Salon is to the NORTH");
            System.out.println("The Nail Salon is to the SOUTH");
            System.out.println("The Book Store is to the WEST");
            System.out.println("The Cafe is to the EAST");
            System.out.println("\nIf you would like to end the game, enter END");
            System.out.println("\nEnter a direction to move!");

            userResponse = userInput.nextLine().toUpperCase();
            
            if (userResponse.equals("END")) {
                stillPlaying = false;
            } 

            while (!userResponse.equals("EAST") && !userResponse.equals("WEST") && !userResponse.equals("NORTH") && !userResponse.equals("SOUTH") && !userResponse.equals("END")){
                System.out.println("Sorry, I don't recognize that response, try something else.");
                userResponse = userInput.nextLine().toUpperCase();
            }
            // switch(player.position){
                // case "Home":
                // this switch case is based on direction
                switch(userResponse){
                    case "EAST":
                        player.position = "Cafe";
                        // System.out.println("\nWelcome to the " + player.position);
                        // cafe.showOptions();
                        break;
                    case "WEST":
                        player.position = "Book Store";
                        // System.out.println("\nWelcome to the " + player.position);
                        // bookStore.showOptions();
                        break;
                    case "NORTH":
                        player.position = "Hair Salon";
                        // System.out.println("\nWelcome to the " + player.position);
                        // hairSalon.showOptions();
                        break;
                    case "SOUTH":
                        player.position = "Nail Salon";
                        // System.out.println("\nWelcome to the " + player.position);
                        // nailSalon.showOptions();
                        break;
                    case "END":
                    // userInput.close();
                    // System.out.println("Thanks for visiting Wellness World, come back soon!");
                    break;
                    //need to figure out the break around end
                }
                //home's break
                // break;
                switch(player.position){

                    //if the boookstore is called
                    case "Book Store":
                        System.out.println("\nWelcome to the " + player.position);
                        bookStore.showOptions();

                        userResponse = userInput.nextLine().toUpperCase();

                        //limits what the player can call to just the things book store can perform
                        while (!userResponse.equals("CHOOSE A BOOK") && !userResponse.equals("RETURN A BOOK") && !userResponse.equals("SIT DOWN") && !userResponse.equals("GET UP") && !userResponse.equals("EXIT")){
                            System.out.println("Sorry, I don't recognize that response, try something else.");
                            userResponse = userInput.nextLine().toUpperCase();
                        }
                        switch(userResponse){
                            case "CHOOSE A BOOK":
                                //need to figure out a prettier souting situation!
                                System.out.println("\nChoose a book from our selection. We have: " + bookStore.books);
                                System.out.println("\nEnter a title to select a book");
                                String book = userInput.nextLine().toUpperCase();
                                bookStore.chooseBook(book);
                                break;
                        }
                        
                        break;

                    //if the cafe is called
                    case "Cafe":
                        System.out.println("\nWelcome to the " + player.position);
                        cafe.showOptions();

                        userResponse = userInput.nextLine().toUpperCase();

                        //limits what the player can call to just the things cafe can perform
                        while (!userResponse.equals("BUY SOMETHING") && !userResponse.equals("SIT DOWN") && !userResponse.equals("GET UP") && !userResponse.equals("EXIT")){
                            System.out.println("Sorry, I don't recognize that response, try something else.");
                            userResponse = userInput.nextLine().toUpperCase();
                        }
                        switch(userResponse){
                            case "BUY SOMETHING":   
                                System.out.println("\nChoose an item from our menu. We have: " + cafe.menu);
                                String item = userInput.nextLine().toUpperCase();
                                System.out.println(item);
                                cafe.sellItem(item);
                                break;
                            case "SIT DOWN":
                                cafe.sit(player);
                                break;
                            case "GET UP":
                                cafe.sit(player);
                                break;
                            case "EXIT":
                                break;

                        }

                        break;
                    //if the hair salon is called
                    case "Hair Salon":

                        System.out.println("\nWelcome to the " + player.position);
                        hairSalon.showOptions();

                        userResponse = userInput.nextLine().toUpperCase();
                        // System.out.println(userResponse);

                        //limits what the player can call to just the things hair salon can perform
                        while (!userResponse.equals("WASH") && !userResponse.equals("DRY") && !userResponse.equals("STYLE") && !userResponse.equals("CUT") && !userResponse.equals("EXIT")){
                            System.out.println("Sorry, I don't recognize that response, try something else.");
                            userResponse = userInput.nextLine().toUpperCase();
                        }
                        switch(userResponse){
                            case "WASH":
                                hairSalon.wash(player);
                                break;
                            case "DRY":
                                hairSalon.dry(player);
                                break;
                            case "STYLE":
                                hairSalon.style(player);
                                break;
                            case "CUT":
                                hairSalon.cut(player);
                                break;
                            case "EXIT":
                                break;
                        }
                        //hair salon's break
                        break;
                
                //if the nail salon is called
                case "Nail Salon":

                    System.out.println("\nWelcome to the " + player.position);
                    nailSalon.showOptions();
                    userResponse = userInput.nextLine().toUpperCase(); 

                    //limits what the player can call to just the things nail salon can perform
                    while (!userResponse.equals("MANICURE") && !userResponse.equals("PEDICURE") && !userResponse.equals("BOTH") && !userResponse.equals("EXIT")){
                        System.out.println("Sorry, I don't recognize that response, try something else.");
                        userResponse = userInput.nextLine().toUpperCase();
                    }
                    switch(userResponse){
                        case "MANICURE":
                            if (player.nailsDone == true){
                                System.out.println("Looks like you already have a manicure. Try one of our other services or a different shop!\n");
                                break;
                            }else{
                                System.out.println("\nChoose a color from our options. We have: " + nailSalon.colors);
                                String color = userInput.nextLine();
                                System.out.println("OMG, " + color + " is my favorite color!\n");
                                
                                System.out.println("Choose a length from our options. We have: " + nailSalon.lengths);
                                String length = userInput.nextLine();
                                System.out.println("\nAh, " + length + " is a great choice!\n");

                                System.out.println("Now, what shape would you like? You can choose from: " + nailSalon.shapes);
                                String shape = userInput.nextLine();
                                System.out.println("\nOh I love " + shape + " on you!\n");

                                nailSalon.manicure(player);
                                System.out.println("Looks like you have a beatiful set of " + length + ", " + shape + ", " + color + " nails! They look great!\n");
                                // System.out.println("Would you like more services at The Nail Salon? Enter 1 to stay here, 2 to exit.");
                                break;

                                // userResponse
                                
                                //prompt user for 1 to quit, 2 to continue - need depends on the loops we have
                            }
                        case "PEDICURE":
                        if (player.toesDone == false){
                            System.out.println("\nChoose a color from our options. We have: " + nailSalon.colors);
                            String color = userInput.nextLine();

                            nailSalon.pedicure(player);
                            System.out.println("Looks like you have a lovely " + color + " pedicure! It turned out great!\n");
                        }else{
                            System.out.println("Looks like you already have a pedicure. Try one of our other services or a difference shop!\n");
                        }
                        break;
                        //both doesn't really work for some reason...idk 
                        case "BOTH":
                        if (player.nailsDone == false && player.toesDone == false){
                            nailSalon.both(player);
                        }else if(player.nailsDone == false && player.toesDone == true){
                
                            System.out.println("Looks like you already have your toes painted. How about trying a manicure?");
                
                        }else if(player.nailsDone == true && player.toesDone == false){
                
                            System.out.println("Looks like you already have your nails painted. How about trying a pedicure?");
                
                        }else if(player.nailsDone == true && player.toesDone == true){
                
                            System.out.println("Looks like you already have your nails and toes painted. How about trying a different shop?");
                        }
                        case "EXIT":
                        break;
                    }
                    //nail salon's break
                    break;
            }
            
            
        }while (stillPlaying);
        // Tidy up
        userInput.close();
        System.out.println("Thanks for visiting Wellness World, come back soon!");
        //check to see if game should end
        //does this just need to be sprinkled throughout??
    }
}