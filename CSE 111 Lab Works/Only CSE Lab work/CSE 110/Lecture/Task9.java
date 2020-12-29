import java.util.Scanner;

public class Task9
{
  
  public static void main(String [] args)
  {
    Scanner k=new Scanner (System.in);
    System.out.println("Please enter a number");
    int x=k.nextInt();
    int c=0;
    int p=0;
    while(x>0)
    {
      p=x%10;
      System.out.print(p+",");
      x=x/10;
      c++;
    }
  }
}

