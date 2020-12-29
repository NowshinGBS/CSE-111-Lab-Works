  import java.util.Scanner;
  public class Lab5Task5
  {
    public static void main(String[] args)
    {
    Scanner sc=new Scanner(System.in);
    int num;
    int p=0;
    while(p<20)
    {
      System.out.println("Please enter a number");
      num=sc.nextInt();
      
      if (num%2==0)
      {
        System.out.println("even number");
      }
      else
      {
      System.out.println("odd number");
      }
      p=p+1;
    }  
    }
  }