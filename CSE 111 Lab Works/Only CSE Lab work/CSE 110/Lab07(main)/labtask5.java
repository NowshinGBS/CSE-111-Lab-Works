import java.util.Scanner;
public class labtask5
{
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("Please type a number");
    double x;
    x=sc.nextDouble();
    
    System.out.println("Please type another number");
    double y;
    y=sc.nextDouble();
    
    if(x>y)
     {
     double z=x-y;
     System.out.println("Difference is "+z);
     }
    else
     {
      double z=y-x;
      System.out.println("Difference is "+z);
     }
  }
}