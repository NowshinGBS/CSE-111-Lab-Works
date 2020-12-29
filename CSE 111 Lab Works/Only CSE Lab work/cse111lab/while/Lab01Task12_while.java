import java.util.Scanner;
public class Lab01Task12_while
{
  public static void main (String [] args)
  {
    Scanner sc=new Scanner(System.in);
    int num=sc.nextInt();
    
    int c;
    c=1;
    while(c<=num)
    {
      System.out.print(c);
      c++;
    }
  }
}