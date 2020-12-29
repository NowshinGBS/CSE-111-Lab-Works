import java.util.Scanner;
public class ArrayExample1
{
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    int sum=0;
    int count=0;
     int[]a=new int[3];
    while(count<a.length)
    {
      a[count]=sc.nextInt();
      sum=sum+a[count];
      count++;
    }
    System.out.println(sum);
    int i=0;
    while(i<a.length)
    {
      System.out.println(a[i]);
      i++;
    }
  }
}