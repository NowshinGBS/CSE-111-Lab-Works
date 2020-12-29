public class Task6
{
  public static void main(String [] args)
  {
    int a=0;
    int sum=0;
    while (a<600)
    {
      if(a%7==0)
      {if(a%9!=0)
        
        {sum=sum+a;}
    }
      else if(a%9==0)
      {sum=sum+a;}
    a++;
    }System.out.println(sum);
  }
}