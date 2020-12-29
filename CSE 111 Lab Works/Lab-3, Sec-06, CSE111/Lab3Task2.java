import java.util.Scanner;
public class Lab3Task2
{
  public static void main (String [] args)
  {
    Scanner sc=new Scanner (System.in);
    int [] a=new int[10];
    for(int v=0;v<a.length;v++)
    {
      a[v]=sc.nextInt();
       System.out.print("You have entered ");
      for(int i=0;i<=v;i++)
      {
        System.out.print(a[i]+",");
      }
      System.out.println();
    }
  }
}