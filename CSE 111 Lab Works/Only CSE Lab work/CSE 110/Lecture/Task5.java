public class Task5
{
  public static void main (String [] args)
  {
    int sum=0;
    int a=0;
    while(a<600)
    {
      if(a%7==0)
      {
        sum=sum+a;
      }
        else if(a%9==0)
        {
          sum=sum+a;  
        }
        else{}
        a++;
    }System.out.println(sum);
  }
}
  
          