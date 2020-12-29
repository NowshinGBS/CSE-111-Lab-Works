import java.util.*;
import static java.lang.System.out;
public class lab6task06
{
  public static void main (String[] args)
  {
    Scanner k=new Scanner(System.in);
   out.println("please enter a line");
    int r=k.nextInt();
   int s=1;
    int d=1;
    while(d<=r)
    {
      int c=1;
      while(c<=s)
      {
        out.print(c+ " " );
        c++;
      }
      s++;
       out.println();
       
      d++;
    }
  }
}