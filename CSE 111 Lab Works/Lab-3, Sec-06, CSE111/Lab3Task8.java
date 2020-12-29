import java.util.Scanner;
public class Lab3Task8
{
  public static void main(String [] args)
  {
    Scanner sc=new Scanner(System.in);
    int [] a=new int [10];
    
    for(int v=0;v<a.length;v++)
    {
      a[v]=sc.nextInt();
    }
    for(int v=0;v<a.length;v++)
    {
      int counter=0;
      int sum=0;
      for(int i=0;i<a.length;i++)
      {
        if(a[i]==a[v])
        {
          counter=counter+1;
        }
      }
      for(int j=0;j<=v;j++)
      {
        if(a[j]==a[v])
        {
          sum=sum+1;
        }
      }
      if(counter>=2)
      {
        if(counter<=4)
        {
          if(sum==1) 
          {
            System.out.println(a[v]);
          }
        }
      }
    }
  }
}
