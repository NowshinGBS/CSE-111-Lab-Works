import java.util.Scanner;
public class Task21
{public static void main(String[] args)
  {Scanner k=new Scanner(System.in);
  
  int a[]=new int[] {40,30,20,10,50};
  int max=a[0];
  int location=0;
  
  for(int c=0;c<a.length;c++)
  { 
    if(a[c]>max)
    {
    max=a[c];
    location=c;
  }
  }
  System.out.println("max is "+max+ " and location is a["+location+"]"); 
  
  }
}
  