import java.util.*;
import static java.lang.System.out;
public class ClassWork_26
{
    public static void main(String[] args)
    {
        Scanner K = new Scanner(System.in);
        out.println("How many numbers?");
        int n = K.nextInt();
        int[] array =new int[n];
        for(int c =0;c<array.length;c++)
        {
            out.println("Please enter the numbers.");
            array[c] =K.nextInt();
        }
        int c, d, midden, location = 0;
        double mid;
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
        if(n%2==0)
        {
            mid = (array[n/2] + array[(n/2)-1])/2;
            out.print("The midden is "+mid+".");
        }
        else
        {
            midden = n/2;
            out.print("The midden is "+array[midden]+".");
        }
    }
}