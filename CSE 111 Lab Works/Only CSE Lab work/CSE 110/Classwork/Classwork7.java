import java.util.Scanner;
public class Classwork7
{
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    int num;
    System.out.println("Please enter a number");
    num=sc.nextInt();
    int c;
    c=0;
    while(num>0)
    {
      num=num/10;
      c=c+1;
    }
    {
      System.out.println(c);
    }
  }
}