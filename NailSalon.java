import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class NailSalon extends Salon implements NailSalonContract{
    
    ArrayList<String> colors = new ArrayList<String>();
    ArrayList<String> lengths =  new ArrayList<String>();
    ArrayList<String> shapes =  new ArrayList<String>();
    ArrayList<String> menu = new ArrayList<String>(Arrays.asList("Manicure", "Pedicure", "Both"));

    public NailSalon(){
        
        //surely there has to be a better way to do this
        // read files in 
        colors.add("Red");
        colors.add("Orange");
        colors.add("Yellow");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Pink");
        colors.add("Purple");
        colors.add("White");
        colors.add("Black");
        colors.add("Nude");
        colors.add("Grey");

        lengths.add("Short");
        lengths.add("Medium");
        lengths.add("Long");
        lengths.add("XLong");
        lengths.add("XXLong");

        shapes.add("Almond");
        shapes.add("Stiletto");
        shapes.add("Square");
        shapes.add("Coffin");
        shapes.add("Flare");
        shapes.add("Oval");

        System.out.println("\nHello! Welcome to our nail salon! Please choose one of the services from our menu:");
        System.out.println(menu + "\n");//i want this to output not in a list format
    }

    // choose color, legth, and style and change player's attribute
    // check first if nails are already done
    public void manicure(Player player){

        if (player.nailsDone == false){

            Scanner sc = new Scanner(System.in);

            System.out.println("\nChoose a color from our options. We have: " + colors);

            String color = sc.nextLine(); //will need to convert scanner to an if/else so that it won't take jsut anything in 
            System.out.println("OMG, " + color + " is my favorite color!\n");

            System.out.println("Choose a length from our options. We have: " + lengths);
            String length = sc.nextLine();
            System.out.println("\nAh, " + length + " is a great choice!\n");

            System.out.println("Now, what shape would you like? You can choose from: " + shapes);
            String shape = sc.nextLine();
            System.out.println("\nOh I love " + shape + " on you!\n");

            sc.close();

            System.out.println("Looks like you have a beatiful set of " + length + ", " + shape + ", " + color + " nails! They look great!\n");
            player.nailsDone = true;
            
        }else if(player.nailsDone == true){ //change to exception later(?) except that's not how games work 

            System.out.println("Looks like you already have a manicure. Try one of our other services or a different shop!\n");
        } 
    }

    // choose color and change player's attribute
    // check first if toes are already done
    public void pedicure(Player player){

        if (player.toesDone == false){

            Scanner scan = new Scanner(System.in);

            System.out.println("\nChoose a color from our options. We have: " + colors);

            String color = scan.nextLine();
            System.out.println("Ooh, I love " + color + "!\n");

            scan.close();

            System.out.println("Looks like you have a lovely " + color + " pedicure! It turned out great!\n");
            player.toesDone = true;

        }else{

            System.out.println("Looks like you already have a pedicure. Try one of our other services or a different shop!\n");
        }   
    }

    // run both mani and pedi and change player's attribute
    // check first the status of nails/toes being done
    public void both(Player player){ // call manicure() or pedicure() instead of having the full code out 

        if (player.nailsDone == false && player.toesDone == false){

            // manicure (player);
            // pedicure(player); //this actually might not work bc of the scanners

            Scanner sc = new Scanner(System.in);

            System.out.println("\nLet's start with a manicure.");
            System.out.println("Choose a color from our options. We have: " + colors);

            String ncolor = sc.nextLine(); //will need to convert scanner to an if/else so that it won't take jsut anything in 
            System.out.println("OMG, " + ncolor + " is my favorite color!\n");

            System.out.println("Choose a length from our options. We have: " + lengths);
            String length = sc.nextLine();
            System.out.println("\nAh, " + length + " is a great choice!\n");

            System.out.println("Now, what shape would you like? You can choose from: " + shapes);
            String shape = sc.nextLine();
            System.out.println("\nOh I love " + shape + " on you!\n");

            System.out.println("Looks like you have a beatiful set of " + length + ", " + shape + ", " + ncolor + " nails! They look great!\n");

            System.out.println("Now, time for a pedicure.");
            System.out.println("\nChoose a color from our options. We have: " + colors);

            String pcolor = sc.nextLine();
            System.out.println("Ooh, I love " + pcolor + "!\n");

            System.out.println("Looks like you have a lovely " + pcolor + " pedicure! It turned out great!\n");

            sc.close();

            player.nailsDone = true;
            player.toesDone = true;

        }else if(player.nailsDone == false && player.toesDone == true){

            System.out.println("Looks like you already have your toes painted. How about trying a manicure?");

        }else if(player.nailsDone == true && player.toesDone == false){

            System.out.println("Looks like you already have your nails painted. How about trying a pedicure?");

        }else if(player.nailsDone == true && player.toesDone == true){

            System.out.println("Looks like you already have your nails and toes painted. How about trying a different shop?");
        }
    }

    public static void main(String[] args) {

        Player mack = new Player("Mack");
        NailSalon nails = new NailSalon();
        System.out.println(mack.nailsDone);
        // nails.manicure(mack);
        // nails.pedicure(mack);
        nails.both(mack);
        nails.manicure(mack);
        nails.pedicure(mack);
        
    }
}
