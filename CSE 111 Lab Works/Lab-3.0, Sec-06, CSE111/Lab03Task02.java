import java.util.Scanner;
public class Lab03Task02
{
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("Type a word");
    String s=sc.nextLine();
    char [] a=s.toCharArray();
    for(int v=0;v<a.length;v++)
    {
      System.out.println(a[v]);
    }
  }
}