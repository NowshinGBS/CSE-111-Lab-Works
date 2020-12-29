import java.util.Scanner;
public class lab8task5
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
    System.out.println("Please enter another num");
    int x=sc.nextInt();
    int i=0;
    int found=0;
    while(i<a.length)
    {
      if(a[i]==x)
      {
        found=1;
      }
      i++;
    }
    if(found==1)
    {
      System.out.println("yes");
    }
    else
    {
      System.out.println("no");
    }
  }
}
      