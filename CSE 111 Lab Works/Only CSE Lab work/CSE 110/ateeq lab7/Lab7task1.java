import java.util.Scanner;
public class Lab7task1
{
    public static void main(String[]args)
    {
        Scanner k =new Scanner(System.in);
        int []a=new int[3];
        int count=0;
        int sum=0;
        while(count<a.length)
        {
            System.out.println("type");
            a[count]=k.nextInt();
            sum=sum+a[count];
            count++;
        }
        System.out.println("sum is "+sum);
        int i=0;
        while(i<a.length)
        {
            System.out.println(a[i]);
            i++;
        }
    }
}