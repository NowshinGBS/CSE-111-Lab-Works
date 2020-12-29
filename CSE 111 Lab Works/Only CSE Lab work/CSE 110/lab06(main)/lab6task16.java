import java.util.*;
import static java.lang.System.out;
public class lab6task16
{
  public static void main (String[] args)
  {
    Scanner k=new Scanner(System.in);
   out.println("please enter a line");
    int r=k.nextInt();
     out.println("please enter a row");
    int n=k.nextInt();
    
    int d=1;
    while(d<=r)
    {
      int c=1;
      while(c<=n)
      {
        out.print("* " );
        c++;
      }
       out.println();
       
      d++;
    }
  }
}