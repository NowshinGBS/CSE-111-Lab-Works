 import static java.lang.System.out;
import java.util.*;
public class task9m
{
public static void main ( String [] args )
{
Scanner k=new Scanner ( System.in);
out.println("dao");
int number=k.nextInt();
int c=0;
for( int i=0; number>0; i++)
{
c=number%10;
out.print(c+",");
number=number/10;
}
}
}