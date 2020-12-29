import java.util.Scanner;
public class ArrayExample2
{
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    
    int count=0;
     int[]a=new int[10];
    while(count<a.length)
    {
      a[count]=sc.nextInt();
      count++;
    }
    System.out.println("Please enter a number between (0-9)");
    int k=sc.nextInt();
    System.out.println(a[k]);
  
  }
}