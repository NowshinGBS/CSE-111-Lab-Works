import java.util.Scanner;
public class Lab01Task13_while
{
  public static void main (String [] args)
  {
    Scanner fr=new Scanner(System.in);
    int num1=fr.nextInt();
    int num2=fr.nextInt();
    
    int c=1;
    while(c<=num2)
    {
      int a=1;
      while(a<=num1)
      {
        System.out.print(a);
        a++;
      }
      System.out.println();
      c++;
    }
  }
}