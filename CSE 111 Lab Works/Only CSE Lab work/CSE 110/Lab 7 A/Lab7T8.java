import java.util.Scanner;

public class Lab7T8
{
    public static void main(String[]args)
    {
        Scanner k = new Scanner(System.in);
        int a[],max,c,d,maxpo;
        a= new int[5];
        for(c=0;c<=a.length-1;c++)
        {
            System.out.println("Type a number");
            a[c]=k.nextInt();
        }
        max=a[0];
        maxpo=0;
        for(d=0;d<=a.length-1;d++)
        {
            if(max<a[d])
            {
                max=a[d];
                maxpo=d;
            }
        }
        System.out.println("Largest number " + max +" was found at location " +maxpo);
    }
}