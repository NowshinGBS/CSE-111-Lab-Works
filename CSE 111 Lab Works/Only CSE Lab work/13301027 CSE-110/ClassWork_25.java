import static java.lang.System.out;
public class ClassWork_25
{
    public static void main(String[] args)
    {
        int[] array = {50, 30, 20, 10, 40};
        int c, d, e, location = 0;
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
        for(e=0;e<array.length;e++)
        {
            out.print(array[e]+", ");
        }
    }
}