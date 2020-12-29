import java.util.Scanner;
public class Task19
{public static void main (String [] args)
  {
  Scanner k=new Scanner(System.in);
  int [] marks=new int[] {20,30,10,50,40};
  int max=marks[0];
  int min=marks[0];
  int sum=marks[0];
  
  for(int c=0;c<marks.length;c++)
  {
    if(max<marks[c])
    {
      max=marks[c];
    }
    else if(min>marks[c])
    {
      min=marks[c];
    }
    sum=sum+marks[c];
  }
  int avg=sum/marks.length;
  System.out.println("max is " + max + " min is "+min+ " avg is " +avg);
}
}