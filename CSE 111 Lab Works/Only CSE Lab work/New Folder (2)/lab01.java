import java.util.Scanner;
public class lab01
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.println("Please enter a number");
int num;
num=sc.nextInt();
int x=1;

while(x<=num)
{
  System.out.print("*");
  x++;
}
}
}