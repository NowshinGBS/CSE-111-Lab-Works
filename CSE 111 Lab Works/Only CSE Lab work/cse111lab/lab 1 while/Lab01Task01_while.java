import java.util.Scanner;
public class Lab01Task01_While
{
  public static void main(String [] args)
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("PLease enter a number");
    int num=sc.nextInt();
    int c;
    c=1;
    while(c<=num)
    {
      System.out.print("*");
      c++;
    }
  }
}