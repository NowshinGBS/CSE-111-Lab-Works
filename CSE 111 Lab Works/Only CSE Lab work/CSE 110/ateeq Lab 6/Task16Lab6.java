import java.util.Scanner;
public class Task16Lab6
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter line number");
        int line=sc.nextInt();
        System.out.println("Please Enter col number");
        int col=sc.nextInt();
        int linecount=1;
        while(linecount<=line)
        {
            int colcount=1;
            while(colcount<=col)
            {
                System.out.print("*");
                colcount++;
            }
            System.out.println();
            linecount++;
        }
    }
    
}

    