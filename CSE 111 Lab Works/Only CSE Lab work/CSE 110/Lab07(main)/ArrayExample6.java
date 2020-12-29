import java.util.Scanner;
public class ArrayExample6
{
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    
    int count=0;
     int[]a=new int[10];
    while(count<a.length)
    {
      a[count]=sc.nextInt();
      count++;
    }
    int i=a.length-1;
    while(i<a.length)
    {
      if(a[i]%2 !=0)
      {
      System.out.println(a[i]);
      break;
      }
      i--;
    }
  }
}