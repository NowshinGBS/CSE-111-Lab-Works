import java.util.Scanner;
public class Task17Lab6
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter line number");
        int line=sc.nextInt();
        int linecount=1;
        while(linecount<=line)
        {
            int colcount=1;
            while(colcount<=linecount)
            {
                System.out.print("*");
                colcount++;
            }
            System.out.println();
            linecount++;
        }
    }
    
}

    