import java.util.Scanner;
public class Lab4task8_2
{
  public static void main(String []args)
  {
  Scanner sc= new Scanner(System.in);
  System.out.println("Enter a Number");
  int x= sc.nextInt();
  
  if(x%2==0)
   {
    if(x%5==0)
     {
     }
    else
     {
     System.out.println("The Number is a multiple of either 2 or 5 but not the both");
     }
    }
  else
   {
   if(x%5==0)
    {
    System.out.println("The Number is a multiple of either 2 or 5 but not the both");
    }
   else
    {
    }
  }
 }
}