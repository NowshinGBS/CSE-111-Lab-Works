import java.util.Scanner;
  public class Lab06task01
{
  public static void main(String[] args)
  {
    Scanner suha=new Scanner(System.in);
    System.out.println("please enter a number");
    int n=suha.nextInt();
    int count=1;
    while(count<=n)
    {
      System.out.print(count);
      count++;
    }
  }
  }
  
  
  