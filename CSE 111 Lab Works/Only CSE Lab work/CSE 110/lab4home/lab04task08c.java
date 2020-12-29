import java.util.Scanner;
public class lab04task08c
{
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    int num;
    num=sc.nextInt();
    
    if(num%2==0)
    {
      if(num%5==0)
      {
        System.out.println("The number is "+num);
      }
    }
    else
    {
    }
  }
}