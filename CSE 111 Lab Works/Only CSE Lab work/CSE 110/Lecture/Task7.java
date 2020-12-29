import java.util.Scanner;
public class Task7
{
  public static void main(String[] args)
  {
    Scanner k=new Scanner(System.in);
    int a=1;
    
    System.out.println("Please enter a number");
    int x=k.nextInt();
    int b=x/10;
    while(b>0)
    {
     b=b/10; 
      a=a+1;
      
    } 
    System.out.println(a);
  }
}