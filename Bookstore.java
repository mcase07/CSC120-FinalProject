import java.util.ArrayList;
import java.util.Hashtable;

public class Bookstore {
    ArrayList<String> menu = new ArrayList<String>();
    private Hashtable<String, Boolean> books; //change to be called inventory

public Bookstore (){
    books.put("Parable of the Sower by Octavia Butler" , true);
    books.put("Kindred by Octavia Butler", true);
    books.put("Bloodchild and Other Stories by Octavia Butler", true);
    books.put("Dawn by Octavia Butler", true);
    books.put("Patternmaster by Octavia Butler", true);
    books.put("Imago by Octavia Butler", true);
    books.put("True to the Game by Teri Woods", true);
    books.put("Dutch III by Teri Woods", true);
    books.put("Dutch by Teri Woods", true);
    books.put("Alibi by Teri Woods", true);
    books.put("In the Meantime by Iyanla Vanzant", true);
    books.put("Acts Of Faith: Meditations For People of Color by Iyanla Vanzant", true);
    books.put("The Spirit of a Man by Iyanla Vanzant", true);
    books.put("Black Economics by Jawanza Kunjufu", true);
    books.put("Educating Black Girls by Jawanza Kunjufu", true);
}

public void menu(){ //this will in main
    menu.add("Browse");
    menu.add("Buy");
    System.out.println( "Hi Welcome to or Bookstore! Here is our menu: " + this.menu);
}

//get rid of browse
// Check out a book in 'books'
public void Browse(String name){
    if(this.books.contains(name)){ // checking if this is in book collection
      if(this.books.get(name)){ //gets the book from collection
      System.out.println(name + "is availiable to look at"); //prints book
      }
    }
    // if the 'book' isn't in the collection, prints the string below
    else{
      System.out.println(name + "is not available to browse at the moment"); //prints book + ____
 
          }
  }

  public void Buy(String name){ //goodbye this is in player now 
    if(this.books.contains(name)){ // checking if this is in book collection
      if(this.books.get(name)){ //gets the book from collection
      System.out.println(name + "is availiable to buy"); //prints book
    // pay()
      }
    }
    // if the 'book' isn't in the collection, prints the string below
    else{
      System.out.println(name + "is not available to buy at the moment, try looking for another book."); //prints book + ____
          }
  }

  //the only method we have in the class will be 
  // chooseBook()


}  //implement contract last