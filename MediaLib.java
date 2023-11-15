// PLTW CODE
/*
 * Activity 2.5.9
 */
public class MediaLib
{
  public static String owner = "PLTW";

  private static int numEntries;
  private static int numBooks;
  private static int numMovies;
  private static int numSongs;

  private Book book;
  private Movie movie;
  private Song song;
  private String date;

  public MediaLib() {
    date = LastModified.getDate();
  }

  public void addBook(Book b)
  {
    if (book == null)
    {
      book = b;
      numEntries++;
      numBooks++;
    } 
    else
      System.out.println("Cannot add a new book: A book already exists");
  }

  public void addMovie(Movie m)
  {
    if (movie == null)
    {
      movie = m;
      numEntries++;
      numMovies++;
    }
    else
      System.out.println("Cannot add a new movie: A movie already exists");
  }

  public void addSong(Song s)
  {
    if (song == null)
    {
      song = s;
      numEntries++;
      numSongs++;
    }
    else
      System.out.println("Cannot add a new song: A song already exists");
  }

  public static String getOwner()
  {
    return owner;
  }

  public static void changeOwner(String o)
  {
    owner = o;
  }

  public static int getNumEntries()
  {
    return numEntries;
  }

  public static int getNumBooks()
  {
    return numBooks;
  }

  public static int getNumMovies()
  {
    return numMovies;
  }

  public static int getNumSongs()
  {
    return numSongs;
  }

  public String toString() 
  {
    String info = "";

    if (book != null)
      info += "Book: " + book + "\n";
    if (movie != null)
      info += "Movie: " + movie + "\n";
    if (song != null)
      info += "Song: " + song + "\n";

    info += "Date Added: " + date + "\n";

    return info;
  }
}




// OUR CODE
/**
 * Activity 2.5.7
 * 
 * A MediaLib class for the MediaLibrary program
 * @ authors - Nithila Sadheesh, Paige Nothelfer, Sanjitha Saravanan
public class MediaLib
{
  private Book book;
  private Movie movie;
  private Song song;
  public static String owner = "PLTW";
  private static int numEntries;

  public void addBook(Book b)
  {
    // Step 22 + 23
    if (book == null) {
      book = b;
    } else {
      // Step 24
      System.out.println("A book has already been added to this library.");
    }
    numEntries++; //Step 15
  }

  public void addMovie(Movie m) 
  {
    // Step 22 + 23
    if (movie == null) {
      movie = m;
    } else {
      // Step 24
      System.out.println("A movie has already been added to this library.");
    }
    numEntries++; //Step 15
  }

  public void addSong(Song s) 
  {
    // Step 22 + 23
    if (song == null) {
      song = s;
    } else {
      // Step 24
      System.out.println("A Song has already been added to this library.");
    }
    numEntries++; //Step 15
  }

  public String toString() 
  {
    String info = "";
    info = book.toString() + ", " + movie.toString() + ", " + song.toString();

    return info;
  }

  void testBook(Book tester) {
    tester.setTitle("The Fellowship of the Ring");
    System.out.println("testBook: " + tester);
  }

  public static String getOwner() {
    return owner;
  }

  public static void changeOwner(String o) {
    owner = o;
  }

  public static int getNumEntries() {
    // System.out.println("Test: Owner is " + owner);
    // System.out.println("Book: " + book);
    // System.out.println("Movie: " + movie);
    return numEntries;
  }

}
*/