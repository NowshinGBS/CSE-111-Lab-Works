import java.util.Scanner;


public class Lab1P16
{
    public static void main(String[]args)
    {
        Scanner nun = new Scanner(System.in);
        int x,y,z,line;
        System.out.println("Type a number");
        line=nun.nextInt();
        for(x=1;x<=line;x++)
        {
            for(y=1;y<=line-x;y++)
             System.out.print(" ");
            for(z=1;z<=x;z++)
                System.out.print(z);
            System.out.println();
        }
    }
}