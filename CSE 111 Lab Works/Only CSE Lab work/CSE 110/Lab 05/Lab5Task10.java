import java.util.Scanner;
  public class Lab5Task10
  {
    public static void main(String[] args)
    {
    Scanner sc=new Scanner(System.in);
    
    int p=0;
    int sum=0;
    while(p<601)
    {
      if (p%7==0)
      {
        if (p%9==0)
        {
        sum=sum+p;
        }
      }
    p=p+1;
    }
    System.out.println(sum);
    }
  }