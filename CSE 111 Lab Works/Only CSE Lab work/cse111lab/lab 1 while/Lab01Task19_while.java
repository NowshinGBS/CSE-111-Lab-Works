import java.util.Scanner;
public class Lab01Task19_while
{
  public static void main (String [] args)
  {
    Scanner fr=new Scanner(System.in);
    int line=fr.nextInt();
    
    int linecount=1;
    while(linecount<=line)
    {
      int columncount=1;
      while( columncount<=line+1)
        if(columncount==1 || columncount==line+1 || linecount==1 || linecount==line)
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