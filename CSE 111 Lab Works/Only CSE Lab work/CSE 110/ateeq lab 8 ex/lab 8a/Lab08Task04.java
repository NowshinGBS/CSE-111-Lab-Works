import java.util.*;
public class Lab08Task04
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    int[] a = new int[20];
    
    int count = 0;
    while(count<a.length)
    {
      a[count]= sc.nextInt();
      count++;
      
    }
    int m= a.length-1;
    while(m>=0)
    {
      if(a[m]%2==0)
      {
      System.out.println(a[m]);
      }
      m--;
    }
  }
}
