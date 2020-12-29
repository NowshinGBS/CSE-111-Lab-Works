import java.util.Scanner;
public class Lab3_0Task2
{
  public static void main(String[] args)
  {
    Scanner sc= new Scanner(System.in);
    int [] a= new int[10];
    int c;
    for( c=0; c<=9; c++)
    {
 
      a[c]=sc.nextInt();
      System.out.print("You have entered"+" ");
      for(int i=0; i<=c; i++)
      {
        System.out.print(a[i]+" ");
        
        if (i==c)
        {
          System.out.print(".");
        }
        else
        {
          System.out.print(",");
        }
      }
    }
  }
}
