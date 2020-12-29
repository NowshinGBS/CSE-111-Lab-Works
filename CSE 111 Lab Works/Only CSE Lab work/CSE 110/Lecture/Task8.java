import java.util.Scanner;
public class Task8
{
  public static void main(String[] args)
  {
    Scanner k=new Scanner (System.in);
    int x=k.nextInt();
    int a=1;
    int prod=1;
    while(a<=x)
    {
      prod=10*prod;
      a++;
    }
    System.out.println(prod);
  }
}
