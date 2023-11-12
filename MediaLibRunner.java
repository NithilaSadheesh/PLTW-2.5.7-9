/*
 * Activity 2.5.7
 * 
 * The runner for the MediaLibrary program
 */
public class MediaLibRunner
{
  public static void main(String[] args)
  {/*
    System.out.println("Welcome to your Media Library");
    MediaLib myLib = new MediaLib();

    Book myBook = new Book("Lord of The Rings", "Tolkien");
    System.out.println("Book created " + myBook);

    myLib.addBook(myBook);
    System.out.println("Library:\n" + myLib);

    int myRating = 5;
    myBook.adjustRating(myRating);
    System.out.println(myBook);

    myBook.setTitle("The Hobbit"); //Step 12
    System.out.println("Book:" + myBook); // Step 13
    System.out.println("Library: " + myLib);*/

    /*
     * Activity 2.5.7
     */
    System.out.println("You have a NEW Library");
    MediaLib myLib2 = new MediaLib();

    Book newBook = new Book("To Kill a Mockingbird", "Lee");
    myLib2.addBook(newBook);
    //System.out.println(myLib2);
    newBook = new Book("1984", "Orwell");
    //System.out.println(myLib2);

    /*System.out.println("before test:" + newBook);
    myLib2.testBook(newBook);
    System.out.println("after test:" + newBook);*/

    Book newBook2 = new Book("To Kill a Mockingbird", "Lee");
    System.out.println(newBook2.equals(newBook)); 
    // System.out.println(newBook.title.equals(newBook2.title)); 

    //System.out.println(newBook2.title); - SHOWS ERROR (28)

    Movie newMovie1 = new Movie("The Matrix", 1.6);
    Movie newMovie2 = new Movie("The Godfather", 3);
    myLib2.addMovie(newMovie1);
    myLib2.addMovie(newMovie2);
    System.out.println(myLib2);
    System.out.println(newMovie1.equals(newMovie2));
    
  }
}