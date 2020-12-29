import java.util.Scanner;
public class ArrayExampleee4
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
    int i=0;
    while(i<a.length)
    {
      if(a[i]%2 ==0)
      {
      System.out.println(a[i]);
      
      }
      i++;
    }
  }
}