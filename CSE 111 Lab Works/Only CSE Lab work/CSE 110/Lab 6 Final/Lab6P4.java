import java.util.Scanner;


public class Lab6P4
{
    public static void main(String[]args)
    {
        Scanner nun = new Scanner(System.in);
        int x,y,line;
        System.out.println("Type a number");
        line=nun.nextInt();
        for(x=line;x>=1;x--)
        {
            for(y=1;y<=line;y++)
                if(x>y)
            {
                System.out.print(" ");
            }
            else
            {
                System.out.print(y);
            }
            System.out.println();
        }
    }
}