import java.util.Scanner;
public class lab02
{
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("Please enter a number");
    int num1=sc.nextInt();
      int x=1;
    System.out.println("Please enter another number");
    int num2=sc.nextInt();
  
    int y=1;
    
    while(y<=num2)
    {
      x=1;
      while(x<=num1)
      {
        System.out.print("*");
        x++;
      }
      System.out.println();
      y++;
    }
  }
}
