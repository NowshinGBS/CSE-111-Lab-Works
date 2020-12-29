import java.util.Scanner;
public class Task5Lab6
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter line number");
        int line=sc.nextInt();
        int linecount=1;
        while(linecount<=line)
        {
            int spacecount=1;
            while(spacecount<=line-linecount)
            {
              System.out.print(" ");
              spacecount++;
            }
            int colcount=1;
            while(colcount<=linecount)
            {
                System.out.print(colcount);
                colcount++;
            }
            System.out.println();
            linecount++;
        }
    }
}

