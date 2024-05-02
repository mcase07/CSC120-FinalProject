import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Scanner;

public class Bookstore extends Building {

  ArrayList<String> menu = new ArrayList<String>();
  private ArrayList<String> books = new ArrayList<String>(); //change to be called inventory
  public Boolean seat = false;
  public Hashtable<String, Boolean> bag;



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
  }

  @Override
  public void showOptions() {
    // TODO Auto-generated method stub
    super.showOptions();
    System.out.println("\n + chooseBook()\n + returnBook()\n + sit()\n + getUp()\n");
  }

  public void buy(String name){
    this.books.remove(name);
  }

  public void chooseBook(String name){
    if(this.books.contains(name)){ // checking if this is in book collection
      this.books.remove(name); //removes the book from collection
      System.out.println(name + "is availiable to look at"); //prints book
    }
    // if the 'book' isn't in the collection, prints the string below
    else{
      System.out.println(name + "is not available to read at the moment"); //prints book + ____ 
    }

    this.bag.put(name, false);

    Scanner input = new Scanner(System.in);
    System.out.println("Would you like to purchase book in your bag?");
    input.nextLine();
    if (input.equals ("y")){
      this.buy(name);
      this.bag.replace(name, true);

    }









    //player needs to be able to purchase book in order for the value to turn true


//     if(this.bag.contains(name) == false){
//       return name;
//       this.books.remove(name);
//       System.out.println("You have not paid for this book, it is not in your bag.");}

//     if(this.bag.contains(name) == true){
// // turn false to true?
//       this.name.add(bag);
//       System.out.println("This book had been paid for and is now if your bag");
    }





  public void returnBook(Player player, String name){
    if(player.bag.contains(name) == true){
      this.books.add(name);
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

}

  // public static void main(String[] args) {
  //  Bookstore bookStore = new Bookstore("Book Store");
  //   bookStore.showOptions();
  // }