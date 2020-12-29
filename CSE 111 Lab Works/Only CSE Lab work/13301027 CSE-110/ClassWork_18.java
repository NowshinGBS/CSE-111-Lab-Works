import java.util.*;
import static java.lang.System.out;
public class ClassWork_18
{
    public static void main(String[] args)
    {
        Scanner K = new Scanner(System.in);
        out.println("Please enter the start of range.");
        int start = K.nextInt();
        out.println("Please enter the end of range.");
        int end = K.nextInt();
        int c, num, prime = 0, perfect = 0;
        for(num=start;num<=end;num++)
        {
            int sum = 0, count = 0;
            for(c=1;c<num;c++)
            {
                if(num%c==0)
                {
                    count++;
                    sum = sum+c;
                }
            }
            if(count>1)
            {
            }
            else
            {
                prime++;
            }
            if(sum==num)
            {
                perfect++;
            }
            else
            {
            }
        }
        out.println("There are "+prime+" prime numbers and "+perfect+" perfect numbers in this range.");
    }
}