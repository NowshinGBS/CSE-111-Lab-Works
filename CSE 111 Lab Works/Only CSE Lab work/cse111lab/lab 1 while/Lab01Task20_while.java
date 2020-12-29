import java.util.Scanner;
public class Lab01Task20_while
{
  public static void main (String [] args)
  {
    Scanner fr=new Scanner(System.in);
    int line=fr.nextInt();
    
    int linecount=1;
    while( linecount<=line)
    {
      int columncount=1;
      while( columncount<=linecount)
        if(columncount==1 || columncount==linecount || linecount==line)
      {
        System.out.print(columncount);
        columncount++;
      }
      else
      {
      System.out.print(" ");
      columncount++;
      }
      System.out.println();
      linecount++;
    }
    
  }
}