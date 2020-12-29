import java.util.Scanner;
public class Classwork09
{
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    int num;
    num=sc.nextInt();
    int c;
    c=0;
    while(num<0)
    {
      int d;
      d=num%10;
       {
      System.out.println(d);
      }
      num=num/10;
      c++;
    }
  }
}