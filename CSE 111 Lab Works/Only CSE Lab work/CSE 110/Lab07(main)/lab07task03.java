import java.util.Scanner;
public class lab07task03
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
   int i=0;
   while(i<a.length)
   {
     if (a[i]%2!=0)
     {
       System.out.print(a[i]);
       break;
     }
     i++;
   }
  }
}
