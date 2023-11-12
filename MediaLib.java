/**
 * Activity 2.5.7
 * 
 * A MediaLib class for the MediaLibrary program
 */
public class MediaLib
{
  private Book book;
  private Movie movie;

  public void addBook(Book b)
  {
    book = b;
  }

  public void addMovie(Movie m) 
  {
    movie = m;
  }

  public String toString() 
  {
    String info = "";
    info = book.toString() + ", " + movie.toString();

    return info;
  }

  void testBook(Book tester) {
    tester.setTitle("The Fellowship of the Ring");
    System.out.println("testBook: " + tester);
  }

}