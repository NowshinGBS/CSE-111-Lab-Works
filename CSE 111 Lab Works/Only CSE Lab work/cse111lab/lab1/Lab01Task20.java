import java.util.Scanner;
public class Lab01Task20
{
  public static void main (String [] args)
  {
    Scanner fr=new Scanner(System.in);
    int line=fr.nextInt();
    
    int linecount;
    for(linecount=1; linecount<=line; linecount++)
    {
      int columncount;
      for(columncount=1; columncount<=linecount;columncount++)
        if(columncount==1 || columncount==linecount || linecount==line)
      {
        System.out.print(columncount);
      }
      else
      {
      System.out.print(" ");
      }
      System.out.println();
    }
  }
}