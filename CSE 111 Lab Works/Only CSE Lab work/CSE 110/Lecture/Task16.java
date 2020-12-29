import java.util.Scanner;
public class Task16
{
  public static void main(String [] args)
  {
    Scanner k=new Scanner(System.in);
    
    System.out.println("Please enter a number");
    int n=k.nextInt();
    int l=0;
   
    for(int c=1;c<=n;c++)
    {
      if(n%c==0)
      {
        l=c+l;
      }
    }
    System.out.println("Sum of factors are "+l);
  }
}
    