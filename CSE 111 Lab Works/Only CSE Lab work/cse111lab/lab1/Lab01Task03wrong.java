import java.util.Scanner;
public class lab01task03wrong
{
  public static void main (String [] args)
  {
    Scanner sc=new Scanner(System.in);
    int line=sc.nextInt();
    
    int linecount;
    for(linecount=1;linecount<=line;linecount++)
    {
      int columncount;
      for(columncount=1;columncount<=line-linecount;columncount++)
      {
        System.out.print("*");
      }
      System.out.println();
    }
  }
}