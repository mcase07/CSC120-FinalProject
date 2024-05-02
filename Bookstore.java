import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Scanner;

public class Bookstore extends Building {

  ArrayList<String> menu = new ArrayList<String>();
  public ArrayList<String> books = new ArrayList<String>(); //change to be called inventory
  public Boolean seat = false;
  public Hashtable<String, Boolean> bag = new Hashtable<String, Boolean>();

  //same thing as in cafe - quick fix!
  //now the scanner will be able to read things bc they need to be in caps
  public ArrayList<String> titles = new ArrayList<String>();


  public Bookstore (String name){ 
    super(name);

    books.add("Parable of the Sower by Octavia Butler");
    books.add("Kindred by Octavia Butler");
    books.add("Bloodchild and Other Stories by Octavia Butler");
    books.add("Dawn by Octavia Butler");
    books.add("Patternmaster by Octavia Butler");
    books.add("Imago by Octavia Butler");
    books.add("True to the Game by Teri Woods");
    books.add("Dutch III by Teri Woods");
    books.add("Dutch by Teri Woods");
    books.add("Alibi by Teri Woods");
    books.add("In the Meantime by Iyanla Vanzant");
    books.add("Acts Of Faith: Meditations For People of Color by Iyanla Vanzant");
    books.add("The Spirit of a Man by Iyanla Vanzant");
    books.add("Black Economics by Jawanza Kunjufu");
    books.add("Educating Black Girls by Jawanza Kunjufu");

    titles.add("PARABLE OF THE SOWER");
    titles.add("KINDRED");
    titles.add("BLOODCHILD AND OTHER STORIES");
    titles.add("DAWN");
    titles.add("PATTERNMASTER");
    titles.add("IMAGO");
    titles.add("TRUE TO THE GAME");
    titles.add("DUTCH III");
    titles.add("DUTCH");
    titles.add("ALIBI");
    titles.add("IN THE MEANTIME");
    titles.add("ACTS OF FAITH: MEDITATIONS FOR PEOPLE OF COLOR");
    titles.add("THE SPIRIT OF A MAN");
    titles.add("BLACK ECONOMICS");
    titles.add("EDUCATING BLACK GIRLS");
  }
  

  @Override
  public void showOptions() {
    // TODO Auto-generated method stub
    super.showOptions();
    System.out.println(" + Choose a Book\n + Return a Book\n + Sit Down\n + Get Up\n");
  }

  public void buy(String name){
    this.books.remove(name);
  }

  public void chooseBook(Player player, String name){
    if(this.titles.contains(name)){ // checking if this is in book collection
      this.titles.remove(name); //removes the book from collection
      System.out.println(name + " is availiable to look at"); //prints book
    }
    // if the 'book' isn't in the collection, prints the string below
    else{
      System.out.println(name + " is not available to read at the moment"); //prints book + ____ 
    }

    this.bag.put(name, false);

    Scanner input = new Scanner(System.in);
    String response = "";

    System.out.println("\nWould you like to purchase book in your bag? Enter Y for yes, N for no.");
    response = input.nextLine().toUpperCase();

    if (response.equals("Y")){
      this.buy(name);
      this.bag.replace(name, true);
      System.out.println("\nEnjoy reading " + name);
      input.close();
    }else if (response.equals("N")){
      this.returnBook(player, name);
      System.out.println("\nYou've returned " + name);
      input.close();
    }
    
    }

  public void returnBook(Player player, String name){
    if(this.bag.contains(name) == true){
      this.titles.add(name);
    }
    else {
    System.out.println("You don't have a book to return.");
    }
  }

public void sit(Player player){
  if(player.isSitting == true){
    System.out.println("You are already sitting down.");}
    else {
      if(player.isSitting == false){
        player.isSitting = true;
        System.out.println("You are now sitting down.");
      }
    }
    }
  
public void getUp(Player player){
  if(player.isSitting == false){
    System.out.println("You are already standing.");
  }
  else{
    if(player.isSitting == true){
      player.isSitting = false;
      System.out.println("You are now standing up.");
  }
}
}
public static void main(String[] args) {
  Bookstore bookStore = new Bookstore("Book Store");
  Player player = new Player("me");

   bookStore.showOptions();

   bookStore.returnBook(player, "KINDRED");
 }

}

  