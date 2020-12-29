import java.util.Scanner;
public class Lab01Task19
{
  public static void main (String [] args)
  {
    Scanner fr=new Scanner(System.in);
    int line=fr.nextInt();
    
    int linecount;
    for(linecount=1; linecount<=line; linecount++)
    {
      int columncount;
      for(columncount=1; columncount<=line+1; columncount++)
        if(columncount==1 || columncount==line+1 || linecount==1 || linecount==line)
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