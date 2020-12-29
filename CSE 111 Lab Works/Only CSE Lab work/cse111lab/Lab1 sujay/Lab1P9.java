    import java.util.Scanner;
    
    public class Lab1P9
    {
        public static void main(String[]args)
        {
            Scanner mum = new Scanner(System.in);
            int x,line,row;
            x=mum.nextInt();
            for(line=x;line>=1;line--)
            {
                for(row=1;row<=x;row++)
                    if(row==line || line==1 || row==x)
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