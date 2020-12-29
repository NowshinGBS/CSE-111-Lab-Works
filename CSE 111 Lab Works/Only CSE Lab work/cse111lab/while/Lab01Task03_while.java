import java.util.Scanner;
public class Lab01Task03_while
  {
  public static void main (String [] args)
  {
    Scanner sc=new Scanner(System.in);
    int line=sc.nextInt();
    
    int linecount=1;
    while(linecount<=line)
    {
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