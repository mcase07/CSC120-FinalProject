import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class NailSalon extends Salon { //needs implements NailSalonContract
    
    // ArrayList<String> nailStyles = new ArrayList<String>();
    //length shape color
    ArrayList<String> colors = new ArrayList<String>();
    ArrayList<String> lengths =  new ArrayList<String>();
    ArrayList<String> shapes =  new ArrayList<String>();
    ArrayList<String> menu = new ArrayList<String>(Arrays.asList("Manicure", "Pedicure", "Both"));

    public NailSalon(){
        
        //surely there has to be a better way to do this
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
        System.out.println(menu);//i want this to output not in a list format
    }

    public void manicure(){//String color, String length, String shape

        Scanner sc = new Scanner(System.in);

        System.out.println("\nChoose a color from our options. We have: " + colors);

        String color = sc.nextLine();
        System.out.println("OMG, " + color + " is my favorite color!\n");

        System.out.println("Choose a length from our options. We have: " + lengths);
        String length = sc.nextLine();
        System.out.println("\nAh, " + length + " is a great choice!\n");

        System.out.println("Now, what shape would you like? You can choose from: " + shapes);
        String shape = sc.nextLine();
        System.out.println("\nOh I love " + shape + " on you!\n");

        sc.close();

        System.out.println("Looks like you have a beatiful set of " + length + ", " + shape + ", " + color + " nails! They look great!");

    }


    public static void main(String[] args) {

        NailSalon nails = new NailSalon();
        // System.out.println(nails.colors);
        // System.out.println(nails.lengths);
        // System.out.println(nails.shapes);
        nails.manicure();


    }
}
