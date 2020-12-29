import java.util.Scanner;
public class Lab01Task04
{
  public static void main (String [] args)
  {
    
    Scanner sc=new Scanner(System.in);
    int line=sc.nextInt();
    
    int linecount;
    for(linecount=1;linecount<=line;linecount++)
    {
      int spacecount;
      for(spacecount=1;spacecount<=line-linecount;spacecount++)
      {
        System.out.print(" ");
      }
      
      int columncount;
      for(columncount=1;columncount<=linecount;columncount++)
      {
        System.out.print("*");
      }
     System.out.println();
    }
  }
}