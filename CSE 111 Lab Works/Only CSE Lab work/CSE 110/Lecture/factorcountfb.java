import java.util.Scanner;
import static java.lang.System.out;
public class factorcountfb
{
public static void main (String[] args)
{
Scanner input = new Scanner(System.in);
int num, factorcount = 0;
out.println("Enter a number");
num = input.nextInt();
for(int c =1 ; c <= num ; c++)
{
if(num%c==0)
{
factorcount = factorcount + 1;
}
}
out.println(factorcount);
}
}