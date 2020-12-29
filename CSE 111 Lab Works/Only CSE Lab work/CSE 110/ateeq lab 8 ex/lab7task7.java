import java.util.Scanner;
public class lab7task7
{
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    int[] a=new int[5];
    int count=0; 
    while(count<a.length)
    {
      a[count]=sc.nextInt();
      count++;
    }
    int i=0;
    int max=a[0];
    while(i<a.length)
    {
      if(a[i]>max)
      {
        max=a[i];
      }
      i++;
    }
    System.out.println(max);
  }
  
}
