import java.util.Scanner;

public class Lab6P15
{
    public static void main (String[]args)
    {
        Scanner mum = new Scanner(System.in);
        int x,row;
        System.out.println("Type a number");
        row=mum.nextInt();
        for(x=1;x<=row;x++)
            System.out.print("*");
        System.out.println();
    }
}