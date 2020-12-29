import java.util.Scanner;
public class Lab04task03
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.println("Please enter a number");
int num1;
num1=sc.nextInt();

System.out.println("Please enter anotheer number");
int num2;
num2=sc.nextInt();

if(num1>num2)
{
System.out.println("First is greater");
}
else
{
  if(num1<num2)
  {
  System.out.println("Second is greater");
  }
  else
  {
  System.out.println("The numbers are equal");
  }
  }
}
}