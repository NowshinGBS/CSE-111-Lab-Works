import java.util.Scanner;

public class Lab8T5
{
    public static void main(String[]args)
    {
        Scanner k = new Scanner(System.in);
        int a[];
        a=new int[10];
        for(int c=0;c<a.length;c++)
        {
            System.out.println("Type a number");
            a[c]=k.nextInt();
        }
        System.out.println("Type another number");
        int x=k.nextInt();
        int w=0;
        for(int d=0;d<a.length;d++)
        {
            if(a[d]==x)
            {
                w=w+1;
            }
        }
        if(w==0)
        {
            System.out.println("No");
        }
        else
        {
            System.out.println("Yes");
        }
    }
}