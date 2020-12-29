import java.util.Scanner;
public class Lab7task2
{
    public static void main(String[]args)
    {
        Scanner k =new Scanner(System.in);
        int []a=new int[5];
        int count=0;
        while(count<a.length)
        {
            System.out.println("type");
            a[count]=k.nextInt();
            count++;
        }
        
        
        System.out.println("type serial number");
        int i=k.nextInt();
        System.out.println(a[i]);
    }
}
        