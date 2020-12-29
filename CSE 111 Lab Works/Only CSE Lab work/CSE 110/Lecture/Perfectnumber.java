import java.util.Scanner;
public class Perfectnumber
{
  public static void main(String[] args)
  {
    Scanner k=new Scanner(System.in);
    System.out.println("Please enter a number");
    int n=k.nextInt();
    int l=0;
    for(int c=1;c<n;c++)
    {
      if(n%c==0)
      {
        l=l+c;
      }
    }
    if(l==n)
    {
    System.out.println(n+" is a perfect number");}
    else
    {
      System.out.println(n+" is a not perfect number");
    }
  }
}
      