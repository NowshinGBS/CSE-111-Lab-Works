import java.util.Scanner;

public class Task1
{
  public static void main(String[] args)
    
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("Please enter a number");
    int n= sc.nextInt();
    
    int count=1;
    while(count<=n)
    
    {
      System.out.print(count);
      count++;
    }
  }
}