import java.util.*;
public class Lab08Task05
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    int[] a = new int[5];
    //input to array
    int loopcount=0;
    while(loopcount<a.length)
    {
      a[loopcount]=sc.nextInt();
      loopcount++;
     
    }
    System.out.println("Please enter a number");
    int x=sc.nextInt();
    int i= 0;
    int found=0;
    while(i<a.length)
    {
      if(a[i]==x)
      {
      found=1;
    }
    i++;
      
    }
   
      if(found==1)
      {
      System.out.println("Yes");
      }
      else
      {
        System.out.println("No");
      }
    }
  }

