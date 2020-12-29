import java.util.Scanner;
public class Lab4task8_5
{
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("Please type a number");
    int x;
    x=sc.nextInt();
    
    if(x%2!=0 || x%5!=0)
     {
     System.out.println("the number is not a multiple of 2 or not a multiple of 5");
     }
   }
 }