 import java.util.Scanner;
  public class Lab5Task2
  {
    public static void main(String[] args)
    {
    Scanner sc=new Scanner(System.in);
    int num;
    int p=0;
    int sum=0;
    while (p<5)
    {
    System.out.println("Please enter a number");
    num=sc.nextInt();
    
    sum=sum+num;
    p=p+1;
    }
    
    {
    System.out.println(sum/5); 
    }
    }
  }