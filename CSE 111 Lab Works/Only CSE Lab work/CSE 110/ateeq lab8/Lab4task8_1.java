import java.util.Scanner;
public class Lab4task8_1
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
       }
      else
       {
       System.out.println("The number is a multiple of either 2 or 5");
       }
     }
    else
    {
      if(x%5==0)
       {
       System.out.println("The number is a multiple of either 2 or 5");
       }
      else
       {
       }
    }
  }
}