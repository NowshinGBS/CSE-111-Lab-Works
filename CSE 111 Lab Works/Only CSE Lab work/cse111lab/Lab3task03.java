import java.util.Scanner;
public class Lab3task03
{       
    public static void main(String[]args)
    {
        Scanner k=new Scanner (System.in);
        int []a=new int[5];
        for(int i=0;i<=a.length-1;i++)
        {
            System.out.println("type");
            a[i]=k.nextInt();
        }
                                                                                      
        int temp;
        for(int i=0;i<a.length-1;i++)
        {
            for(int j=i+1;j<a.length;j++)
            {
                if(a[i]<a[j])
                {
                    temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
        }
       
        for(int i=0;i<a.length;i++)
        {System.out.println(a[i]);}   
    }
}
