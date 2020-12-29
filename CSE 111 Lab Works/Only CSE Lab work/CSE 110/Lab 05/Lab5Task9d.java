import java.util.Scanner;
  public class Lab5Task9d
  {
    public static void main(String[] args)
    {
    Scanner sc=new Scanner(System.in);
    
    int p=2;
    while(p<13)
    {
      if (p%4==0)
      {
    System.out.println(-p);
    }
    else
    {
    System.out.println(p);
    }
    p=p+2;
    }
  }
  }