import java.util.Scanner;
public class lab07arrytask01
{
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    int[] a=new int[3];
    //input
    int count=0;
    int sum=0;
    
    while(count<a.length)
    {
      a[count]=sc.nextInt();
      sum=sum+a[count];
      count++;
    }
    int i=0;
    
      System.out.println(sum);
      while(i<a.length)
     {
       System.out.println(a[i]);
       i++;
     }
    
  }
}
