import java.util.Scanner;
public class Lab06prmd3
{
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("enter a number");
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
      int colcount=1;
      while(colcount<=2*linecount)
      {
        System.out.print("*");
        colcount++;
      }
      System.out.println();
      linecount++;
    }
  }
}

      
    