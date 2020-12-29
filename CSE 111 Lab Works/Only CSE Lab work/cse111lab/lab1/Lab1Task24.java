import java.util.Scanner;

public class Lab1Task24
{
    public static void main(String[]args)
    {
        Scanner fr= new Scanner(System.in);
        int x=fr.nextInt();
        int y;
        for(y=1;y<=x;y++)
            System.out.print(y);
        int z;
        for(z=x-1;z>=1;z--)
            System.out.print(z);
        System.out.println(); 
    }
}