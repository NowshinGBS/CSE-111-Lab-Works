import java.util.Scanner;
public class Lab7task5
{
    public static void main(String[]args)
    {
        Scanner k =new Scanner(System.in);
        int []a=new int[10];
        int count=0;
        while(count<a.length)
        {
            System.out.println("type");
            a[count]=k.nextInt();
            count++;
        }

        int i=a.length-1;
        while(i>0)
        {
            if(a[i]%2!=0)
            {System.out.println("last odd number is "+ a[i]);
            break;
            }
            i--;
        }
    }
}