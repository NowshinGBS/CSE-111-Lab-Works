import java.util.Scanner;
public class Task22
{public static void main(String[] args)
  {Scanner k=new Scanner(System.in);
  
  int a[]=new int[] {10,20,30,40,50};
  int max=a[0];
  int temp;
  for(int c=0;c<a.length;c++)
  {
    if(a[c]>max)
    {a[c]=max;
     a[c]=a[0];
     temp=a[c];
    }
  }
  System.out.println(a[0]);
}
}