import java.util.Scanner;
public class Lab03Task3b
{
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("Type a word");
    String s=sc.nextLine();
    char [] a=s.toCharArray();
    for(int v=0;v<a.length;v++)
    {
      System.out.print(a[v]+" : ");
      System.out.println(s.codePointAt(v));
    }
  }
}