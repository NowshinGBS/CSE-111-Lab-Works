import java.util.Scanner;
public class ultaa
{
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    int[] a=new int[10];
    int count=0;
    while(count< a.length)
    {
      a[count]=sc.nextInt();
      count++;
    }
    int i=a.length-1;
    while(i>=0)
    {
      System.out.println(a[i]);
      i--;
    }
  }
}