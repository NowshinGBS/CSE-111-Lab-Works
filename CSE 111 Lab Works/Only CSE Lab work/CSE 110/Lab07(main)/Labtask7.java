import java.util.Scanner;
public class Labtask7
{
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("Please type a number");
    int x;
    x=sc.nextInt();
    
    if(x>10)
     {
      if(x%2==0)
       {
        System.out.println("An even number greater than 10");
       }
      else
       {
        System.out.println("An odd number greater than 10");
       }
     }
    else
     {
      if(x%2==0)
       {
        System.out.println("An even number not greater than 10");
       }
      else
       {
        System.out.println("an odd number not greater than 10");
       }
     }
  }
}