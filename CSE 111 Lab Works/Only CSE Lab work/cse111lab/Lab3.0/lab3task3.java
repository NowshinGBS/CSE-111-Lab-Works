import java.util.Scanner;
public class lab3task3
{
  public static void main(String []args)
  {
    Scanner sc=new Scanner(System.in);
    int a[]= new int [10];
   
    for (int c=0; c<a.length; c++)
    {
      System.out.println("Type a number");
      a[c]=sc.nextInt();
    }
    for (int d=0; d<a.length; d++)
    {
      for(int e=d+1; e<a.length; e++)
      {
        int location;
        if(a[d]<a[e])
        {
        location=a[d];
        a[d]=a[e];
        a[e]=location;
        }
        else
        {}
    }
    }
    for (int f=0; f<a.length; f++)
    {
    System.out.print(a[f]+" ");
    }
  }
}