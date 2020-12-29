import java.util.Scanner;
public class Lecture1mm
{
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    int a[]=new int[5];
    int c=0; 
    int i = 0;
    System.out.println("Enter a number");
    a[0]= sc.nextInt(); 
    int max=a[0];
    for(i=1;i<a.length;i++)
    {
      System.out.println("Please enter a number ");
      a[i] = sc.nextInt();
      
    }
    
    for(c=0;c<a.length;c++)
    {
      
      {
        if (a[c] > max)
        
        max=a[c];
        
        
      }
      
    }
    System.out.println(max);
  }
}