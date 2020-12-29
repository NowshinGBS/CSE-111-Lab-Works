import java.util.Scanner;
public class lab8task3
{
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    int[] a=new int[10];
    int count=0;
    while(count<a.length)
    {
      a[count]=sc.nextInt();
      count++;
    }
    int pi=a.length-1;
    while(pi>=0)
    {
      System.out.println(a[pi]);
      pi--;
    }
  }
}