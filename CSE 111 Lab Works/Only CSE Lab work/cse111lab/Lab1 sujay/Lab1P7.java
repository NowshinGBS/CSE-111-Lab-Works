import java.util.Scanner;

public class Lab1P7
{
    public static void main(String[]args)
    {
        Scanner nun = new Scanner(System.in);
        int x,y,line,row;
        System.out.println("Type a number");
        x=nun.nextInt();
        System.out.println("Type a number");
        y=nun.nextInt();
        for(line=1;line<=x;line++)
        {
            for(row=1;row<=y;row++)
                if(line==1 || line==x || row==1 || row==y)
            {
                System.out.print("*");
            }
            else
            {
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}