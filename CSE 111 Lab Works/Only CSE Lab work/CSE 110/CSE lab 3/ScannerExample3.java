import java.util.Scanner;
public class ScannerExample3
{
  public static void main(String[] args)
  {
  Scanner sc=new Scanner(System.in);
  System.out.println("Please Enter the Radius");
  double x;
  x= sc.nextDouble();
  
  double c=2*Math.PI*x;
  double a=Math.PI*Math.pow(x,2);
  System.out.println("Circumference is "+c);
  System.out.println("Area is "+a);
  }
}