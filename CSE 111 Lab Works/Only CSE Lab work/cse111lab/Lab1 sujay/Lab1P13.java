import java.util.Scanner;

public class Lab1P13
{
    public static void main (String[]args)
    {
        Scanner mum = new Scanner(System.in);
        int x,y,line,row;
        System.out.println("Type a number");
        line=mum.nextInt();
        System.out.println("Type a number");
        row=mum.nextInt();
        for(y=1;y<=line;y++)
        {
        for(x=1;x<=row;x++)
            System.out.print(x);
        System.out.println();
        }
    }
}