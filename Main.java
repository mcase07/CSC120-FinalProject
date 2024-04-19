public class Main {


    public static void main(String[] args) {
        
        System.out.println("\nWelcome to Wellness World. This is a shopping center that you can explore! Make purchases, get services done, and enjoy!\n");
        System.out.println("The Hair Salon is to the north.");
        System.out.println("The Nail Salon is to the south.");
        System.out.println("The Book Store is to the east.");
        System.out.println("The Cafe is to the west.");
        System.out.println("\nEnter a direction to move and start exploring!");

        Player Player1 = new Player("Me");
        Player1.move("EAST");
        System.out.println(Player1.move("EAST"));
        //call move when they choose 

    }
    
}
