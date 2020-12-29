import java.util.Scanner;
public class Lab7task7
{
    public static void main(String[]args)
    {
        Scanner k =new Scanner(System.in);
        int []a=new int[5];
        int count=0;
        while(count<a.length)
        {
            System.out.println("type");
            a[count]=k.nextInt();
            count++;
        }
        int max=0;
        int i=0;
        while(i<a.length)
        {
            if(a[i]>max)
            {
                max=a[i];
            }
            i++;
        }
        System.out.println("largest number is "+ max);
    }
}

