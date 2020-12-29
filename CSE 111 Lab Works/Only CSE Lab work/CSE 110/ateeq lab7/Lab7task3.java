import java.util.Scanner;
public class Lab7task3
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

        int i=0;
        while(i<a.length)
        {
            if(a[i]%2!=0)
            {System.out.println("first odd number is "+ a[i]);
            break;
            }
            i++;
        }
    }
}