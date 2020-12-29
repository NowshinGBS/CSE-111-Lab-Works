import java.util.Scanner;
public class task14
{
  public static void main(String[] agrs)
  {
    Scanner k=new Scanner(System.in);
    
    System.out.println("Please enter a number");
    int n=k.nextInt();
    int l=0;
    for(int c=1;c<=n;c++)
    {
      
   if(n%c==0)
   {
    l++;}
    }
     System.out.println(l);
    
  }
}