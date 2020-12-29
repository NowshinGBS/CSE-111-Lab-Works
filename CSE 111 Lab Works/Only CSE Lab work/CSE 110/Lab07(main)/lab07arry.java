import java.util.Scanner;
public class lab07arry
{
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    int[] a=new int[5];
    //input
    int count=0;
    while(count<5)
    {
      a[count]=sc.nextInt();
      count++;
    }
    int i=0;
    while(i<5);
    {
      System.out.println(a[i]);
      i++;
    }
  }
}
