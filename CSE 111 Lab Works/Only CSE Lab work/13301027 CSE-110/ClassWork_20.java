import static java.lang.System.out;
public class ClassWork_20
{
    public static void main(String[] args)
    {
        int[] array = {10, 30, 20, 50, 40};
        int c, d, sum=0, better=0;
        double avg;
        for(c=0;c<array.length;c++)
        {
            sum=sum+array[c];
        }
        avg=sum/array.length;
        for(d=0;d<array.length;d++)
        {
            if(array[d]>avg)
            {
                better++;
            }
        }
        out.println(better+" students are better than average.");
    }
}