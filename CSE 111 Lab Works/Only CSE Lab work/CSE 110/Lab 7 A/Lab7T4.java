import java.util.Scanner;

public class Lab7T4
{
    public static void main(String[]args)
    {
        Scanner k = new Scanner(System.in);
        int a[];
        a = new int[10];
        int c,d;
        for(c=0;c<=a.length-1;c++)
        {
            System.out.println("Type a number");
            a[c]=k.nextInt();
        }
        for(d=0;d<=a.length-1;d++)
        {
            if(a[d]%2!=0)
            {
                continue;
            }
            else
            {
                System.out.println(a[d]);
                break;
            }
        }
    }
}