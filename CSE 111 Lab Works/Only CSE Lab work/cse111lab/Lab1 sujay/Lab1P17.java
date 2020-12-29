import java.util.Scanner;

public class Lab1P17
{
    public static void main(String[]args)
    {
        Scanner nun = new Scanner(System.in);
        int line,row,num,x;
        System.out.println("Type a number");
        x=nun.nextInt();
        for(line=1;line<=x;line++)
        {
            for(row=1;row<=x-line;row++)
                System.out.print(" ");
            for(num=2;num<=line*2;num++)
                System.out.print(num-1);
            System.out.println();
        }
        
    }
}