import java.util.Scanner;
public class Task18
{public static void main(String[] args)
  {Scanner k=new Scanner(System.in);
  System.out.println("Please enter first number of the range");
  int n=k.nextInt();
  System.out.println("Please enter last number of the range");
  int m=k.nextInt();
 int l=0;
 int e=0;
 int primeNumber=0;
 int perfectNumber=0;
  for(int c=n;c<=m;c++)
  {
    for (int d=0; d<=c; d++)
    {
      
      if (c%d==0)
      {
      l++;
      e=l+c;
      }
    }
    if (l<3)
    { primeNumber=primeNumber+1;}
    int f=e-c;
    if (f%c==0)
    {perfectNumber=perfectNumber+1;}
  }
  System.out.print("Prime number= "+primeNumber+" Perfect number= "+perfectNumber);
}
}
  