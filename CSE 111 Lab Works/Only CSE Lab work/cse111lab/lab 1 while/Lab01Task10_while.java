import java.util.Scanner;
public class Lab01Task10_while
{
  public static void main (String [] args)
  {
    Scanner sc=new Scanner(System.in);
    int line=sc.nextInt();
    
    int linecount=1;
   while( linecount<=line)
    {
      int spacecount;
        for(spacecount=1; spacecount<=line-linecount; spacecount++)
      {
        System.out.print(" ");
      }
      int columncount=1; 
      while(columncount<=2*linecount-1)
        if(columncount==1 || columncount==2*linecount-1 || linecount==line )
      {
        System.out.print("*");
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