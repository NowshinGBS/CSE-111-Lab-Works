import static java.lang.System.out;
public class ClassWork_19
{
    public static void main(String[] args)
    {
        int[] array = {10, 30, 20, 50, 40};
        int c, d, sum=0;
        double avg;
        int max =array[0];
        int min =array[0];
        for(c=1;c<array.length;c++)
        {
            if(array[c]>max)
            {
                max=array[c];
            }
        }
        for(d=0;d<array.length;d++)
        {
            if(array[d]<min)
            {
                min=array[d];
            }
            sum=sum+array[d];
        }
        avg=sum/array.length;
        out.println("The Highest mark is "+max+", lowest mark is "+min+", and average is "+avg);
    }
}