import java.util.Scanner;
public class Lab04task04
{
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    System.out.print("Please enter a number");
    int num1;
    num1=sc.nextInt();
    
    System.out.print("Please enter another number");
    int num2;
    num2=sc.nextInt();
    
    int sum;
    sum=num1+num2;
    {
      System.out.print("The sum is " + sum);
    }
  }
}