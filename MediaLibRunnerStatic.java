/*
 * Activity 2.5.7
 *
 * A runner class for the MediaLibrary program with static variables and methods
 * @ authors - Nithila Sadheesh, Paige Nothelfer, Sanjitha Saravanan
 */
public class MediaLibRunnerStatic {
    //Step 1
    public static void main(String[] args)
    {
      System.out.println(MediaLib.getOwner() + "'s Library");
      MediaLib.changeOwner("DEDA"); 
      //Step 8
      System.out.println(MediaLib.getOwner() + "'s Library");
      MediaLib.owner = "Schick";
      System.out.println(MediaLib.getOwner() + "'s Library");
      //Step 14 - prints 0 because instance of MediaLib has not get been created, therefore static variables are not affected
      System.out.println(MediaLib.getNumEntries() + " Entries");
  
      MediaLib lib1 = new MediaLib();
      Movie mov1 = new Movie("Harry Potter", 2.2);
      lib1.addMovie(mov1);
  
      //Step 17 
      System.out.println("MediaLib 1: " + MediaLib.getNumEntries() + " entries");
  
      MediaLib lib2 = new MediaLib();
      Book book1 = new Book("Lord of the Flies", "Golding");
      lib2.addBook(book1);
  
      //Step 17
      System.out.println("MediaLib 2: " + MediaLib.getNumEntries() + " entries");
  
      // Step 28
      Song song1 = new Song("The Twist");
      lib2.addSong(song1);
      System.out.println("MediaLib 2: " + MediaLib.getNumEntries() + " entries");
      
    }
  }
  