import java.util.Scanner;
public class labtask4
{
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("Please type a number");
    int x;
    x=sc.nextInt();
    
    System.out.println("Please type another number");
    int y;
    y=sc.nextInt();
                       
    
    if(x>y)
      {
      int z=x-y;
      System.out.println("difference is "+z);
      }
     else
      {
       int z=y-x;
       System.out.println("difference is "+z);
      }
    
  }
}