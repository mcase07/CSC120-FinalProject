import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //creating all of our buildings
        //need this for the eventual refill wallet
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
            player.position = "Home";
            System.out.println("\n******* You're at home *******\n");
            System.out.println("The Hair Salon is to the NORTH");
            System.out.println("The Nail Salon is to the SOUTH");
            System.out.println("The Book Store is to the WEST");
            System.out.println("The Cafe is to the EAST");
            System.out.println("\nIf you would like to end the game, enter END");
            System.out.println("\nEnter a direction to move!");

            userResponse = userInput.nextLine().toUpperCase();
            
            // if the user says end, the game ends
            if (userResponse.equals("END")) {
                stillPlaying = false;
            } 

            // only valid responses are east, west, north, south, and end
            while (!userResponse.equals("EAST") && !userResponse.equals("WEST") && !userResponse.equals("NORTH") && !userResponse.equals("SOUTH") && !userResponse.equals("END")){
                System.out.println("Sorry, I don't recognize that response, try something else.");
                userResponse = userInput.nextLine().toUpperCase();
            }

            // this switch case is based on inputted direction
            switch(userResponse){
                case "EAST":
                    player.position = "Cafe";
                    break;
                case "WEST":
                    player.position = "Book Store";
                    break;
                case "NORTH":
                    player.position = "Hair Salon";
                    break;
                case "SOUTH":
                    player.position = "Nail Salon";
                    break;
                case "END":
                    break;
            }
            
            // this switch case is based on position 
            switch(player.position){
                //if the postion is the bookstore
                case "Book Store":
                    System.out.println("\nWelcome to the " + player.position);
                    bookStore.showOptions();

                    userResponse = userInput.nextLine().toUpperCase();

                    //limits what the player can call to just the things book store can perform
                    while (!userResponse.equals("CHOOSE A BOOK") && !userResponse.equals("RETURN A BOOK") && !userResponse.equals("SIT DOWN") && !userResponse.equals("GET UP") && !userResponse.equals("EXIT")){
                        System.out.println("Sorry, I don't recognize that response, try something else.");
                        userResponse = userInput.nextLine().toUpperCase();
                    }
                    // this switch case is based on what the user says they want to do in the book store
                    switch(userResponse){
                        // if the user says they want to choose a book
                        case "CHOOSE A BOOK":
                            //need to figure out a prettier souting situation!
                            System.out.println("\nChoose a book from our selection. We have: " + bookStore.books);
                            System.out.println("\nEnter a title to select a book");
                            String book = userInput.nextLine().toUpperCase();
                            String title = bookStore.chooseBook(player, book);

                            System.out.println("\nWould you like to purchase the book in your bag? Enter Y for yes, N for no.");

                            //asks if the user wants to buy the book
                            userResponse = userInput.nextLine().toUpperCase();
                            if (userResponse.equals("Y")){
                                bookStore.buy(book);
                                player.bag.replace(book, true);
                                System.out.println("\nEnjoy reading " + title);

                            }else if (userResponse.equals("N")){
                                bookStore.returnBook(player, book);
                                System.out.println("\nYou've returned " + title);
                            }
                            break;
                        // if the user says they want to return a book
                        case "RETURN A BOOK":
                            System.out.println("\nWhat book would you like to return?");
                            String t = userInput.nextLine().toUpperCase();
                            bookStore.returnBook(player, t);
                            break;
                        // if the user says they want to sit down
                        case "SIT DOWN":
                            bookStore.sit(player);
                            break;
                        // if the user says they want to get up
                        case "GET UP":
                            bookStore.sit(player);
                            break;
                        // if the user says they want to exit
                        case "EXIT":
                            break;
                    }
                    // book store's break
                    break;

                // if the postion is the cafe
                case "Cafe":
                    System.out.println("\nWelcome to the " + player.position);
                    cafe.showOptions();

                    userResponse = userInput.nextLine().toUpperCase();

                    // limits what the player can call to just the things cafe can perform
                    while (!userResponse.equals("BUY SOMETHING") && !userResponse.equals("SIT DOWN") && !userResponse.equals("GET UP") && !userResponse.equals("EXIT")){
                        System.out.println("Sorry, I don't recognize that response, try something else.");
                        userResponse = userInput.nextLine().toUpperCase();
                    }
                    // this switch case is based on what the user says they want to do in the cafe
                    switch(userResponse){
                        // if the user says they want to buy something from the menu
                        case "BUY SOMETHING":   
                            System.out.println("\nChoose an item from our menu. We have: " + cafe.menu);
                            String item = userInput.nextLine().toUpperCase();
                            //need to figure out how to make sure the thing we're selling them isn't yelling
                            cafe.sellItem(item);
                            break;
                        // if the user says they want to sit down
                        case "SIT DOWN":
                            cafe.sit(player);
                            break;
                        // if the user says they want to get up
                        case "GET UP":
                            cafe.sit(player);
                            break;
                        // if the user says they want to exit
                        case "EXIT":
                            break;

                    }
                    // cafe's break
                    break;
                // if the position is hair salon
                case "Hair Salon":

                    System.out.println("\nWelcome to the " + player.position);
                    hairSalon.showOptions();

                    userResponse = userInput.nextLine().toUpperCase();

                    // limits what the player can call to just the things hair salon can perform
                    while (!userResponse.equals("WASH") && !userResponse.equals("DRY") && !userResponse.equals("STYLE") && !userResponse.equals("CUT") && !userResponse.equals("EXIT")){
                        System.out.println("Sorry, I don't recognize that response, try something else.");
                        userResponse = userInput.nextLine().toUpperCase();
                    }
                    // this switch case is based on what the user says they want to do in the hair salon
                    switch(userResponse){
                        // if the user says they want a wash
                        case "WASH":
                            hairSalon.wash(player);
                            break;
                        // if the user says they want a dry
                        case "DRY":
                            hairSalon.dry(player);
                            break;
                        // if the user says they want a style
                        case "STYLE":
                            hairSalon.style(player);
                            break;
                        // if the user says they want a cut 
                        case "CUT":
                            hairSalon.cut(player);
                            break;
                        // if the user says they want to exit
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

                    // limits what the player can call to just the things nail salon can perform
                    while (!userResponse.equals("MANICURE") && !userResponse.equals("PEDICURE") && !userResponse.equals("BOTH") && !userResponse.equals("EXIT")){
                        System.out.println("Sorry, I don't recognize that response, try something else.");
                        userResponse = userInput.nextLine().toUpperCase();
                    }
                    // this switch case is based on what the user says they want to do in the nail salon
                    switch(userResponse){
                        // if the user says they want a manicure
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
                            }
                        // if the user says they want a pedicure
                        case "PEDICURE":
                        if (player.toesDone == false){
                            System.out.println("\nChoose a color from our options. We have: " + nailSalon.colors);
                            String color = userInput.nextLine();

                            nailSalon.pedicure(player);
                            System.out.println("Looks like you have a lovely " + color + " pedicure! It turned out great!\n");
                            break;
                        }else{
                            System.out.println("Looks like you already have a pedicure. Try one of our other services or a difference shop!\n");
                            break;
                        }
                        // if the user says they want both a manicure and a pedicure
                        case "BOTH":
                        if (player.nailsDone == false && player.toesDone == false){

                            //manicure tings
                            System.out.println("\nChoose a color for your nails cleafrom our options. We have: " + nailSalon.colors);
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
                            
                            //pedicure tings
                            System.out.println("\nChoose a color for your toes from our options. We have: " + nailSalon.colors);
                            String color2 = userInput.nextLine();

                            nailSalon.pedicure(player);
                            System.out.println("Looks like you have a lovely " + color2 + " pedicure! It turned out great!\n");

                            nailSalon.both(player);
                            break;
                            
                        }else if(player.nailsDone == false && player.toesDone == true){
                
                            System.out.println("Looks like you already have your toes painted. How about trying a manicure?");
                
                        }else if(player.nailsDone == true && player.toesDone == false){
                
                            System.out.println("Looks like you already have your nails painted. How about trying a pedicure?");
                
                        }else if(player.nailsDone == true && player.toesDone == true){
                
                            System.out.println("Looks like you already have your nails and toes painted. How about trying a different shop?");
                        }
                        // if the user says they want to exit
                        case "EXIT":
                            break;
                    }
                    //nail salon's break
                    break;
            }
            
            
        }while (stillPlaying);
        // Tidy up
        userInput.close();
        System.out.println("\nThanks for visiting Wellness World, " + player.name + "! Come back soon!");
        //check to see if game should end
    }
}