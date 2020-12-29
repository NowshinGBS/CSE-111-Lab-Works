import java.util.Scanner;
public class Task15
{
  public static void main(String [] agrs)
  {
    Scanner k=new Scanner(System.in);
    System.out.println("Please enter a number");
    int n=k.nextInt();
    int l=0;
    for(int c=1;c<=n;c++)
    {
      if(n%c==0)
      {
        l=l+1;
      }
     
    }
    if(l<=2)
    {System.out.println(n+" is a prime number");
    }
    else 
    {System.out.println("Not a prime number");}
  }
}
    