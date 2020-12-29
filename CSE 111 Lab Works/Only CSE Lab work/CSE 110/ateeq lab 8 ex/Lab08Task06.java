import java.util.*;
public class Lab08Task06
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    int[] a = new int[10];
    //input to array
    int loopcount=0;
    while(loopcount<15)
    {
      int num=sc.nextInt();
      a[num]= a[num]+1;
      loopcount++;
     
    }
    int i=0;
      while(i<10)
    {
      System.out.println(a[i] +  " times "  + i );
        i++;
    }
    
 }
}