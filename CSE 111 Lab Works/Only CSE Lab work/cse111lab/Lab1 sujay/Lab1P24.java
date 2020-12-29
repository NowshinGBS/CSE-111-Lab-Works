import java.util.Scanner;

public class Lab1P24
{
    public static void main(String[]args)
    {
        Scanner gun = new Scanner(System.in);
        int x,i,j;
        x=gun.nextInt();
        for(i=1;i<=x;i++)
            System.out.print(i);
        for(j=x-1;j>=1;j--)
            System.out.print(j);
        System.out.println(); 
    }
}