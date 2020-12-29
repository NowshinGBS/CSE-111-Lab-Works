import java.util.Scanner;
public class Lab01Task16_while
{
  public static void main (String [] args)
  {
    Scanner fr=new Scanner (System.in);
    int line=fr.nextInt();
    
    int linecount=1;
    while( linecount<=line)
    {
      int spacecount=1; 
      while(spacecount<=line-linecount)
      {
        System.out.print(" ");
        spacecount++;
      }
      int columncount=1;
      while( columncount<=linecount)
      {
        System.out.print(columncount);
        columncount++;
      }
      System.out.println();
      linecount++;
    }
  }
}