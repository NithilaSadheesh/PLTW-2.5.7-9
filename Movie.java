/*
 * Activity 2.5.7
 *
 * A Book class for the MediaLibrary program
 */
public class Movie
{
  private String title;
  private double duration;
  private int rating;

  /*** Constructor ****/
  public Movie(String t, double d)
  {
    title = t;
    duration = d;
    rating = 0;
  }

   /*** Accessor methods ***/
  public String getTitle() {
    return title;
  }

  public double getDuration() {
    return duration;
  }

  public int getRating() {
    return rating;
  }

  public String toString() 
  {
    String info = "\"" + title + "\", with duration of  " + duration;
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

  public void setDuration(double d) {
    duration = d;
  }

  public boolean equals(Movie b) {
    return((this.title).equals(b.getTitle()) && (this.duration == b.getDuration()));
  }
}
