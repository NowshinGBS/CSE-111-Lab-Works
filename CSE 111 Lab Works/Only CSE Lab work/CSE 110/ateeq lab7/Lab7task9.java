import java.util.Scanner;
public class Lab7taask9
{
    public static void main(String[]args)
    {
        Scanner k=new Scanner(System.in);
        int []a=new int[5];
        int count=0;
        while(count<a.length)
        {
            System.out.println("type");
            a[count]=k.nextInt();
            count++;
        }
        
        int max=a[0];
        int min=a[0];
        int maxloc=0;
        int minloc=0;
        int i=0;
        while(i<a.length)
        {
            if(a[i]>max)
            {
                max=a[i];
                maxloc=i;
            }
            if(a[i]<min)
            {
                min=a[i];
                minloc=i;
            }
            i++;
        }
        System.out.println("smallest number is "+min+" was found at "+minloc);
        System.out.println("largest number is "+max+" was found at "+maxloc);
        
    }
}