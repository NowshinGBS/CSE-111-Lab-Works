import java.util.Scanner;
public class Lab01Task15
{
  public static void main (String [] args)
  {
    Scanner fr=new Scanner(System.in);
    int line=fr.nextInt();
    
    int linecount;
    for(linecount=1; linecount<=line; linecount++)
    {
      int spacecount;
      for(spacecount=1; spacecount<=line-linecount; spacecount++)
      {
        System.out.print(" ");
      }
      {
        int columncount;
        for(columncount=line-linecount+1; columncount<=line;columncount++)
        {
          System.out.print(columncount);
        }
        System.out.println();
      }
    }
  }
}