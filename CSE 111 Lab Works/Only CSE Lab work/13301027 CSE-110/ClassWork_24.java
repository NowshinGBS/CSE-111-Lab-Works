import java.util.*;
import static java.lang.System.out;
public class ClassWork_24
{
    public static void main(String[] args)
    {
        Scanner K = new Scanner(System.in);
        int[] array = {50, 30, 20, 10, 40};
        int c, d, location = 0;
        for(c=0;c<array.length;c++)
        {
            int max =array[c];
            for(d=c+1;d<array.length;d++)
            {
                if(array[d]>max)
                {
                    max=array[d];
                    location = d;
                }
            }
            array[location] = array[c];
            array[c] = max;
        }
        out.println("Please enter the value of n");
        int n = K.nextInt();
        out.print("The "+n+"th highest number is "+array[n-1]+".");
    }
}