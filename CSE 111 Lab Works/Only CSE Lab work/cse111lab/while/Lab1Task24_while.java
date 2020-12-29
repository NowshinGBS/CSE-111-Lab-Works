import java.util.Scanner;

public class Lab1Task24_while
{
    public static void main(String[]args)
    {
        Scanner fr = new Scanner(System.in);
        int x=fr.nextInt();
        int i=1;
        while(i<=x)
            System.out.print(i);
       i++;
        
        int j=x-1;
        while(j>=1)
            System.out.print(j);
        j--;
        System.out.println(); 
        
    }
    
}