import java.util.ArrayList;

public class Bookstore extends Building {

  ArrayList<String> menu = new ArrayList<String>();
  public ArrayList<String> books = new ArrayList<String>(); // change to be called inventory
  public Boolean seat = false;

  // same thing as in cafe - quick fix!
  // now the scanner will be able to read things bc they need to be in caps
  public ArrayList<String> titles = new ArrayList<String>();

  /**
   * Bookstore constructor that sets a name and inherets from Building class
   * @param name name of the book store
   */
  public Bookstore(String name) {
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

  /**
   * Overriding the showoptions method inhereted from building class
   */
  @Override
  public void showOptions() {
    // TODO Auto-generated method stub
    super.showOptions();
    System.out.println(" + Choose a Book\n + Return a Book\n + Sit Down\n + Get Up\n");
  }

  /**
   * Removes a given book from the books array list
   * @param name name of the book that's being bought
   */
  //do we need this?? it might be accounted for somewhere else
  public void buy(String name) {
    this.books.remove(name);
  }

  /**
   * Lets a player select a book before buying it
   * The book gets put in the player's bag with a boolean indicated whether or not it's been purchased
   * @param player player who's selecting the book
   * @param name name of the book 
   * @return returns the title of the book as a string
   */
  public String chooseBook(Player player, String name) {
    if (this.titles.contains(name)) { // checking if this is in book collection

      //matches up the title to the book name w author
      int i = this.titles.indexOf(name);
      this.titles.remove(name); // removes the book from collection -- will also need to manipulate menu...or not...
      player.bag.put(name, false); // put the book in the bag, saying it hasn't been purchased
      String title = books.get(i);
      System.out.println("\n" + title + " is availiable to look at");

      return title;

    } else { // if the 'book' isn't in the collection, prints the string below
      int i = this.titles.indexOf(name);
      String title = books.get(i);
      System.out.println("\n" + title + " is not available to read at the moment");

      return title;
    }
  }

  /**
   * Lets a player return a book 
   * @param player player who's returning a book
   * @param name name of the book the player is returning
   */
  public void returnBook(Player player, String name) {
    if (player.bag.contains(name) == true) {

      int i = this.titles.indexOf(name);
      String title = books.get(i);

      player.bag.remove(name);
      this.titles.add(name);

      System.out.println("\nYou have successfully returned " + title);
    } else {
      System.out.println("\nYou don't have that book to return.");
    }
  }

  /**
   * Allows a player to sit down & changes their attribute
   * Checks to see if they're already sitting
   * @param player Player that's sitting
   */
  public void sit(Player player) {
    if (player.isSitting == true) {

      System.out.println("\nYou are already sitting down.");

    } else if (player.isSitting == false) {
        player.isSitting = true;
        System.out.println("\nYou are now sitting down.");
    }
  }
  
  /**
   * Allows a player to get up & changes their attribute
   * Checks to see if they're already standing
   * @param player Player that's standing
   */
  public void getUp(Player player) {
    if (player.isSitting == false) {

      System.out.println("\nYou are already standing.");

    } else if (player.isSitting == true) {
        player.isSitting = false;
        System.out.println("\nYou are now standing up.");
    }
  }
}
