import java.util.Scanner;

public class Lab6P12
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
                if(num==2 || num==line*2)
            {
                System.out.print(num-1);
            }
            else
            {
                System.out.print(" ");
            }
            System.out.println();
        } 
        for(line=x-1;line>=1;line--)
        {
            for(row=x-line;row>=1;row--)
                System.out.print(" ");
            for(num=2;num<=line*2;num++)
                if(num==2 || num==line*2)
            {
                System.out.print(num-1);
            }
            else
            {
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}