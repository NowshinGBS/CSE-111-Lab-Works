import java.util.*;
import static java.lang.System.out;
public class lab6task01
{
  public static void main (String[] args)
  {
    Scanner k=new Scanner(System.in);
    out.println("please enter a number");
    int n=k.nextInt();
    int c=1;
    while(c<=n)
    {
      out.print(c+" " );
      c++;
    }
  }
}