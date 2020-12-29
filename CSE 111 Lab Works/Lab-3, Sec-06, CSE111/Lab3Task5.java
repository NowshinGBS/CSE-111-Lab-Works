import java.util.Scanner;
public class Lab3Task5
{
  public static void main (String [] args)
  {
    Scanner sc=new Scanner (System.in);
    System.out.println("Enter the value of R");
    double r=sc.nextDouble();
    System.out.println("Enter the value of L");
    double l=sc.nextDouble();
    System.out.println("Enter the value of C");
    double c=sc.nextDouble();
    System.out.println("Enter the value of f");
    double f=sc.nextDouble();
    System.out.println("Enter the value of E");
    double e=sc.nextDouble();
    double I=e/(Math.sqrt(Math.pow(r,2)+Math.pow(2*Math.PI*f*l-1/(2*Math.PI*f*c),2)));
    System.out.println(I);
  }
}
    
    