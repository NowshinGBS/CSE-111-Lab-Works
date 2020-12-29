import java.util.Scanner;
public class labtask2
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
     System.out.println("first is greater");
     }
    else
     {
     System.out.println("first is not greater");
    }
    
    
  }
}