import java.util.Scanner;
public class lab3_0task04
{
  public static void main(String[] args)
  {
    Scanner fr= new Scanner(System.in);
    int [] a= new int [5];
    int i; 
    for(i=0; i<=4; i++)
    {
      int j=0;
      for(int c=0; c<=a.length-1; c++)
      {
        System.out.println("Please enter a number");
        a[c]=fr.nextInt();
        if(a[c]==i)
        {
          j=j+1;
          if(j!=0)
          {
            System.out.println("You can't enter this number again");
          }
          else
          { 
          }
        }
        else
        {
        }
      }
    }
    int d;
    for(d=0; d<=a.length-1; d++)
    {
      System.out.println(a[d]);
    }
  }
}
