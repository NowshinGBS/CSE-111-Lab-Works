import java.util.Scanner;
public class Lab01Task06test
{
  public static void main (String [] args)
  {
    Scanner sc=new Scanner(System.in);
    int line=sc.nextInt();
    
    int linecount;
    for(linecount=1;linecount<=line-1;linecount++)
    {
      int spacecount;
      for(spacecount=1;spacecount<=line-linecount;spacecount++)
      {
        System.out.print(" ");
      }
      int columncount;
      for(columncount=1;columncount<=2*linecount-1;columncount++)
      {
        System.out.print("*");
      }
      System.out.println();
    }
    
    
    for(linecount=1;linecount<=line;linecount++)
    {
      
      int spacecount;
      for(spacecount=1;spacecount<linecount;spacecount++)
      {
        System.out.print(" ");
      }
      int columncount;
      for(columncount=line;columncount>=2*linecount-line;columncount--)
      {
        System.out.print("*");
      }
      System.out.println();
    }
  }
}