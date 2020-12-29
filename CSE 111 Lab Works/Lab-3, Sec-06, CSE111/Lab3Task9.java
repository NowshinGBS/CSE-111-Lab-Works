import java.util.Scanner;
public class Lab3Task9
{
  public static void main (String [] args)
  {
    Scanner sc=new Scanner (System.in);
    int [] a=new int[10]; 
    System.out.println("Type ten numbers");
    for(int v=0;v<a.length;v++)
    {
      a[v]=sc.nextInt();
    }
    int v;
    System.out.println("Type 'odd' or 'even' if you want to sort numbers at odd or even position or 'allnum' to sort all numbers");
    String s=sc.next();
    if(s.length()==3)
    {
      for( v=0;v<a.length;v++)
      {
        if(v%2!=0)
        {
          for(int i=v+2;i<a.length;i=i+2)
          {
            
            if(a[i]>a[v])
            {
              int temp=a[v];
              a[v]=a[i];
              a[i]=temp;
            }
          }
        }
      }
      
        for( v=0;v<a.length;v++)
        {
          if(v%2!=0)
          {
            System.out.println(a[v]);
          }
        }
      }
    if(s.length()==4)
    {
      for( v=0;v<a.length;v++)
      {
        if(v%2==0)
        {
          for(int i=v+2;i<a.length;i=i+2)
          {
            
            if(a[i]>a[v])
            {
              int temp=a[v];
              a[v]=a[i];
              a[i]=temp;
            }
          }
        }
      }
      
        for( v=0;v<a.length;v++)
        {
          if(v%2==0)
          {
            System.out.println(a[v]);
          }
        }
      }
    if(s.length()==6)
    {
      for( v=0;v<a.length;v++)
      {
          for(int i=v+1;i<a.length;i++)
          {
            
            if(a[i]>a[v])
            {
              int temp=a[v];
              a[v]=a[i];
              a[i]=temp;
            }
          }
        }
      
      
        for( v=0;v<a.length;v++)
        {
         
            System.out.println(a[v]);
        }
    }
  }
}
 





