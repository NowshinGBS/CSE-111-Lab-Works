import java.util.Scanner;
public class n2
  
{
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("please enter a line");
    int line=sc.nextInt();
    System.out.println("Please enter a col");
    int col=sc.nextInt();
    
    int linecount=1;
    while(linecount<=line)
      
    {
      int colcount=1;
      while(colcount<=col)
    
    {
      System.out.print(colcount);
      colcount++;
    } 
    
      System.out.print(linecount);
      linecount++;
    }
  }
}
