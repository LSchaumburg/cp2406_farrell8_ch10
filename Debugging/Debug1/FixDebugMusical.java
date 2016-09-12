package Debug1;

public class FixDebugMusical extends FixDebugPlay
{
   protected String composer;
   
   FixDebugMusical(String title, String author, String comp)
   {
      super(title, author);
      composer = comp;
   }
   public void display()
   {
      System.out.println("The performance is " + playTitle +
        " by " + playAuthor + "\nThe music for " + playTitle + " is by " + composer);
   }
}