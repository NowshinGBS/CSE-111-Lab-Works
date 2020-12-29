import java.util.Scanner;
public class lab04task08b
{
  public static void main (String[] args)
  {
    Scanner sc=new Scanner(System.in);
    int num;
    num=sc.nextInt();
    
    if(num%2==0)
    {
      if(num%5==0)
      {
      }
      else
      {
        System.out.println(+num);
      }
    }
    else
    {
      if(num%5==0)
      {
        System.out.println(+num);
      }
      else
      {
      }
      //ami ()er vitore +num or num je kono 1ta dite pari kono problem hobe na,dui khetre result eki asbe
    }
  }
}