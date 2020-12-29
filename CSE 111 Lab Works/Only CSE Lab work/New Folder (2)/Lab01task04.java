import java.util.Scanner;
  public class Lab01task04
{
  public static void main(String[] args)
  {
    Scanner suha=new Scanner(System.in);
    System.out.println("please enter a number");
    int line=suha.nextInt();
    int col=suha.nextInt();
    int linecount=1;
     while(linecount<=line)
     {
    int colcount=1;
    while(colcount<=col)
    {
      System.out.print("*");
      colcount++;
    }
    System.out.println();
    linecount++;
  }
  }
  }