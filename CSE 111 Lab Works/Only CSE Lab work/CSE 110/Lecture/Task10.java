import java.util.Scanner;
public class Task10
{
  public static void main(String[] args)
  {
    Scanner k=new Scanner(System.in);
      System.out.println("Please enter a number");
      int n=k.nextInt();
      int c=0;
      double x=1;
      while(n>0)
      {
        n=n/10;
        c++;
      }
      c=c-1;
      x=Math.pow(10,c);
      while(n>0)
      {
        System.out.println(n/x);
        n=n%x;
        x=x/10;
      }
      
      
      
      
  }
}
        