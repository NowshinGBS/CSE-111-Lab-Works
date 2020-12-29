import java.util.Scanner;

public class Lab1Task25_while
{
    public static void main(String[]args)
    {
        Scanner fr = new Scanner (System.in);
        int x=fr.nextInt();
        System.out.println("Type a number");
        int a=1;
        while(a<=x)
        {
          int b=1;
            while(b<=x-a)
                System.out.print(" ");
            b++;
            int c=1;
            while(c<=a)
                System.out.print(c);
            c++;
            int d=a-1;
            while(d>=1)
                System.out.print(d);
            d--;
            System.out.println();
            a++;
        }
    }
}