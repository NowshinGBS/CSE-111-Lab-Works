import java.util.Scanner;

public class Lab6P14
{
    public static void main(String[]args)
    {
        Scanner g = new Scanner (System.in);
        int x,a,b,c,d;
        System.out.println("Type a number");
        x=g.nextInt();
        for(a=1;a<=x;a++)
        {
            for(b=1;b<=x-a;b++)
                System.out.print(" ");
            for(c=1;c<=a;c++)
                System.out.print(c);
            for(d=a-1;d>=1;d--)
                System.out.print(d);
            System.out.println();
        }
    }
}