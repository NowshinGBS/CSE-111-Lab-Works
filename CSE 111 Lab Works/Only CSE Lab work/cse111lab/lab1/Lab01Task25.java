import java.util.Scanner;
public class Lab01Task25
{
    public static void main(String[]args)
    {
        Scanner fr= new Scanner (System.in);
        int x=fr.nextInt();
        System.out.println("Type a number");
        int a;
        for(a=1;a<=x;a++)
        {
          int b;
            for(b=1;b<=x-a;b++)
                System.out.print(" ");
          int c;
            for(c=1;c<=a;c++)
                System.out.print(c);
            int d;
            for(d=a-1;d>=1;d--)
                System.out.print(d);
            System.out.println();
        }
    }
}