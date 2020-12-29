import java.util.Scanner;
public class ScannerExample2
{
  public static void main(String[] args)
  {
  Scanner sc=new Scanner(System.in);
  System.out.println("Please Enter a Number");
  double x;
  x= sc.nextDouble();
  
  System.out.println("Please Enter Another Number");
  double y;
  y= sc.nextDouble();
  
  double s=x+y;
  double p=x*y;
  double d=x-y;
  System.out.println("The Sum is "+s);
  System.out.println("The Product is "+p);
  System.out.println("The Differece is "+d);
  }
}