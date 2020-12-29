import java.util.Scanner;

public class Lab7T11
{
    public static void main(String[]args)
    {
        Scanner k = new Scanner (System.in);
        int a[];
        a=new int[5];
        for(int c=0;c<a.length;c++)
        {
            System.out.println("Type a number");
            a[c]=k.nextInt();
        }
        for(int d=0;d<a.length;d++)
        {
            for(int f=d+1;f<a.length;f++)
            {
                int p;
                if(a[d]<a[f])
                {
                    p=a[d];
                    a[d]=a[f];
                    a[f]=p;
                }
                else
                {
                    
                }
            }
        }
        for(int s=0;s<a.length;s++)
        {
            System.out.println(a[s]);
        }
    }
}