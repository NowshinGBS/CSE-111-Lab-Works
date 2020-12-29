import java.util.Scanner;
public class Lab01Task13
{
  public static void main (String [] args)
  {
    Scanner fr=new Scanner(System.in);
    int num1=fr.nextInt();
    int num2=fr.nextInt();
    
    int c;
    for(c=1;c<=num2;c++)
    {
      int a;
      for(a=1;a<=num1;a++)
      {
        System.out.print(a);
      }
      System.out.println();
    }
  }
}