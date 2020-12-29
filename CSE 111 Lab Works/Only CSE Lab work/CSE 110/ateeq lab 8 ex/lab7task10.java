import java.util.Scanner;
public class lab7task10
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
    while(i<a.length)
    {
      int j=1;
      while(j<a.length-1)
      {
        if(a[j]>a[j+1])
        {
          int temp=a[j];
          a[j]=a[j+1];
          a[j+1]=temp;
        }
        j++;
      }
      i++;
    }
    int pi=0;
    while(pi<a.length)
    {
      System.out.println(a[pi]);
      pi++;
    }
    
  }
}
      
      
      
        