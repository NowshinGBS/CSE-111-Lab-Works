import java.util.Scanner;
public class Lab3Task4
{
  public static void main (String [] args)
  {
    Scanner sc=new Scanner (System.in);
    int [] a=new int[10];
    for(int v=0;v<a.length;)
    {
      int x=sc.nextInt();
      if(v>=1)
      {
        int flat=0;
        for(int i=0;i<v;i++)
        {
          if(a[i]==x)
          {
            System.out.println(a[i]+"  is already in among the entered numbers");
            flat=1;
            break;
         
          }          
        }
        if(flat==0)
        {
          a[v]=x;
          v++;
        }
      }
      else
      {
        a[0]=x;
        v++;
      }   
    }
    for(int v=0;v<a.length;v++)
    {
      System.out.println(a[v]);
    }
  }
}
          
    