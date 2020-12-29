import java.util.Scanner;
public class Lab01Task21_while
{
  public static void main (String [] args)
  {
    Scanner fr=new Scanner(System.in);
    int line=fr.nextInt();
    
    int linecount=1; 
    while(linecount<=line)
    {
      int spacecount=1;
      while( spacecount<=line-linecount)
      {
        System.out.print(" ");
        spacecount++;
      }
      
      {
        int columncount=line-linecount+1;
        while( columncount<=line)
          if(columncount==line-linecount+1 || columncount==line || line==linecount)
        {
          System.out.print(columncount);
          columncount++;
        }
        else
        {
          System.out.print(" ");
          columncount++;
        }
      }
      System.out.println();
      linecount++;
    }
  }
}
