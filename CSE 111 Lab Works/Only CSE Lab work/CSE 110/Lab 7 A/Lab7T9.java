import java.util.Scanner;

public class Lab7T9
{
    public static void main(String[]args)
    {
        Scanner k = new Scanner(System.in);
        int a[],max,c,d,maxpo,min,minpo;
        a= new int[5];
        for(c=0;c<=a.length-1;c++)
        {
            System.out.println("Type a number");
            a[c]=k.nextInt();
        }
        max=a[0];
        maxpo=0;
        min=a[0];
        minpo=0;
        for(d=0;d<=a.length-1;d++)
        {
            if(max<a[d])
            {
                max=a[d];
                maxpo=d;
            }
            if(min>a[d])
            {
                min=a[d];
                minpo=d;
            }
        }
        System.out.println("Smallest number " + min +" was found at location " +minpo);
        System.out.println("Largest number " + max +" was found at location " +maxpo);
    }
}