import java.util.Scanner;
public class ScannerExample2
{
  public static void main(String[] args)
  {
    Scanner scgh=new Scanner(System.in);
    System.out.println("Please type a Number");
    double x;
    x=scgh.nextDouble();
    
    System.out.println("Please type another Number");
    double y;
    y=scgh.nextDouble();
                             
    double r=x+y;
    System.out.println(r);
   }
  }