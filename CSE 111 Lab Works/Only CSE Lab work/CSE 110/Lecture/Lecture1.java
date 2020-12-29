import java.util.Scanner;
public class Lecture1
{
  public static void main(String[] args)
  {
  Scanner sc=new Scanner(System.in);
  int a[]=new int[5];
  int c=0;

int i = 0;
  for(i=0;i<a.length;i++)
{
System.out.println("Please enter a number ");
      a[c] = sc.nextInt();

}

  int max=a[0];
  for(c=0;c<a.length;c++)
  {
    
    {
    if (a[c]<max)
     
      max=a[c];
      
    
  }System.out.println(max);
   
  }
}
}