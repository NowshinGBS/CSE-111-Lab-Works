import java.util.Scanner;
public class Lab03Task04
{
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    int [] a=new int [91];
    int x;
     System.out.println("Type a word");
    String s=sc.nextLine();
    for(int v=0;v<s.length();v++)
    {
      x = s.codePointAt(v);
           a[x]=a[x]+1;
    }
    for(int i=65;i<=90;i++)
    {
      System.out.println((char)i+" which is "+i+" was found "+a[i]+" times");
    }
  }
}
                         
 