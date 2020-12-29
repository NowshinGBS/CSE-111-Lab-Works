    import java.util.Scanner;
    
    
    public class Lab1P3
    {
        public static void main(String[]args)
        {
           Scanner nun = new Scanner(System.in);
           int x,y,line;
           System.out.println("Type a number");
           line=nun.nextInt();
           for(x=1;x<=line;x++)
           {
               for(y=1;y<=line;y++)
                   if(y>x)
               {
                   System.out.print(" ");
               }
               else
               {
                   System.out.print("*");
               }
               System.out.println();
           }
        }
    }