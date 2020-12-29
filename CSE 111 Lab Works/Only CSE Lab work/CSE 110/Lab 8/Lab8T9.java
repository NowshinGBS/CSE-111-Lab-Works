import java.util.Scanner;

public class Lab8T9
{
    public static void main(String[]args)
    {
        Scanner k = new Scanner(System.in);
        int a[];
        a=new int[10];
        for(int c=0;c<a.length;c++)
        {
            System.out.println("Type a number");
            a[c]=k.nextInt();
        }
        for(int d=0;d<a.length;d=d+2)
        {
            System.out.println(a[d]);
        }
        for(int s=1;s<a.length;s=s+2)
        {
            System.out.println(a[s]);
        }
    }
}