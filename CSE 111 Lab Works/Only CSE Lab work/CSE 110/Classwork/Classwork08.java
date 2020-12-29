import java.util.Scanner;
public class Classwork08
{
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    int num;
    
      num=sc.nextInt();
    int c;
    int product;
    c=0;
    product=1;
    while(c<num)
    {
      
      
      product=product*10;
      c=c+1;
    }
    {
      System.out.println(product);
    }
  }
}