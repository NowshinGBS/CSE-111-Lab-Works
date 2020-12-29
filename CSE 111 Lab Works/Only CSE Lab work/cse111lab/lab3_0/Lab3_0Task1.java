import java.util.Scanner;
public class Lab3_0Task1
{
public static void main(String[] args)
{
Scanner sc= new Scanner(System.in);
int [] a= new int[10];
int c;
for(c=0;c<=9;c++)
{
System.out.println("type a number");
a[c]=sc.nextInt();
}
for(c=9;c>=0;c--)
{
System.out.println(a[c]);
}
}
}
