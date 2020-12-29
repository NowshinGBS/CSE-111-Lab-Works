import java.util.Scanner;
public class Lab03Task02a
{
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("Type a word");
    String s=sc.nextLine();
    for(int v=0;v<s.length();v++)
    {
      char x=s.charAt(v);
      System.out.println(x);
    }
  }
}