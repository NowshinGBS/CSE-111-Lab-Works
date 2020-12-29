import java.util.Scanner;
public class ScannerExample2
{
  public static void main(String[] args)
  {
  Scanner sc=new Scanner(System.in);
  System.out.println("Please entr a number");
  int num1;
  num1=sc.nextInt();

  System.out.println("Please enter a number");
  int num2;
  num2=sc.nextInt();
  
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
