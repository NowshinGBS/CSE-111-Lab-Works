import java.util.Scanner;
public class Task1Lab6
{
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("Please enter a number");
    int n=sc.nextInt();
    int counter=1;
    while(counter<n)
    {
      System.out.print("*");
      counter=counter+1;
    }
    System.out.println();
  }
}
    