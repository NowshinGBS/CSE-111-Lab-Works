import java.util.Scanner;

public class Lab8T6ex1
{
    public static void main(String[]args)
    {
        Scanner k= new Scanner (System.in);
        int a[];
        a=new int[5];
        for (int c=0;c<a.length;c++)
        {
            System.out.println("Type a number between 0-9");
            a[c]=k.nextInt();
        }
        for(int d=0;d<=9;d++)
        {
            int j=0;
            for(int g=0;g<a.length;g++)
            {
                if(a[g]==d)
                {
                    j=j+1;
                }
            }
            if(j!=0)
            {
              System.out.println(d+" was found " +j +" times");
            }
            
        }
    }
}