import java.util.Scanner;
public class Lab4task8_3
{
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("Please type a number");
    int x;
    x=sc.nextInt();
    
    if(x%2==0)
    {
      if(x%5==0)
        {
        System.out.println("The number is a multiple of both 2 and 5");
        }
        
    }
    
    
  }
}