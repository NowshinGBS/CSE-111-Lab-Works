import java.util.*;
public class Lab08Task03
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    int[] a = new int[10];
    
    int count = 0;
    while(count<a.length-1)
    {
      a[count]= sc.nextInt();
      count++;
      
    }
    int m= a.length-1;
    while(m>=0)
    {
      System.out.println(a[m]);
      m--;
    }
  }
}
