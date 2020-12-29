import java.util.Scanner;
public class odd
{
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    int[] a=new int[5];
    //input
    int count=0;
    while(count< a.length)
    {
      System.out.println("type");
     a[count]=sc.nextInt();
      count++;
    }
    int i=0;
    while(i<a.length)
    {
      if(i%2==0)
      {}
      else
      {System.out.println(a[i]);
      }
      i++;
      
    }
  }
}
    
    