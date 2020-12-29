import java.util.Scanner;
public class ScannerExample
{
  public static void main(String[] args)
  {
    Scanner scgh=new Scanner(System.in);
    System.out.println("Please type a Number");
    int x;
    x=scgh.nextInt();
    int y;
    System.out.println("Please type another Number");
    y=scgh.nextInt();
                             
    int r=x+y;
    System.out.println(r);
   }
  }