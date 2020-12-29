import java.util.Scanner;
public class Lab04task02
{
  public static void main(String[] args)
  {
    Scanner f=new Scanner(System.in);
    System.out.println("Please entre a number");
    int num1;
    num1=f.nextInt();
    
    System.out.println("Please enter another number");
    int num2;
    num2=f.nextInt();
    
    if(num1>num2)
    {
      System.out.println("First is greater than second");
    }
    else
    {
      System.out.println("Second is greater than first");
    }
  }
}