import java.util.Scanner;
public class Lab01Task23_while
{
  public static void main (String [] args)
  {
    Scanner fr=new Scanner(System.in);
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
      while( columncount<=2*linecount-1)
        if(columncount==1 || columncount==2*linecount-1 )
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
      linecount++ ;
    }
   linecount=1; 
    while(linecount<line)
    {
      int spacecount=1;
      while( spacecount<=linecount)
      {
        System.out.print(" ");
        spacecount++;
      }
      int columncount=1;
      while( columncount<=2*line-(2*linecount+1))
        if(columncount==1 || columncount==2*line-(2*linecount+1))
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
      linecount++ ;
    }
  }
}
