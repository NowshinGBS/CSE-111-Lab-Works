import java.util.Scanner;
public class Lab01Task11
{
  public static void main (String [] args)
  {
    Scanner fr=new Scanner(System.in);
    int line=fr.nextInt();
    
    int linecount;
    for(linecount=1; linecount<=line; linecount++ )
    {
      int spacecount;
      for(spacecount=1; spacecount<=line-linecount; spacecount++)
      {
        System.out.print(" ");
      }
      int columncount;
      for(columncount=1; columncount<=2*linecount-1; columncount++)
        if(columncount==1 || columncount==2*linecount-1 )
      {
        System.out.print("*");
      }
      else
      {
        System.out.print(" ");
        
      }
      System.out.println();  
    }
    for(linecount=1; linecount<line; linecount++ )
    {
      int spacecount;
      for(spacecount=1; spacecount<=linecount; spacecount++)
      {
        System.out.print(" ");
      }
      int columncount;
      for(columncount=1; columncount<=2*line-(2*linecount+1); columncount++)
        if(columncount==1 || columncount==2*line-(2*linecount+1))
      {
        System.out.print("*");
      }
      else
      {
        System.out.print(" ");
      }
      System.out.println(); 
    }
  }
}
