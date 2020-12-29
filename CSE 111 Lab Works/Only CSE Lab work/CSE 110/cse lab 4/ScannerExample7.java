import java.util.Scanner;
public class ScannerExample7
{
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("Please entr a number");
    int num1;
    num1=sc.nextInt();
    
    
    if(num1% 2==0)
    {
      if(num1>10)
      {
        System.out.println("the even number is greater than 10");
      }
      else
      {
        System.out.println("the even number is less then 10");
      }
    }
    else
    {
      if (num1>10)
      {
        System.out.println("the odd number is greater than 10");
      }
      else
      {
        System.out.println("the odd number is less than 10");
      }
    }
  }
}