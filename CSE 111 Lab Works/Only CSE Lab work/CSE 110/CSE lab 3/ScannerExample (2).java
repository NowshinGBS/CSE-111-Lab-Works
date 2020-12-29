import java.util.Scanner;
public class ScannerExample
{
  public static void main(String[] args)
  {
  Scanner sc=new Scanner(System.in);
  System.out.println("Please Enter a Number");
  int x;
  x= sc.nextInt();
  
  System.out.println("Please Enter Another Number");
  int y;
  y= sc.nextInt();
  
  int r=x+y;
  
  System.out.println("The Sum is "+r);
  }
}