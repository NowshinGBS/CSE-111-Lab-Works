import java.util.Scanner;
public class ScannerExample5
{
  public static void main(String[] args)
  {
  Scanner sc=new Scanner(System.in);
  System.out.println("Please entr a number");
  double num1;
  num1=sc.nextDouble();

  System.out.println("Please enter a number");
  double num2;
  num2=sc.nextDouble();
  
  if(num1>num2)
  {
  System.out.println(num1-num2);
  }
  else
  {
  if(num1<num2)
  {
   System.out.println(num2-num1); 
  }
  else
  {
    System.out.println("Equal");
  }
  }
}
}