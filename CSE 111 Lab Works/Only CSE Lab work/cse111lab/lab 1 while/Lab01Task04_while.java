import java.util.Scanner;
public class Lab01Task04_while
  {
  public static void main (String [] args)
  {
    
    Scanner sc=new Scanner(System.in);
    int line=sc.nextInt();
    
    int linecount=1;
   while(linecount<=line)
    {
      int spacecount=1;
      while(spacecount<=line-linecount)
      {
        System.out.print(" ");
       spacecount++; 
      }
      
      int columncount=1;
      while(columncount<=linecount)
      {
        System.out.print("*");
        columncount++;
      }
     System.out.println();
     linecount++;
    }
  }
}