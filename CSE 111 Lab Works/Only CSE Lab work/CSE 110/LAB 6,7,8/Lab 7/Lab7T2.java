import java.util.Scanner;

public class Lab7T2
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
        System.out.println("Type a number between 0-9");
        d=k.nextInt();
        System.out.println(a[d]);
    }
}