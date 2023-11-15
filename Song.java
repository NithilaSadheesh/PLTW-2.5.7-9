/*
 * Activity 2.5.7
 *
 * A Book class for the MediaLibrary program
 * @ authors - Nithila Sadheesh, Paige Nothelfer, Sanjitha Saravanan
 */
public class Song
{
  private String title;
  private int rating;

  /*** Constructor ****/
  public Song(String t)
  {
    title = t;
    rating = 0;
  }

   /*** Accessor methods ***/
  public String getTitle() {
    return title;
  }

  public int getRating() {
    return rating;
  }

  public String toString() 
  {
    String info = "\"" + title + "\"";
    if (rating != 0) 
    { 
      info += ", rating is " + rating;
    }
    return info;
  }

  public void adjustRating(int r) {
    if(r <= 10 && r >= 0) {
      rating = r;
    }
  }

  /*** Mutator methods ***/
  public void setTitle(String t) {
    title = t;
  }


  public boolean equals(Song s) {
    return((this.title).equals(s.getTitle()) && (this.rating == s.getRating()));
  }
}
