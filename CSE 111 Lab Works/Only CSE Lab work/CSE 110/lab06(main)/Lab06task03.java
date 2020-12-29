import java.util.Scanner;
public class Lab06task03
{
  public static void main(String[] args)
  {
    Scanner suha=new Scanner(System.in);
    System.out.println("enter a number");
    int n=suha.nextInt();
    int count=1;
    while(count<=n)
    {
      System.out.print("*");
      count++;
    }
  }
}

    