import java.util.Scanner;
public class ScannerExample5a
{
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("Please entr a number");
    Double num1;
    num1=sc.nextDouble();
    
    System.out.println("Please enter a number");
    double num2;
    num2=sc.nextDouble();
    
    if(num1>num2)
    {
      System.out.println("first is greater");
    }
    else
    {
      System.out.println("first is not greater"); 
    }
    
  }
}
