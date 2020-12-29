    import java.util.Scanner;
    
    public class Lab6P22
    {
        public static void main(String[]args)
        {
            Scanner mum = new Scanner(System.in);
            int x,line,row;
            x=mum.nextInt();
            for(line=1;line<=x;line++)
            {
                for(row=1;row<=x;row++)
                    if(line==row || row==1 || line==x)
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