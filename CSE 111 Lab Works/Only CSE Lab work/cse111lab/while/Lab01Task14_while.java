import java.util.Scanner;
public class Lab01Task14_while
{
  public static void main (String [] args)
  {
    Scanner fr=new Scanner(System.in);
    int line=fr.nextInt();
    
    int linecount=1;
   while( linecount<=line)
    {
      int columncount=1; 
      while(columncount<=linecount)
      {
        System.out.print(columncount);
        columncount++;
      }
      System.out.println();
      linecount++;
    }
  }
}