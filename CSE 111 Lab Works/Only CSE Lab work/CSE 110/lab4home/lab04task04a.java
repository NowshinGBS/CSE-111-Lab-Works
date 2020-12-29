import java.util.Scanner;
public class lab04task04a
{
  public static void main (String[] args)
  {
    Scanner sc=new Scanner(System.in);
    int num1;
    num1=sc.nextInt();
    
    int num2;
    num2=sc.nextInt();
    
    int subtract;
    
    if(num1>num2)
      
    { 
      System.out.print("Subtract is " +(num1-num2));
    }
    
    else
    {
      if(num2>num1)
      {
        System.out.print("Subtract is "+(num2-num1));
      }
    }
  }
}
