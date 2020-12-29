import java.util.Scanner;
public class Lab3Task3
{
  public static void main (String [] args)
  {
    Scanner sc=new Scanner (System.in);
    int [] a=new int[10];
    for(int v=0;v<a.length;v++)
    {
      a[v]=sc.nextInt();
    }
    for(int v=0;v<a.length;v++)
    {
      for(int i=v+1;i<a.length;i++)
      {
        
        if(a[i]>a[v])
        {
          int temp=a[v];
          a[v]=a[i];
          a[i]=temp;
        }
      }
    }
    for(int v=0;v<a.length;v++)
    {
      System.out.println(a[v]);
    }
  }
}
          
      