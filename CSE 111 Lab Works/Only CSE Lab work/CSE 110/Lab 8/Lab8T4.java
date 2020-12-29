import java.util.Scanner;

public class Lab8T4
{
    public static void main(String[]args)
    {
        Scanner k = new Scanner(System.in);
        int a[];
        a=new int[4];
        for(int c=0;c<a.length;c++)
        {
            System.out.println("Type a number");
            a[c]=k.nextInt();
        }
        for(int d=a.length-1;d>=0;d--)
        {
            if(a[d]%2==0)
            {
            System.out.println(a[d]);
            }
        }
    }
}