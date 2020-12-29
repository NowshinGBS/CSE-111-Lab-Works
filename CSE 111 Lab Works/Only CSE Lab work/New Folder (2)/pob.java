import java.util.Scanner;
public class pob
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter line number");
        int line=sc.nextInt();
        
        int linecount=1;
        while(linecount<=line)
        {
            int pluscount=1;
            while(pluscount<=line-linecount)
            {
              System.out.print("+");
              pluscount++;
            }
            int colcount=1;
            while(colcount<=line)
            {
                System.out.print("*");
                colcount++;
            }
        
            System.out.println();
            linecount++;
        }
     
        }   
    }


