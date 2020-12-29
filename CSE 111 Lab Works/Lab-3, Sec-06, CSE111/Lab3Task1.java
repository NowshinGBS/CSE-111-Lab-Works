import java.util.Scanner;
public class Lab3Task1
{
  public static void main (String [] args)
  {
    Scanner sc=new Scanner (System.in);
    int [] a=new int[10];
    for(int v=0;v<a.length;v++)
    {
      a[v]=sc.nextInt();
    }
    for(int v=a.length-1;v>=0;v--)
    {
      System.out.println(a[v]);
    }
  }
}