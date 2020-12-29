import java.util.Scanner;
public class ScannerExample6
{
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("Please entr a number");
    int num1;
    num1=sc.nextInt();
    
    
    if(num1% 2==0)
    {
      System.out.println("the number is even");
    }
    else
    {
      System.out.println("the number is odd");
    }
  }
}