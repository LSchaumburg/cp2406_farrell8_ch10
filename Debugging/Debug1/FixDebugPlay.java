package Debug1;

public class FixDebugPlay
{
   protected String playTitle;
   protected String playAuthor;

   public FixDebugPlay(String title, String author)
   {
      playTitle = title;
      playAuthor = author;
   }
   public void display()
   {
      System.out.println("The performance is " + playTitle +
        " by " + playAuthor);
   }
}