import java.util.Scanner;
public class ScannerExample4
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