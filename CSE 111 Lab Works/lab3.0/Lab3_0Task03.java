import java.util.Scanner;
public class Lab3_0Task03
{
  public static void main (String [] args)
  {
    Scanner fr= new Scanner(System.in);
    int [] a= new int [10];
    int c;
    for(c=0; c<=a.length-1; c++)
    {
      System.out.println("PLease enter a number");
      a[c] = fr.nextInt();
    }
    int temp;
    int i;
    for(i=0; i<=a.length-1; i++)
    {
      int e;
      for(e=0; e<=a.length-1; e++)
      {
        if(a[i]<a[e])
        {
          temp=a[i];
          a[i]=a[e];
          a[e]=temp;
        }
        else
        {
        }
      }
    }
    for(i=a.length-1; i>=0; i--)
    {
      System.out.println(a[i]);
    }
  }
}