import java.util.Scanner;
public class Task10
{
  public static void main (String[] args )
  {
    Scanner k=new Scanner(System.in);
    System.out.println("enter a number");
    int n;
    n=k.nextInt();
    int backup=n;
    int c;
   for (c=0; n>0; c++)
   {
     n=n/10;
   }
   int p=c-1;
     int x=1;
   int pro=1;
   for (x=1; x<=p; x++)
   {
     pro=pro*10;
   }
   n=backup;
   int d=pro;
   for ( ;n>0; d=d/10)
   {
     int r=n/d;
     System.out.println(r);
     n=n%d;
   }   
  }
}
  